
package com.mycompany.lab7.Question2;

public class ProductBillTest {
    public static void main(String[]args){
        ProductBill obj=new ProductBill("1500.00","two");
    
    try{
     double total = obj.calculateTotal();
     System.out.println("Total="+total);
    } catch( NumberFormatException e){
     // Exception occurs because "two" is not a valid number
     System.out.println("prica and quantity must be valid");
    }finally{
     System.out.println("Product bill calculation completed");
    }
    System.out.println("Program continues...");
}
}
