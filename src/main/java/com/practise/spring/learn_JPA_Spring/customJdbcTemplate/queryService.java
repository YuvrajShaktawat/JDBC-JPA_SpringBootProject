package com.practise.spring.learn_JPA_Spring.customJdbcTemplate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class queryService implements CommandLineRunner {

    @Autowired
    queryRunner queryRunner;

    public void run(String... args) throws Exception {
        queryRunner.insert(new Student(1, "Raju", "raju@xyz.com"));
        queryRunner.insert(new Student(2, "Ram", "ram@xyz.com"));
        queryRunner.insert(new Student(3, "Rahul", "rahul@xyz.com"));
        queryRunner.delete(1);
        System.out.println(queryRunner.findById(2));
        System.out.println(queryRunner.findById(3));
    }

}
