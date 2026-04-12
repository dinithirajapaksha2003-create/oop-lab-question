package com.mycompany.lab04;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author STZ
 */
public abstract class StaffMember {
    private String fullName;
    private final String staffId;
    protected String department;
    private static int staffCount=0;
    //staffCount is static because it is shared by all instances
    
    public StaffMember(String fullName,String staffId,String department){
        this.fullName=fullName;
        this.staffId=staffId;
        this.department=department;
        staffCount++;
    }

    public static int getStaffCount() {
        return staffCount;
    }

    public String getStaffId() {
        return staffId;
    }

    public String getDepartment() {
        return department;
    }
    public String getfullName(){
        return fullName;
    }
        
    public final void displayBasicDetails(){
        System.out.println("Name: "+ fullName);
        System.out.println("Staff ID: "+ staffId);
        System.out.println("Department: "+ department);
    }
    public static void showSystemName(){
        System.out.println("University staff");
    }
    abstract double calculateMonthlyPayement();
    public void changeDepartment(String newDepartment) {
        if (newDepartment != null && !newDepartment.isEmpty()) {
            this.department = newDepartment;
        }
    }

    public final void showCommonNotice() {
        System.out.println("Notice: All staff must follow university policies.");
    }
}
/* StaffMember is abstract because it represents a general concept
and should not be directly instantiated*/
    

