package com.springapp.mvc.DAO;

import com.springapp.mvc.model.Brand;
import com.springapp.mvc.model.Category;
import com.springapp.mvc.model.Item;
import com.springapp.mvc.model.file.MultiPartFileUploadBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import javax.sql.DataSource;
import java.io.File;
import java.util.List;

/**
 * Created by kimsanghwan on 5/17/2014.
 */
public class ItemDao {

    @Autowired
    DataSource dataSource;

    @Transactional
    public void insertItem(Item item) {

        String sql = "INSERT INTO items (id, name, price, category_id, user_id, status_id, bundle_id, brand_id, size, date_added) VALUES (null,?, ?, ?, ?, ?, ?, ?, ?, ?)";

        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

        jdbcTemplate.update(
                sql,
                new Object[] {item.getName(), item.getPrice(), item.getCategoryId(), item.getUserId(), item.getStatusId(), item.getBundleId(), item.getBrandId(), item.getSize(), item.getDateAdded()});
        int itemId = jdbcTemplate.queryForObject( "SELECT max(id) FROM items", Integer.class);

        sql = "INSERT INTO images (file_location, item_id) VALUES(?, ?)";

        for (String address : item.getImageAddress()) {
            jdbcTemplate.update(
                    sql,
                    new Object[] {address, itemId});
        }
    }

    public void updateItem(Item item) {

        String sql = "UPDATE items SET name = ?, price = ?, category_id = ?, user_id = ?, status_id = ?, bundle_id = ?, brand_id = ?," +
                "size = ?, date_added = ?) ";

        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

        jdbcTemplate.update(
                sql,
                new Object[] {item.getName(), item.getPrice(), item.getCategoryId(), item.getUserId(), item.getStatusId(), item.getBundleId(), item.getBrandId(), item.getSize(), item.getDateAdded()});

        //edit/delete images
    }


    public List<Item> findAllItems() {

            String sql = "SELECT items.*, images.file_location AS image_address, cat.name AS category, \n" +
                    "br.name AS brand_name, st.status AS status FROM items \n" +
                    "inner join images on images.item_id = items.id\n" +
                    "inner join categories AS cat on cat.id = items.category_id\n" +
                    "inner join brands AS br on br.id = items.brand_id\n" +
                    "inner join itemStatus as st on st.id = items.status_id\n";

        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

        List<Item> items  = jdbcTemplate.query(
                sql,
                new BeanPropertyRowMapper(Item.class));

        return items;
    }


    public List<Category> findAllCategories() {

        String sql = "SELECT * FROM categories";

        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

        List<Category> catetories  = jdbcTemplate.query(
                sql,new BeanPropertyRowMapper(Category.class));
        return catetories;
    }


    public List<Brand> findAllBrands() {

        String sql = "SELECT * FROM brands";

        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

        List<Brand> brands  = jdbcTemplate.query(
                sql,new BeanPropertyRowMapper(Brand.class));
        return brands;
    }
}
