/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab05;

/**
 *
 * @author STZ
 */
public class DeliveryChargeTest {
        public static void main(String[]args){
            
            DeliverChargeCalculator calculator=new DeliverChargeCalculator();
             
            double charge1=calculator.calculateCharge(200.0);
            System.out.println("Base Charge:"+charge1);
            
            double charge2=calculator.calculateCharge(200.0,5.0);
            System.out.println("with distance:"+charge2);
            
            double charge3=calculator.calculateCharge(200.0,5.0,3.0);
            System.out.println("with distance and weight:"+charge3);
            
            double charge4=calculator.calculateCharge(200.0,true);
            System.out.println("with express delivery:"+charge4);
       }
    
}
/*This is compile time polymorphism because the compiler desides which 
calculateCharge() method to call based on the number,type,and order of arguments passed.
*/
