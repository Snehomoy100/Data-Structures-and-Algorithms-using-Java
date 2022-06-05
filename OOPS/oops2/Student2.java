package oops2;

import oops.Student; // for importing functionalities of classes of diff packages

public class Student2 {
    public static void main(String[] args) {
        Student s1 = new Student(); // instance of the class (object)
        System.out.println(s1); // reference of the object
        s1.courseName = "Computer Science"; // accessing the props of the class 
        System.out.println(s1.courseName);
        int rollNo = s1.getRoll(10); // getters 
        System.out.println(rollNo);
        s1.setAge(21);
        System.out.println(s1.getAge());
    }
}
