package pl.mkluzniak;

import java.util.ArrayList;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        // 2D ArrayList = a dynamic list of lists
        // You can change the size of these lists during runtime

        ArrayList<ArrayList<String>> groceryList = new ArrayList(); //creating array list inside array list

        ArrayList<String> bakeryList = new ArrayList<>(); // makeing new list of bakery
        bakeryList.add("pasta");
        bakeryList.add("garlic bread");
        bakeryList.add("donuts");

        ArrayList<String> productsList = new ArrayList<>();// makeing new list of products
        productsList.add("tomatoes");
        productsList.add("zucchini");
        productsList.add("peppers");

        ArrayList<String> drinksList = new ArrayList<>(); // makeing new list of drinks
        drinksList.add("coke");
        drinksList.add("water");

        groceryList.add(bakeryList); //adding all bakery to grocery list
        groceryList.add(productsList); //adding all products to grocery list
        groceryList.add(drinksList); // adding all drinks to grocery list


        System.out.println(groceryList.get(2).get(0)); // display grocery list. Get is for display only the product what we wnt. First product is always 0


    }
}
