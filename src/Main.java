import HierarchyEx2.Employee;
import HierarchyEx2.Programer;
import ProductsEx1.Cosmetics;
import ProductsEx1.Electronics;
import ProductsEx1.Fridge;
import ProductsEx1.Product;

import java.time.LocalDateTime;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        // Ex1 Product placement
        Product product =new Product(20, "chestie", "cumpara ca te va face mai jmecher", 200);
        Electronics electronics = new Electronics(20, "nume","are curent", 600, 2.3,2,5,88);
        Fridge fridge = new Fridge(800, "Coldie", "e rece", 50, 1);
        Cosmetics cosmetic = new Cosmetics(90, "beautyThing", "te face mai atragator", 1, "blue", 9);


        //Ex3 data extraction

       // Employee employee = new Employee();


        //Programer programer = new Programer(new Date(23/05/2023),"wasd","english");
    }
}