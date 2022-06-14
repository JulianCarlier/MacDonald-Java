package com.opdracht;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static java.lang.Math.round;

public class Main {

public static void main(String[] args) {
    Map<String, Double> menu = new HashMap<>();
        menu.put("hamburger", 1.99);
        menu.put("cola", 5.99);
        menu.put("sla", 15.00);
        menu.put("turbo-burger", 150.00);

    ArrayList<String> order = new ArrayList<>();
        order.add("cola");
        order.add("sla");

    // met 1 cola en 1 sla zouden de kosten 20.99 moeten zijn.
    System.out.println("totale kosten: " + totalCost(order, menu));
    }

/**
* Deze functie moet de totale kosten terug geven van een order
*/
    public static double totalCost(ArrayList<String> order, Map<String, Double> menu) {
        String orderFood;
        double orderprice = 0;
        for (int positionOrder = 0; positionOrder < order.size(); positionOrder++) {
            orderFood = order.get(positionOrder);
            orderprice = menu.get(orderFood) + orderprice;
        }
            return Math.round(orderprice);
    }
}
