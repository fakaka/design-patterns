package com.lyt.designpatterns.prototype.example1;

import java.util.ArrayList;
import java.util.List;

public class Person implements Cloneable {
    
    private String name;
    
    private int age;
    
    private String sex;
    
    private List<String> friends;
    
    public List<String> getFriends() {
        return friends;
    }
    
    public void setFriends(List<String> friends) {
        this.friends = friends;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public String getSex() {
        return sex;
    }
    
    public void setSex(String sex) {
        this.sex = sex;
    }
    
    @Override
    public Person clone() {
        try {
            Person person = (Person) super.clone();
            List<String> newfriends = new ArrayList<>();
            for (String friend : getFriends()) {
                newfriends.add(friend);
            }
            person.setFriends(newfriends);
            return person;
        }
        catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
    
}
