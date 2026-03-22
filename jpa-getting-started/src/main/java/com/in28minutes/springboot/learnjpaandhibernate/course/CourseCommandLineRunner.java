package com.in28minutes.springboot.learnjpaandhibernate.course;

import com.in28minutes.springboot.learnjpaandhibernate.course.jdbc.CourseJdbcRepository;
import com.in28minutes.springboot.learnjpaandhibernate.course.jpa.CourseJpaRepository;
import com.in28minutes.springboot.learnjpaandhibernate.course.springdatajpa.CourseSpringDataJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {
//    @Autowired
//    private CourseJdbcRepository repository;

//    @Autowired
//    private CourseJpaRepository repository;

    @Autowired
    private CourseSpringDataJpaRepository repository;

    @Override
    public void run(String... args) throws Exception {
//        repository.insert(new Course(1,"Learn Backend", "Coursera"));
//        repository.insert(new Course(2, "Learn AI", "Udemy"));
//        repository.insert(new Course(3, "Learn Spring Boot", "DEV.IO"));

        repository.save(new Course(1,"Learn Backend", "Coursera"));
        repository.save(new Course(2, "Learn AI", "Udemy"));
        repository.save(new Course(3, "Learn Spring Boot", "DEV.IO Spring Jpa"));

//        repository.delete(1);
        repository.deleteById(1l);

        System.out.println(repository.findById(2l));
        System.out.println(repository.findById(3l));
    }
}
