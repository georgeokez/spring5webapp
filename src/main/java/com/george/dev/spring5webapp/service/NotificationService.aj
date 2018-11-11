package com.george.dev.spring5webapp.service;

import java.util.Date;

public aspect NotificationService {

    private String name;
    private String email;
    private int age;
    private String descripton;
    private Date dob;
    private Date lastModified;

    public NotificationService() {
    }

    public void setInstanceVariables(String name, String email, int age, String descripton, Date dob) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.descripton = descripton;
        this.dob = dob;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDescripton() {
        return descripton;
    }

    public void setDescripton(String descripton) {
        this.descripton = descripton;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public Date getLastModified() {
        return lastModified;
    }

    public void setLastModified(Date lastModified) {
        this.lastModified = lastModified;
    }

    @Override
    public String toString() {
        return "NotificationService{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", descripton='" + descripton + '\'' +
                '}';
    }
    /**
     * This is a Java Documentation...
     */

}
