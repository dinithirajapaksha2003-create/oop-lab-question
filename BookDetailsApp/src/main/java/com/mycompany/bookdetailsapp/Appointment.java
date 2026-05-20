
package com.mycompany.bookdetailsapp;


public class Appointment {
    private String patientName;
    private String appointmenttype;
    private String patientCategory;
    private double baseFee;
    
    public Appointment(String patientName,String appointmenttype,String patientCategory,double baseFee){
        this.patientName=patientName;
        this.appointmenttype=appointmenttype;
        this.patientCategory=patientCategory;
        this.baseFee=baseFee;
    }

    public String getPatientName() {
        return patientName;
    }

    public String getAppointmenttype() {
        return appointmenttype;
    }

    public String getPatientCategory() {
        return patientCategory;
    }

    public double getBaseFee() {
        return baseFee;
    }
    public double calculateFinalFee(){
        double FinalFee=baseFee;
        if(appointmenttype.equals("Specialist"))
            FinalFee+=1500;
        else if(appointmenttype.equals("Online"))
            FinalFee-=500;
        if(patientCategory.equals("Child"))
            FinalFee-=300;
        else if(patientCategory.equals("Senior"))
            FinalFee-=500;
        
        return FinalFee;
    }
    public String getAppointmentMessage(){
        return appointmenttype+"appointment selected";
    }
    
}
