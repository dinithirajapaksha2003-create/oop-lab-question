
package lab05;


public class vehicle {
    private String vehicleNumber;
    protected String brand;
    
    public vehicle(String vehicleNumber,String brand){
        this.vehicleNumber=vehicleNumber;
        this.brand=brand;
    }
    public void displayvehicleInfo(){
        System.out.println("vehicle number:"+vehicleNumber);
        System.out.println("Brand:"+brand);
    }
    public double calculateREntalCost(){
        System.out.println("General vehicle rental cost calculation ");
        return 0.0;
    }
}
