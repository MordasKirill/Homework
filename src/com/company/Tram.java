package com.company;

import java.util.Objects;

public  class Tram extends Transport{

    private String type;
    private Main.Colours color;
    private int capacity;
    private int price;
    private double coefficientPrice;

    @Override
    public String toString() {

        return "Well well . . .  " +
                " The color of " + type +"is " + color + " it's price is " + price*coefficientPrice + " $" +
                ", its capacity is " + capacity + " passengers. " +
                "See you soon! ";

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Tram)) return false;
        Tram that = (Tram) o;
        return getFuelTank() == that.getFuelTank() &&
                getPrice() == that.getPrice() &&
                Double.compare(that.getCoefficientPrice(), getCoefficientPrice()) == 0 &&
                getColor().equals(that.getColor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getColor(), getFuelTank(), getPrice(), getCoefficientPrice());
    }

    private Main.Colours getColor(){
        return color;
    }

    protected void setColor(Main.Colours color){
        this.color = color;
    }

    private int getFuelTank(){
        return capacity;
    }

    protected void setFuelTank(int fuelTank){
        this.capacity = fuelTank;
    }

    private int getPrice(){
        return price;
    }

    protected void setPrice(int price){
        this.price = price;
    }

    private double getCoefficientPrice(){
        return coefficientPrice;
    }

    protected void setCoefficientPrice(double coefficientPrice){
        this.coefficientPrice = coefficientPrice;
    }


}