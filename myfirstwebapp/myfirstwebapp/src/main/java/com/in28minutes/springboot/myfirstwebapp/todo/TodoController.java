package com.in28minutes.springboot.myfirstwebapp.todo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
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
}
