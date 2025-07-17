package com.practise.spring.learn_JPA_Spring.customJdbcTemplate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class queryRunner {

    @Autowired
    private JdbcTemplate springJdbcTemplate;

    String insert_query = """
            insert into students (id, name, email)
            values(?, ?, ?);
            """;

    String delete_query = """
            delete from students where id = ?;
            """;

    String select_query = """
            select * from students where id = ?;
            """;

    public void insert() {
        springJdbcTemplate.update(insert_query);
    }

    public void insert(Student student) {
        springJdbcTemplate.update(insert_query, student.getId(), student.getName(), student.getEmail());
    }

    public void delete(long id) {
        springJdbcTemplate.update(delete_query, id);
    }

    public Student findById(long id) {
        return springJdbcTemplate.queryForObject(select_query, new BeanPropertyRowMapper<>(Student.class), id);
    }

}
