package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

            Pizza p = new Pizza(false);
            DeluxPizza p2 = new DeluxPizza(true);

            p.getBill();

            p.addExtraCheese();
            p.addExtraToppings();
            p.addExtraCheese();
            p.takeAway();
            p.getBill();

            p2.getBill();
        }

    }

