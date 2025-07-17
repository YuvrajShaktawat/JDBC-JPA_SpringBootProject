package com.practise.spring.learn_JPA_Spring.customJdbcTemplate;

import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class JAPRepository {
    @PersistenceContext
    EntityManager entityManager;
    
    public void insert(Student student) {
        entityManager.persist(student);
    }

    public void delete(int id) {
        Student student = entityManager.find(Student.class, id);
        entityManager.remove(student);
    }

    public Student select(int id) {
        return entityManager.find(Student.class, id);
    }
}
