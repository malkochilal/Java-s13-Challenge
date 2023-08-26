package com.workintech.employeeApp.enums;

public enum Plan {
    BASIC("BASIC",1000),
    NORMAL("NORMAL",3000),
    ADVANCED("ADVANCED",5000);

    private String name;
    private int price;

   //constructora access modify yazmadık çünkü enuma özel
    Plan(String name,int price){
        this.name=name;
        this.price=price;
    }
    public String getName(){
        return name;
    }
    public int getPrice(){
        return price;
    }
}
