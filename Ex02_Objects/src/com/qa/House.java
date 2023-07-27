package com.qa;

public class House {
    private String street;
    private String town;
    private int bedrooms;
    private int bathrooms;
    private int floors;
    private float acres;
    private int priceThousands;

    public House () {
        street = "Hucklebuck Road";
        town = "Alberton";
        bedrooms = 3;
        bathrooms = 2;
        floors = 1;
        acres = 1;
        priceThousands = 300;
    }
    public House (String street, String town, int bedrooms, int bathrooms, int floors, int acres, int priceThousands) {
        this.street = street;
        this.town = town;
        this.bedrooms = bedrooms;
        this.bathrooms = bathrooms;
        this.floors = floors;
        this.acres = acres;
        this.priceThousands = priceThousands;
    }
    public String getStreet () {
        return this.street;
    }
    public void setStreet (String street) {
        this.street = street;
    }
    public String getTown () {
        return this.town;
    }
    public void setTown (String town) {
        this.town = town;
    }
    public int getBedrooms () {
        return this.bedrooms;
    }
    public void setBedrooms (int bedrooms) {
        this.bedrooms = bedrooms;
    }
    public int getBathrooms () {
        return this.bathrooms;
    }
    public void setBathrooms (int bathrooms) {
        this.bathrooms = bathrooms;
    }
    public int getFloors () {
        return this.floors;
    }
    public void setFloors (int floors) {
        this.floors = floors;
    }
    public float getAcres () {
        return this.acres;
    }
    public void setAcres (float acres) {
        this.acres = acres;
    }
    public int getPriceThousands () {
        return this.priceThousands;
    }
    public void setPriceThousands () {
        this.priceThousands = priceThousands;
    }

    @Override
    public String toString() {
        return "This house is a " + bedrooms + " bedroom, " + bathrooms +
                " bathroom home, sitting on " + acres + " acres on " + street +
                ", " + town + ". It is currently estimates for $" + priceThousands + "k.";
    }
}
