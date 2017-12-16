package com.lyt.designpatterns.srp.example1;

public class Test {
    
    public static void main(String[] args) {
        SaveToDB std = new SaveToDB();
        std.shuru();
        if (std.validate()) {
            std.getConnection();
            std.save();
        }
    }
}
