package com.company;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.security.InvalidParameterException;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    enum Colours {

        WHITE,
        BLUE,
        BLACK,
        RED,
        YELLOW,
        MOON,
        ORANGE

    }
    private enum FuelTank{

        FUEL_TANK_100l(100),
        FUEL_TANK_150l(150),
        FUEL_TANK_200l(200);

        private int value;

        FuelTank(int value){

            this.value = value;

        }

    }

    protected static class MyClass {
        int fuelTank;
        int price;
        Colours colour;


        MyClass(int parsedFuelTank, Colours parsedColour, int parsedPrice) {
            fuelTank = parsedFuelTank;
            colour = parsedColour;
            price = parsedPrice;
        }
    }

    protected static class MyClassParsed {
        int capacity;
        int price;
        Colours colour;


        MyClassParsed(int parsedCapacity, Colours parsedColour, int parsedPrice) {
            capacity = parsedCapacity;
            colour = parsedColour;
            price = parsedPrice;
        }
    }

    public static void main(String[] args) {

        Trolleybus trolleybus = new Trolleybus();
        Bus bus = new Bus();
        Tram tram = new Tram();

        MyClass troll1 = new MyClass(100,Colours.MOON, 10000);
        MyClass troll2 = new MyClass(110,Colours.YELLOW, 11500);
        MyClass troll3 = new MyClass(120,Colours.ORANGE, 12500);

        MyClass bus1 = new MyClass(100,Colours.MOON, 5500);
        MyClass bus2 = new MyClass(110,Colours.YELLOW, 6500);
        MyClass bus3 = new MyClass(120,Colours.ORANGE, 8500);

        MyClassParsed tram1 = new MyClassParsed(70,Colours.MOON, 20500);
        MyClassParsed tram2 = new MyClassParsed(90,Colours.YELLOW, 23500);
        MyClassParsed tram3 = new MyClassParsed(120,Colours.ORANGE, 19500);



        System.out.println("Hello, it's dispatcher of trolleybus fleet");
        System.out.println("If you want to watch some info press 0 ");
        System.out.println("Else tap 1");
        Scanner Choice = new Scanner(System.in);
        int yourChoice = Choice.nextInt();

        switch (yourChoice) {

            case 0:
                System.out.println("Ok, lets do it! \n");
                System.out.println("We have a huge variety of trolleybus, you just need to tell us \n" +
                        "what do you want! \n");
                break;

            case 1:
                System.out.println("Bye!");
                System.exit(0);
        }
        System.out.println("You can choose a ready modification, or build your own");

        System.out.println("Tap 1 Trolleybus "+troll1.colour + " " + troll1.fuelTank +"l " +troll1.price + "$");
        System.out.println("Tap 2 Trolleybus "+troll2.colour + " " + troll2.fuelTank +"l " +troll2.price + "$");
        System.out.println("Tap 3 Trolleybus "+troll3.colour + " " + troll3.fuelTank +"l " +troll3.price + "$");

        System.out.println("Tap 4 Bus "+bus1.colour + " " + bus1.fuelTank +"l " +bus1.price + "$");
        System.out.println("Tap 5 Bus "+bus2.colour + " " + bus2.fuelTank +"l " +bus2.price + "$");
        System.out.println("Tap 6 Bus "+bus3.colour + " " + bus3.fuelTank +"l " +bus3.price + "$");

        System.out.println("Tap 7 Tram "+tram1.colour + " " + tram1.capacity +" Passengers " +tram1.price + "$");
        System.out.println("Tap 8 Tram "+tram2.colour + " " + tram2.capacity +" Passengers " +tram2.price + "$");
        System.out.println("Tap 9 Tram "+tram3.colour + " " + tram3.capacity +" Passengers " +tram3.price + "$");

        System.out.println("Tap 0 to skip ");

        int[] array = {troll1.price, troll2.price, troll3.price, bus1.price, bus2.price, bus3.price};
        for (int i = 0; i < array.length; i++) {
           // System.out.println(array[i]);
        }

        Scanner Modification = new Scanner(System.in);
        int yourModification = Modification.nextInt();

        switch (yourModification){
            case 1:
                trolleybus.setPrice(troll1.price);
                trolleybus.setColor(Colours.YELLOW);
                trolleybus.setFuelTank(troll1.fuelTank);
                trolleybus.setCoefficientPrice(1);
                trolleybus.setType("Trolleybus");
                System.out.println(trolleybus.toString());
                System.exit(0);

            case 2:
                trolleybus.setPrice(troll2.price);
                trolleybus.setColor(Colours.ORANGE);
                trolleybus.setFuelTank(troll2.fuelTank);
                trolleybus.setCoefficientPrice(1);
                trolleybus.setType("Trolleybus");
                System.out.println(trolleybus.toString());
                System.exit(0);

            case 3:
                trolleybus.setPrice(troll3.price);
                trolleybus.setColor(Colours.MOON);
                trolleybus.setFuelTank(troll3.fuelTank);
                trolleybus.setCoefficientPrice(1);
                trolleybus.setType("Trolleybus");
                System.out.println(trolleybus.toString());
                System.exit(0);
            case 4:
                bus.setPrice(bus1.price);
                bus.setColor(Colours.MOON);
                bus.setFuelTank(bus1.fuelTank);
                bus.setCoefficientPrice(1);
                bus.setType("Bus");
                System.out.println(bus.toString());
                System.exit(0);
            case 5:
                bus.setPrice(bus2.price);
                bus.setColor(Colours.YELLOW);
                bus.setFuelTank(bus2.fuelTank);
                bus.setCoefficientPrice(1);
                bus.setType("Bus");
                System.out.println(bus.toString());
                System.exit(0);
            case 6:
                bus.setPrice(bus3.price);
                bus.setColor(Colours.ORANGE);
                bus.setFuelTank(bus3.fuelTank);
                bus.setCoefficientPrice(1);
                bus.setType("Bus");
                System.out.println(bus.toString());
                System.exit(0);
            case 7:
                tram.setPrice(tram1.price);
                tram.setColor(Colours.MOON);
                tram.setFuelTank(tram1.capacity);
                tram.setCoefficientPrice(1);
                tram.setType("Tram");
                System.out.println(tram.toString());
                System.exit(0);
            case 8:
                tram.setPrice(tram2.price);
                tram.setColor(Colours.YELLOW);
                tram.setCapacity(tram2.capacity);
                tram.setCoefficientPrice(1);
                tram.setType("Tram");
                System.out.println(tram.toString());
                System.exit(0);
            case 9:
                tram.setPrice(tram3.price);
                tram.setColor(Colours.ORANGE);
                tram.setFuelTank(tram3.capacity);
                tram.setCoefficientPrice(1);
                tram.setType("Tram");
                System.out.println(tram.toString());
                System.exit(0);
            case 0:
                break;

        }
        System.out.println("Choose your color - \n" +
                "    WHITE 9000$,\n" +
                "    BLUE 11000$,\n" +
                "    BLACK 15000$,\n" +
                "    RED 10000$");

        Scanner Colour = new Scanner(System.in);
        //Colours[] allColours = Colours.values();
        String colour = Colour.nextLine();
            switch (Colours.valueOf(colour.toUpperCase())) {

                case WHITE:
                    trolleybus.setColor(Colours.WHITE);
                    trolleybus.setPrice(9000);
                    System.out.println("Your choice is: "+ Colours.WHITE);
                    break;

                case BLUE:
                    trolleybus.setColor(Colours.BLUE);
                    trolleybus.setPrice(11000);
                    System.out.println("Your choice is: "+ Colours.BLACK);
                    break;

                case BLACK:
                    trolleybus.setColor(Colours.BLACK);
                    trolleybus.setPrice(15000);
                    System.out.println("Your choice is: "+ Colours.BLACK);
                    break;

                case RED:
                    trolleybus.setColor(Colours.RED);
                    trolleybus.setPrice(10000);
                    System.out.println("Your choice is: "+ Colours.RED);
                    break;

                default:
                    System.out.println("Something bad happened, try again."); ;
                    System.exit(0);
            }

            System.out.println("Choose the fuel tank capacity\n");
            System.out.println("100l, 150l, 200l \n");
            System.out.println("There is a coefficient of value increase that depends on fuel tank, for \n" +
                    "100l is 0, for 150l is 1.2 for 200l is 1.4 \n");


            Scanner fuelTank = new Scanner(System.in);
            int yourFuelTank = fuelTank.nextInt();

            switch (yourFuelTank) {

                case 100:
                    System.out.println("Your choice is:  " + FuelTank.FUEL_TANK_100l.value + "l" );
                    trolleybus.setFuelTank(100);
                    trolleybus.setCoefficientPrice(1);
                    break;

                case 150:
                    System.out.println("Your choice is: " + FuelTank.FUEL_TANK_150l.value + "l");
                    trolleybus.setFuelTank(150);
                    trolleybus.setCoefficientPrice(1.2);
                    break;

                case 200:
                    System.out.println("Your choice is: "+ FuelTank.FUEL_TANK_200l.value + "l");
                    trolleybus.setFuelTank(200);
                    trolleybus.setCoefficientPrice(1.4);
                    break;
            }
        System.out.println(trolleybus.toString());

    }
}
