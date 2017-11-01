package com.lyt.designpattens.flyweight.example2;

public class Test {
    
    public static void main(String[] args) {
        TeacherFactory factory = new TeacherFactory();
        Teacher teacher1 = factory.getTeacher("0102034");
        Teacher teacher2 = factory.getTeacher("0102035");
        Teacher teacher3 = factory.getTeacher("0102034");
        Teacher teacher4 = factory.getTeacher("0102037");
        
        System.out.println(teacher1.getNumber());
        System.out.println(teacher2.getNumber());
        System.out.println(teacher3.getNumber());
        System.out.println(teacher4.getNumber());
        
        System.out.println(teacher1 == teacher3);
    }
}
