package com.student;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        School school = new School("My School");
        Department depo = new Department("Information Technology");
        List<Subject>  subjects = new ArrayList<>();

        school.setName("vayu sena vidhyalaya, pune");

        depo.setName("CS");





        Teacher teacher = new Teacher("jeet",90990,"marathi");
        teacher.setSubjectTaught("french");
        teacher.setName("Vishwajeet Chavan");
        teacher.setId(20302);
        teacher.setSubjectTaught("Militry tactics");

        Student std1= new Student("tatya",12);
        Student std2= new Student("satyen",2);
        std1.setName("pruthvi tatya");
        std1.setRollNumber(12);
        std2.setName("Satya");
        std2.setRollNumber(10);

       NonTeaching workmen1 = new NonTeaching("shinde",1212,"account");
        NonTeaching workmen2 = new NonTeaching("",1,"");

       workmen2.setName("raghu dhok");
       workmen2.setId(1234);
       workmen2.setRole("Fees collection");





        // Output
    System.out.println("School Name: " + school.getName());
        System.out.println("Teacher " +" Name:"+ teacher.getName() + "  ID:"+teacher.getId()+"   Subject:  " + teacher.getSubjectTaught());
        System.out.println("Student 1 " +" Name:"+ std1.getName() + "  Roll:"+std1.getRollNumber());
        System.out.println("Student 2 " +" Name:"+ std2.getName() + "  Roll:"+std2.getRollNumber());
        System.out.println("Non teaching staff:"   + workmen1.getName()+"\n"+workmen1.getId()+"\n"+workmen1.getRole());
        System.out.println("Non teaching staff:"   + workmen2.getName()+"\n"+workmen2.getId()+"\n"+workmen2.getRole());

    }}
