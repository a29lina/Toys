package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> win = new ArrayList<String>();

        Toys Doll = new Toys(1, "Doll", 25, 10);
        Toys Robot = new Toys(2, "Robot", 25, 7);
        Toys Car = new Toys(3, "Car", 25, 18);
        Toys Panda = new Toys(4, "Panda", 25, 11);

        for (int i = 0; i <= 46; i++){
            int a = (int) (Math.random() * 4);
            switch (a) {
                case 0:
                    if(Doll.getAmount() > 0){
                    win.add("Doll");
                    Doll.setAmount(Doll.getAmount() - 1);}
                case 1:
                    if(Robot.getAmount() > 0){
                    win.add("Robot");
                    Robot.setAmount(Robot.getAmount() - 1);}
                case 2:
                    if(Car.getAmount() > 0){
                    win.add("Car");
                    Car.setAmount(Car.getAmount() - 1);}
                case 3:
                    if(Panda.getAmount() > 0){
                    win.add("Panda");
                    Panda.setAmount(Panda.getAmount() - 1);}
            }
        }

        System.out.println(Doll.getAmount());
        System.out.println(Robot.getAmount());
        System.out.println(Car.getAmount());
        System.out.println(Panda.getAmount());

        System.out.println("The winners list: " + win);
    }

}

