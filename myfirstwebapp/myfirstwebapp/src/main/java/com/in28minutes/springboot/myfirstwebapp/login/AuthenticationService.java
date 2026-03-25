package com.in28minutes.springboot.myfirstwebapp.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
    public boolean isAuthenticated(String username, String password){
        boolean nameValid = username.equalsIgnoreCase("Admin");
        boolean passwordValid = password.equalsIgnoreCase("123456");
        return nameValid && passwordValid;
    }
}
