package com.in28minutes.springboot.myfirstwebapp.todo;

import jakarta.validation.Valid;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.time.LocalDate;
import java.util.List;

@Controller
@SessionAttributes(names = {"name", "password"})
public class TodoControllerJpa {

    public TodoControllerJpa(TodoRepository todoRepository) {

        this.todoRepository = todoRepository;
    }

    private TodoRepository todoRepository;


    @RequestMapping("todo-list")
    public String todoList(ModelMap model) {
        String username = (String) getLoggedinUsername(model);
        List allTodos = todoRepository.findByUsername(username);
        model.addAttribute("todos", allTodos);
        return "todoList";
    }

    private String getLoggedinUsername(ModelMap model) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        return authentication.getName();
    }

    @RequestMapping(value = "add-todo", method = RequestMethod.GET)
    public String showAddTodoForm(ModelMap model) {
        String username = (String) getLoggedinUsername(model);
        Todo todo = new Todo(0, username, "",  LocalDate.now().plusYears(1), false);
        model.put("todo", todo);
        return "addTodo";
    }

    @RequestMapping(value = "add-todo", method = RequestMethod.POST)
    public String AddTodo(ModelMap model, @Valid Todo todo, BindingResult result) {
        if (result.hasErrors()){
            return "addTodo";
        }
        String username = (String) getLoggedinUsername(model);
        todo.setUsername(username);
        todoRepository.save(todo);
        return "redirect:todo-list";
    }

    @RequestMapping("delete-todo")
    public String deleteTodo(@RequestParam int id) {
        todoRepository.deleteById(id);
        return "redirect:todo-list";
    }

    @RequestMapping("update-todo")
    public String showUpdateTodoPage(@RequestParam int id, ModelMap model) {
        Todo todo = todoRepository.findById(id).get();
        model.addAttribute("todo", todo);
        return "addTodo";
    }
    @RequestMapping(value = "update-todo", method = RequestMethod.POST)
    public String updateTodo(ModelMap model, @Valid Todo todo,  BindingResult result) {
        if (result.hasErrors()){
            return "addTodo";
        }
        String username = (String) getLoggedinUsername(model);
        todo.setUsername(username);
        todoRepository.save(todo);
        return "redirect:todo-list";
    }
}
