package com.kea;

import java.util.ArrayList;

public class Cars extends Fuel implements MyInterface {
    String brand;
    public String type = "Sportsbil";
    double cruiseSpeed;

    public Cars(String brand,String type,double cruiseSpeed) {
        this.brand = brand;
        this.cruiseSpeed = cruiseSpeed;
        this.type = type;
    }

    public Cars() {
    }

    public static void main(String[] args) {
        ArrayList<Integer> myArrayList = new ArrayList<>();



    }

    public void showFuel(){
        super.listFuelTypesGetter();
    }

    public static double driveTime(double distance, double cruiseSpeed){
        return distance/cruiseSpeed*60;
    }

    public void carBlueprint(){

    }

}