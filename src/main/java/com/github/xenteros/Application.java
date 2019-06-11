package com.github.xenteros;

import javax.swing.*;
import java.util.ArrayList;
import java.util.UUID;
import java.util.stream.Stream;

class Application {

    public static void main() {

    }

    public static void main(String[] args) {

        Kitchen kitchen = new Kitchen();
        Giveaway giveaway = new Giveaway();
        CashDesk cashDesk = new CashDesk();

        Manager manager = new Manager(cashDesk, kitchen, giveaway);

        kitchen.setManager(manager);
        giveaway.setManager(manager);
        cashDesk.setManager(manager);

        String input = JOptionPane.showInputDialog("Co chcesz jeść?");

        if (input.equalsIgnoreCase("FRYTKI") ||
                input.equalsIgnoreCase("ZIELSKO") ||
                input.equalsIgnoreCase("SERUS") ||
                input.equalsIgnoreCase("WELL_DONE_BURGER") ||
                input.equalsIgnoreCase("NACHOSY") ||
                input.equalsIgnoreCase("PASIFRYTKI") ){
            FoodType foodType = FoodType.valueOf(input);
        } else {
            //ŹLE
        }

        FoodType food = FoodType.fromStringIgnoreCase(input);



    }
}
