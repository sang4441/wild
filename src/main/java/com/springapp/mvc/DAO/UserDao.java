package com.springapp.mvc.DAO;

import com.springapp.mvc.model.Category;
import com.springapp.mvc.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;

public class UserDao {
    @Autowired
    DataSource dataSource;

    public List<User> findAllUsers() {

        String sql = "SELECT users.*, ad.province, ad.city, ad.street1, ad.street2, ad.postal_code, roles.role, genders.gender  FROM users\n" +
                "left join addresses as ad on users.address_id = ad.id\n" +
                "left join roles on roles.id = users.role_id\n" +
                "left join genders on genders.id = users.gender_id;";

        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

        List<User> users  = jdbcTemplate.query(
                sql,new BeanPropertyRowMapper(User.class));
        return users;
    }
}
