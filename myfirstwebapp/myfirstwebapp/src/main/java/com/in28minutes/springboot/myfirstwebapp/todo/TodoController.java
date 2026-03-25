package com.in28minutes.springboot.myfirstwebapp.todo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

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
    public String AddTodo() {
        return "redirect:todo-list";
    }
}
