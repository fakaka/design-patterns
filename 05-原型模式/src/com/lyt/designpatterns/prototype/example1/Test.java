package com.lyt.designpatterns.prototype.example1;

import java.util.ArrayList;
import java.util.List;

public class Test {
    
    public static void main(String[] args) {
        // Person person1 = new Person();
        // person1.setName("lifengxing");
        // person1.setAge(30);
        // person1.setSex("��");
        //
        //// Person person2 = person1;
        // Person person2 = person1.clone();
        //
        // System.out.println(person1.getName());
        // System.out.println(person1.getAge());
        // System.out.println(person1.getSex());
        //
        // System.out.println(person2.getName());
        // System.out.println(person2.getAge());
        // System.out.println(person2.getSex());
        
        Person person1 = new Person();
        List<String> friends = new ArrayList<>();
        friends.add("James");
        friends.add("Yao");
        
        person1.setFriends(friends);
        
        Person person2 = person1.clone();
        
        System.out.println(person1.getFriends());
        System.out.println(person2.getFriends());
        
        friends.add("Mike");
        person1.setFriends(friends);
        System.out.println(person1.getFriends());
        System.out.println(person2.getFriends());
    }
}
