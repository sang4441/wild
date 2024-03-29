package com.springapp.mvc.controller.JSON;

import com.springapp.mvc.DAO.ItemDao;
import com.springapp.mvc.DAO.UserDao;
import com.springapp.mvc.model.Item;
import com.springapp.mvc.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/json")
public class JSONController {

    @Autowired
    ItemDao itemDao;

    @Autowired
    UserDao userDao;

    @RequestMapping(value="/product", method = RequestMethod.GET)
    public @ResponseBody
    List<Item> productInJSON() {

        List<Item> items = itemDao.findAllItems();
        return items;
    }

    @RequestMapping(value="/user", method = RequestMethod.GET)
    public @ResponseBody
    List<User> userInJSON() {

        List<User> users = userDao.findAllUsers();
        return users;
    }

}