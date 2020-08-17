package com.company;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.security.InvalidParameterException;
import java.util.Scanner;


public class Main {

    enum Colours {

        WHITE,
        BLUE,
        BLACK,
        RED

    }


    public static void main(String[] args) {
        Trolleybus trolleybus = new Trolleybus();


        System.out.println("Hello, it's dispatcher of trolleybus fleet");
        System.out.println("If you want to watch some info press 0 ");
        System.out.println("Else tap 5");
        Scanner Choice = new Scanner(System.in);
        int yourChoice = Choice.nextInt();

        switch (yourChoice) {

            case 0:
                System.out.println("Ok, lets do it! \n");
                System.out.println("We have a huge variety of trolleybus, you just need to tell us \n" +
                        "what do you want! \n");
                break;

            case 5:
                System.out.println("Bye!");
                System.exit(0);
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
                    trolleybus.setColor("White");
                    trolleybus.setPrice(9000);
                    trolleybus.setSum(9000);
                    System.out.println("Your choice is White ");
                    break;

                case BLUE:
                    trolleybus.setColor("Blue");
                    trolleybus.setPrice(11000);
                    trolleybus.setSum(11000);
                    System.out.println("Your choice is Blue ");
                    break;

                case BLACK:
                    trolleybus.setColor("Black");
                    trolleybus.setPrice(15000);
                    trolleybus.setSum(15000);
                    System.out.println("Your choice is Black ");
                    break;

                case RED:
                    trolleybus.setColor("Red");
                    trolleybus.setPrice(10000);
                    trolleybus.setSum(10000);
                    System.out.println("Your choice is Red ");
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
                    System.out.println("Your choice is 100l  ");
                    trolleybus.setFuelTank(100);
                    break;

                case 150:
                    System.out.println("Your choice is 150l ");
                    trolleybus.setFuelTank(150);
                    trolleybus.setCoefficientPrice(1.2);
                    break;

                case 200:
                    System.out.println("Your choice is 200l ");
                    trolleybus.setFuelTank(200);
                    trolleybus.setCoefficientPrice(1.4);
                    break;
            }
        System.out.println(trolleybus.toString());

    }
}
