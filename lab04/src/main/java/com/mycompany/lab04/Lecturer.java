package com.mycompany.lab04;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */



/**
 *
 * @author STZ
 */

 public class Lecturer extends StaffMember {
    private int courseCount;
    private double paymentPerCourse;
    
    public Lecturer(String fullName, String staffId, String department,int courseCount, double paymentPerCourse) {
        super(fullName, staffId, department);
        this.courseCount=courseCount;
        this.paymentPerCourse=paymentPerCourse;
    } 
    public double calculateMonthlyPayement() {
    return courseCount*paymentPerCourse; 
    }
    public void displayLectureDetails(){
        displayBasicDetails();
        System.out.println("Course Count: " + courseCount);
        System.out.println("Payment Per Course: " + paymentPerCourse);
    }
}
    

