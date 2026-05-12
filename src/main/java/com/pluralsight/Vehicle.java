package com.pluralsight;

public class Vehicle extends Asset {
    //Properties
    private String makeModel;
    private int year;
    private int odometer;
    // Constructor

    public Vehicle(String makeModel, int year, int odometer) {
        this.makeModel = makeModel;
        this.year = year;
        this.odometer = odometer;
    }
    //Getters and Setters

    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }
    //Override getValue()
    @Override
    public double getValue(){
        if (year <= 3 && year >= 0){
            return orginalCost -= 3.0;
        } else if (year >= 4 && year <= 6) {
            return orginalCost -= 6.0;
        }else if (year >= 7 && year <= 10) {
            return orginalCost -= 8.0;
        } else if (year > 10) {
            return orginalCost = 1000.00;
        }
        return orginalCost;
    }

}
