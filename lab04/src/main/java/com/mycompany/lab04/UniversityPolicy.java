/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab04;

/**
 *
 * @author STZ
 */
public final class UniversityPolicy {
    public static final String UNIVERSITY_NAME="UOK";
    public static final double BONUS_RATE=0.15;
    
    public static void showPolicyHeader(){
        System.out.println("University Policy");
    }
    public static double calculateBonus(double monthlyPayment){
        return monthlyPayment*BONUS_RATE;
    }
    
}
/*
A final class should not be inherited to prevent modification of importatnt system rules
*/
