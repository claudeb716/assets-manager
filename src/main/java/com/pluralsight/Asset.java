package com.pluralsight;

public class Asset {
    //Properties
    private String description;
    private String dateAcquired;
    double orginalCost;
    //Constructor
    public Asset() {
    }
    //Getters and Setters

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDateAcquired() {
        return dateAcquired;
    }

    public void setDateAcquired(String dateAcquired) {
        this.dateAcquired = dateAcquired;
    }

    public double getOrginalCost() {
        return orginalCost;
    }

    public void setOrginalCost(double orginalCost) {
        this.orginalCost = orginalCost;
    }
    // Returns original cost
    public double getValue(){
        return orginalCost;
    }
}
