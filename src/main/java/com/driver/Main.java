package com.driver;

public class Main {
  public static void main(String[] args) {
    DeluxePizza dp = new DeluxePizza(true);
    //System.out.println(dp.getPrice());
    //dp.addTakeaway();
   // dp.addExtraCheese();
    dp.addTakeaway();

    System.out.println(dp.getPrice());
    System.out.println(dp.getBill());

    DeluxePizza dp2 = new DeluxePizza(false);
    // System.out.println(dp.getPrice());
    //dp.addTakeaway();
    // dp.addExtraCheese();
    dp2.addTakeaway();

    System.out.println(dp2.getPrice());
    System.out.println(dp2.getBill());

    Pizza p = new Pizza(true);
    //p.addExtraCheese();
    p.addExtraToppings();
    p.addTakeaway();
    System.out.println(p.getPrice());
    System.out.println(p.getBill());

    Pizza p2 = new Pizza(false);
    //p.addExtraCheese();
    p2.addExtraToppings();
    p2.addTakeaway();
    System.out.println(p2.getPrice());
    System.out.println(p2.getBill());
  }
}