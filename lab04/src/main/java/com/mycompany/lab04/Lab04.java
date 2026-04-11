package com.mycompany.lab04;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author STZ
 */
public class Lab04 {
    public static void main(String[]args){
        Lecturer lec1=new Lecturer("Dinithi Rajapaksha","PE/16","cost",5,2000.0);
        lec1.displayLectureDetails();
        System.out.println("Monthly payment:" +lec1.calculateMonthlyPayement());
    }
 }
    

