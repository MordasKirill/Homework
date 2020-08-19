package com.company;

import java.util.Objects;

public  class Tram extends Transport{

    private int capacity;
    private String type;
    private Main.Colours color;
    private int price;

    @Override
    public String toString() {

        return "Well well . . .  " +
                " The color of " + type + " is " + color + " it's price is " + price + "$" +
                ", capacity is " + capacity + " passengers. " +
                "See you soon! ";

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
    Main.Colours getColor(){
        return color;
    }

    protected void setColor(Main.Colours color){
        this.color = color;
    }

    public int getCapacity(){
        return capacity;
    }

    protected void setCapacity(int capacity){
        this.capacity = capacity;
    }

}