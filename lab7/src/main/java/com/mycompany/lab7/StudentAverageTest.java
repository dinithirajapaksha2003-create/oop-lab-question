
package com.mycompany.lab7;


public class StudentAverageTest {
    public static void main(String[]args){
        StudentAverageCalculator obj=new StudentAverageCalculator(500,0);
        
        try {
            int average=obj.calculateAverage();
            System.out.println("Average="+average);
        }catch(ArithmeticException e){
            System.out.println("Zero error");
        }finally{
            System.out.println("Average calculation completed");
        }
        System.out.println("Program continues...");
    }
}
    

    

