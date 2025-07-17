package com.practise.spring.learn_JPA_Spring.customJdbcTemplate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class queryService implements CommandLineRunner {

    // @Autowired
    // queryRunner queryRunner;

    @Autowired
    JAPRepository japRepository;

    public void run(String... args) throws Exception {
        japRepository.insert(new Student(1, "Raju", "raju@xyz.com"));
        japRepository.insert(new Student(2, "Ram", "ram@xyz.com"));
        japRepository.insert(new Student(3, "Rahul", "rahul@jpa.com"));
        japRepository.delete(1);
        System.out.println(japRepository.select(2));
        System.out.println(japRepository.select(3));
    }

}
