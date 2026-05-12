package com.pluralsight;

public class House extends Asset {
    private String address;
    private int condition;
    private int squareFoot;
    private int lotSize;
    // Constructor
    public House(String address, int condition, int squareFoot, int lotSize) {
        this.address = address;
        this.condition = condition;
        this.squareFoot = squareFoot;
        this.lotSize = lotSize;
    }
    //Getters and Setters

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCondition() {
        return condition;
    }

    public void setCondition(int condition) {
        this.condition = condition;
    }

    public int getSquareFoot() {
        return squareFoot;
    }

    public void setSquareFoot(int squareFoot) {
        this.squareFoot = squareFoot;
    }

    public int getLotSize() {
        return lotSize;
    }

    public void setLotSize(int lotSize) {
        this.lotSize = lotSize;
    }
    // Overide Parent Method
    @Override
    public double getValue(){

        if (condition == 1){
           return orginalCost = 180.00/squareFoot;
        } else if (condition == 2) {
           return orginalCost = 130.00/squareFoot;
        } else if (condition == 3) {
            return orginalCost = 90.00/squareFoot;
        } else if (condition == 4) {
            return orginalCost = 80.00/squareFoot;
        }
    }
}
