package com.in28minutes.springboot.myfirstwebapp.todo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
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
    public String showAddTodoForm() {
        return "addTodo";
    }

    @RequestMapping(value = "add-todo", method = RequestMethod.POST)
    public String AddTodo(@RequestParam String description, ModelMap model) {
        String username = (String)model.get("name");
        todoService.addTodo(username, description, LocalDate.now().plusYears(1), false);
        return "redirect:todo-list";
    }
}
