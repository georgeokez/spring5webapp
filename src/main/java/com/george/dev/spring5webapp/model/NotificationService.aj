package com.george.dev.spring5webapp.model;

public aspect NotificationService {

    private String name;
    private String email;
    private int age;
    private String descripton;

    public NotificationService() {
    }

    public void setInstanceVariables(String name, String email, int age, String descripton) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.descripton = descripton;
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

    @Override
    public String toString() {
        return "NotificationService{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", descripton='" + descripton + '\'' +
                '}';
    }
}
