package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    boolean isAddExtraCheese;
    boolean isAddExtraTopping;
    boolean isTakeaway;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg){
            this.price=300;
        }
        else if(!isVeg){
            this.price=400;
        }

    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!isAddExtraCheese){
            price+=80;
        }
        else if{
            System.out.println("Extra cheese already added");
        }
        isAddExtraCheese=true;

    }

    public void addExtraToppings(){
        // your code goes here
        if(!isAddExtraTopping && isVeg){
            price+=70;
        }else if(!isAddExtraTopping && !isVeg){
            price+=120;
        }
        isAddExtraTopping=true;
    }

    public void addTakeaway(){
        // your code goes here
        if(!isTakeaway){
            price+=20;
        }
        isTakeaway=true;
    }

    public String getBill(){
        // your code goes here
        StringBuilder sb new StringBuilder();
        if(isVeg){
            sb.append("Base price of the Pizza:").append(300).append("\n");
        }else {
            sb.append("base price of the Prizza: ").append(400).append("\n");
        }

        if(isAddExtraCheese){
            sb.append("Extra Cheese added: 80\n");
        }

        if(isVeg && isAddExtraTopping){
            sb.append("Extra Toppings added: 70\n");
        }else if(!isVeg && isAddExtraTopping){
            sb.append("Extra toppings added: 120\n");
        }
        if(isTakeaway){
            sb.append("paper bag Added: 20\n");
        }
        sb.append("Total Price: ").append(price).append("\n");

        //return this.bill;
        return sb.toString();
    }
}
