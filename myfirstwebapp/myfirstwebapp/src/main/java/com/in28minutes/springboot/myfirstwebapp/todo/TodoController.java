package com.in28minutes.springboot.myfirstwebapp.todo;

import jakarta.validation.Valid;
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
public class TodoController {

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    TodoService todoService = new TodoService();

    @RequestMapping("todo-list")
    public String todoList(ModelMap model) {
        List allTodos = todoService.findByUsername("admin");
        model.addAttribute("todos", allTodos);
        return "todoList";
    }

    @RequestMapping(value = "add-todo", method = RequestMethod.GET)
    public String showAddTodoForm(ModelMap model) {
        String username = (String)model.get("name");
        Todo todo = new Todo(0, username, "",  LocalDate.now().plusYears(1), false);
        model.put("todo", todo);
        return "addTodo";
    }

    @RequestMapping(value = "add-todo", method = RequestMethod.POST)
    public String AddTodo(ModelMap model, @Valid Todo todo, BindingResult result) {
        if (result.hasErrors()){
            return "addTodo";
        }
        String username = (String)model.get("name");
        todoService.addTodo(username, todo.getDescription(), LocalDate.now().plusYears(1), false);
        return "redirect:todo-list";
    }

    @RequestMapping("delete-todo")
    public String deleteTodo(@RequestParam int id) {
        todoService.removeById(id);
        return "redirect:todo-list";
    }

    @RequestMapping("update-todo")
    public String showUpdateTodoPage(@RequestParam int id, ModelMap model) {
        Todo todo = todoService.findById(id);
        model.addAttribute("todo", todo);
        return "addTodo";
    }
    @RequestMapping(value = "update-todo", method = RequestMethod.POST)
    public String updateTodo(ModelMap model, @Valid Todo todo,  BindingResult result) {
        if (result.hasErrors()){
            return "addTodo";
        }
        String username = (String)model.get("name");
        todo.setUsername(username);
        todoService.updateTodo(todo);
        return "redirect:todo-list";
    }
}
