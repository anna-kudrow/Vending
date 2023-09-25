package ru.Geekbrains.Lesson1;

import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {

        Product product1 = new Product("AQUA","Bottle of water (1)", 200);
//        product1.name = "Bottle of water (1)";
//        product1.brand = "Aqua";
//        product1.price = 200;
//
//        product1.setPrice(290);
//
//        System.out.println(product1.displayInfo());
//
//
//        Product product2 = new Product();
//        System.out.println(product2.displayInfo());
//
//        Product product3 = new Product("Bottle of water (3)", 150);
//        System.out.println(product3.displayInfo());
//
//
//        Product product4 = new Product("Bottle of water (4)");
//        System.out.println(product4.displayInfo());
//
//
//        Product bottleOfWater =
//                new BottleOfWater("AQUA", "Bottle of water (5)", 250, 1.5);
//        System.out.println(bottleOfWater.displayInfo());
//
//        Product bottleOfMilk1 =
//                new BottleOfMilk("MUMU", "Bottle of milk (1)", 310, 0.5,15 );
//        System.out.println(bottleOfMilk1.displayInfo());
//
//        Product bottleOfMilk2 =
//                new BottleOfMilk("MUMU", "Bottle of milk (1)", 330, 0.5,15 );
//        System.out.println(bottleOfMilk2.displayInfo());
//
//        Product bottleOfMilk3 =
//                new BottleOfMilk("MUMU", "Bottle of milk (1)", 340, 0.5,15 );
//        System.out.println(bottleOfMilk3.displayInfo());
//
//        Product bottleOfMilk4 =
//                new BottleOfMilk("MUMU", "Bottle of milk (1)", 350, 0.5,15 );
//        System.out.println(bottleOfMilk4.displayInfo());
//
//
//        ArrayList<Product> products = new ArrayList<>();
//        products.add(bottleOfMilk1);
//        products.add(bottleOfMilk2);
//        products.add(bottleOfMilk3);
//        products.add(bottleOfMilk4);
//
//
//        VendingMachine vendingMachine = new VendingMachine(products);
//
//        BottleOfMilk bottleOfMilk = vendingMachine.getBottleOfMilk(0.5,15);
//        if (bottleOfMilk == null){
//            System.out.println("There is no such bottle");
//        }
//        else {
//            System.out.println("You bought:");
//            System.out.println(bottleOfMilk.displayInfo());
//        }


//-----------------------------------------------------------------------



        ArrayList<Product> products2 = new ArrayList<>();
        HotDrinksMachine drinksMachine = new HotDrinksMachine(products2);


        Product tea1 = new HotDrink("Nestea", "Winter tea (1)", 400, 60, 300);
        System.out.println(tea1.displayInfo());

        Product coffee1 = new HotDrink("Nescaffe", "Cappuchino",200, 50, 350);
        System.out.println(coffee1.displayInfo());

        Product coffee2 = new HotDrink("Nescaffe", "Americano", 300, 65, 270);
        System.out.println(coffee2.displayInfo());

        Product coffee3 = new HotDrink("Nescaffe", "Espresso", 100, 60, 250);
        System.out.println(coffee3.displayInfo());


        products2.add(tea1);
        products2.add(coffee1);
        products2.add(coffee2);
        products2.add(coffee3);

        HotDrink hotDrink = drinksMachine.getHotDrink("Americano", 300, 65);
        if (hotDrink == null){
            System.out.println("There is no such drink");
        }
        else {
            System.out.println("You bought:");
            System.out.println(hotDrink.displayInfo());
        }
    }
}

