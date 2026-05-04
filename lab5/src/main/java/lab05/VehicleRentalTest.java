
package lab05;


public class VehicleRentalTest {
    public static void main(String[] args){
        vehicle vehicle1=new Car("CAA0044","BMW",4,4000);
        vehicle vehicle2=new Bike("AAG6529","Yamaha",3,500);
        
        System.out.println("Car Details");
        vehicle1.displayvehicleInfo();
        System.out.println("Rental Cost: " + vehicle1.calculateRentalCost());
        System.out.println();
        System.out.println("Bike Details");
        vehicle2.displayvehicleInfo();
        System.out.println("Rental Cost:" + vehicle2.calculateRentalCost());
        
    }
    // The method is chosen at runtime based on actual object type 
    
}
