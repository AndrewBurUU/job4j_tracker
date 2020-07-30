package ru.job4j.pojo;

import java.util.Arrays;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFio("Andrew Ki");
        student.setGroup("JJ1");
        student.setAdmissiondate("20.06.20");

        System.out.println("Student: " + student.getFio() + ". Group № " +
                student.getGroup() + ". Admission date: "+student.getAdmissiondate());
    }
}
