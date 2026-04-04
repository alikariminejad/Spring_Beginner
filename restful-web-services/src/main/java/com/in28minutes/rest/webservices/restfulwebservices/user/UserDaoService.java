package com.in28minutes.rest.webservices.restfulwebservices.user;


import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Component
public class UserDaoService {

    private static List<User> users = new ArrayList<>();

    static {
        users.add(new User(1, "Ali", LocalDate.now().minusYears(28)));
        users.add(new User(2, "Aref",  LocalDate.now().minusYears(34)));
        users.add(new User(3, "Hamed", LocalDate.now().minusYears(28)));
    }

    public List<User> findAll(){
        return users;
    }
}
