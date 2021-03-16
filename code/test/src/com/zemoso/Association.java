package com.zemoso;

import java.util.ArrayList;
import java.util.List;

class College{
    String name;
    List<Teacher> teachers;

    public College(String name, List<Teacher> teachers) {
        this.name = name;
        this.teachers = teachers;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }
}

class Teacher{
    String name;
    String subject;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    @Override
    public String toString() {
        return " "+this.name + " teaches " + this.subject+"";
    }
}

public class Association {
    public static void main(String[] args) {
        List<Teacher> teachers = new ArrayList<Teacher>();
        teachers.add(new Teacher("Mani", "Java"));
        teachers.add(new Teacher("Dhruv", "Python"));
        teachers.add(new Teacher("Nitin", "HTML"));
        teachers.add(new Teacher("Vishnu", "CPP"));

        College c = new College("GITAM", teachers);
        System.out.println(c.getTeachers());

    }
}
