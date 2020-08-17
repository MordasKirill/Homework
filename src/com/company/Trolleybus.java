package com.company;

public  class Trolleybus {

    public String color;
    public int fuelTank;
    public int price;
    public double coefficientPrice;
    public int sum;
    @Override
    public String toString() {

        return "Well well . . .  " +
                " The color of trolleybus is " + color + " it's price is " + sum*coefficientPrice + " $" +
                ", fuel tank is " + fuelTank + " litres. " +
                "See you soon! ";

    }

    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public int getFuelTank(){
        return fuelTank;
    }

    public void setFuelTank(int fuelTank){
        this.fuelTank = fuelTank;
    }

    public int getPrice(){
        return price;
    }

    public void setPrice(int price){
        this.price = price;
    }
    public double getCoefficientPrice(){
        return coefficientPrice;
    }
    public void setCoefficientPrice(double coefficientPrice){
        this.coefficientPrice = coefficientPrice;
    }
    public int getSum(){
        return sum;
    }
    public void setSum(int sum){
        this.sum += sum;
    }
}


