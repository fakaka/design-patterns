package com.lyt.designpattens.flyweight.example2;

import java.util.HashMap;
import java.util.Map;

public class TeacherFactory {
    
    private Map<String, Teacher> teachers;
    
    public TeacherFactory() {
        teachers = new HashMap<>();
    }
    
    public Teacher getTeacher(String number) {
        Teacher teacher = teachers.get(number);
        if (teacher == null) {
            teacher = new Teacher();
            teacher.setNumber(number);
            teachers.put(number, teacher);
        }
        return teacher;
    }
}
