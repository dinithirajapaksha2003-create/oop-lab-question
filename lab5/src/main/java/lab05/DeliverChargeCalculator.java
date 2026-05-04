/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab05;

/**
 *
 * @author STZ
 */
public class DeliverChargeCalculator {
    public double calculateCharge(double baseCharge){
        return baseCharge;
    }
    public double calculateCharge(double baseCharge,double distanceKm){
        double distanceCharge=distanceKm*100.0;
        return baseCharge+distanceCharge;
    }
    public double calculateCharge(double baseCharge,double distanceKm,double weightKg){
        double weightCharge=weightKg*50.0;
        double distanceCharge=distanceKm*100.0;
        return baseCharge+distanceCharge+weightCharge;
    }
    public double calculateCharge(double baseCharge,boolean expressDelivery){
        if (expressDelivery){
            return baseCharge+500.0;
        }
        return baseCharge;
        }
    }

