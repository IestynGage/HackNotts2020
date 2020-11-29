package com.IestynHackNotts;

public class Items {

    private String name;
    private Double amount;

    public Items(String name, Double amount) {
        this.name = name;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String toHTML(){
        return  " <tr style=\"border: 1px solid black;\"> <th style=\"border: 1px solid black;\">" + name + "</th>" +
                "  <th style=\"border: 1px solid black;\">" + amount + "</th> </tr> \n";
    }
}
