package com.springapp.mvc.model;

/**
 * Created by kimsanghwan on 5/17/2014.
 */
public class Category {

    private int id;

    private String name;

    private int genderId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGenderId() {
        return genderId;
    }

    public void setGenderId(int genderId) {
        this.genderId = genderId;
    }

}
