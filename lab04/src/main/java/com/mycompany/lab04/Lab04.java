/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab04;

/**
 *
 * @author STZ
 */
public class Lab04 {
    public static void main(String[]args){
        UniversityPolicy.showPolicyHeader();
        StaffMember.showSystemName();
        
        System.out.println("University:"+UniversityPolicy.UNIVERSITY_NAME);
        System.out.println();
        
        Lecturer lec1=new Lecturer("Dinithi Rajapaksha","PE/16","cost",5,2000.0);
        lec1.displayLectureDetails();
        System.out.println("Monthly payment:" +lec1.calculateMonthlyPayement());
        double LecturerBonus=UniversityPolicy.calculateBonus(lec1.calculateMonthlyPayement());
        System.out.println("Monthly Bonus:"+LecturerBonus);
        System.out.println();
        
        Lecturer lec2=new Lecturer("D.S. Rajapaksha","Lec2","physics",6,2000.0);
        lec2.displayLectureDetails();
        System.out.println("Monthly payment:" +lec2.calculateMonthlyPayement());
        LecturerBonus=UniversityPolicy.calculateBonus(lec2.calculateMonthlyPayement());
        System.out.println("Monthly Bonus:"+LecturerBonus);
        System.out.println();
        
        
        LabAssistant Ass1=new LabAssistant("D.C.S.Rajapaksha","Ass1","cost",240,1000.0);
        Ass1.displayLabAssistantDetails();
        System.out.println("Monthly payment:" +Ass1.calculateMonthlyPayement());
        double LabAssistantBonus=UniversityPolicy.calculateBonus(Ass1.calculateMonthlyPayement());
        System.out.println("Monthly Bonus:"+LabAssistantBonus);
        System.out.println();
        
        System.out.println("Total number of staff:"+StaffMember.getStaffCount());
        
        lec1.changeDepartment("SE");
        lec1.showCommonNotice();
        lec2.showCommonNotice();
        Ass1.showCommonNotice();
    }
}
