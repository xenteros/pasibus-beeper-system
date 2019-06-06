package com.github.xenteros;

import javax.swing.*;
import java.util.ArrayList;
import java.util.UUID;
import java.util.stream.Stream;

class Application {

    public static void main(String[] args) {

        Kitchen kitchen = new Kitchen();
        Giveaway giveaway = new Giveaway();
        CashDesk cashDesk = new CashDesk();

        Manager manager = new Manager(cashDesk, kitchen, giveaway);

        kitchen.setManager(manager);
        giveaway.setManager(manager);
        cashDesk.setManager(manager);

        String input = JOptionPane.showInputDialog("Co chcesz jeść?");
        System.out.println(input);

        try {
            FoodType zielsko = FoodType.valueOf(input);
            System.out.println(zielsko.getPreparationDurationMillis());
        }catch (IllegalArgumentException e) {
            System.out.println("Takie danie nie istnieje!");
        }
        FoodType frytki = FoodType.FRYTKI;
        System.out.println(frytki.getPreparationDurationMillis());
        FoodType burger = FoodType.WELL_DONE_BURGER;
        System.out.println(burger.name());

        for (FoodType value : FoodType.values()) {
            System.out.println(value);
        }

    }
}
