package com.company;

import java.util.Objects;

public abstract class Transport {

    private String type;
    private Main.Colours color;
    private int fuelTank;
    private int price;
    private double coefficientPrice;


    @Override
    public String toString() {

        return "Well well . . .  " +
                " The color of " + type + " is " + color + " it's price is " + price*coefficientPrice + " $" +
                ", fuel tank is " + fuelTank + " litres. " +
                "See you soon! ";

    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof com.company.Trolleybus)) return false;
        com.company.Trolleybus that = (com.company.Trolleybus) o;
        return getFuelTank() == that.getFuelTank() &&
                getPrice() == that.getPrice() &&
                Double.compare(that.getCoefficientPrice(), getCoefficientPrice()) == 0 &&
                getColor().equals(that.getColor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getColor(), getFuelTank(), getPrice(), getCoefficientPrice());
    }

    Main.Colours getColor(){
        return color;
    }

    protected void setColor(Main.Colours color){
        this.color = color;
    }

    int getFuelTank(){
        return fuelTank;
    }

    protected void setFuelTank(int fuelTank){
        this.fuelTank = fuelTank;
    }

    int getPrice(){
        return price;
    }

    protected void setPrice(int price){
        this.price = price;
    }

    String getType(){
        return type;
    }

    protected void setType(String type){
        this.type = type;
    }

    double getCoefficientPrice(){
        return coefficientPrice;
    }

    protected void setCoefficientPrice(double coefficientPrice){
        this.coefficientPrice = coefficientPrice;
    }


}

