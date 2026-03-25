package com.in28minutes.springboot.myfirstwebapp.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;


@Controller
@SessionAttributes(names = {"name", "password"})
public class LoginController {

    private AuthenticationService authenticationService;

    public LoginController(AuthenticationService authenticationService) {
        this.authenticationService = authenticationService;
    }

    @RequestMapping(value = "login", method = RequestMethod.GET)
    public String login(){
        return "login";
    }

    @RequestMapping(value = "login", method = RequestMethod.POST)
    public String welcome(@RequestParam String name, @RequestParam String password,
                          ModelMap model){
        if(authenticationService.isAuthenticated(name,password)){
            model.put("name",name);
            model.put("password",password);
            return "welcome";
        }
            model.put("errorMessage", "Username or password is incorrect.");
            return "login";
    }
}
