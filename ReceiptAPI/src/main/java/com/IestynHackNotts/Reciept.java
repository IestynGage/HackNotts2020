package com.IestynHackNotts;

import java.util.ArrayList;

public class Reciept {

    private ArrayList<Items> items;
    private Double total;

    public Reciept(ArrayList<Items> items) {
        this.items = items;

        total = items.stream()
                .mapToDouble(Items::getAmount)
                .sum();
    }

    public ArrayList<Items> getItems() {
        return items;
    }

    public void setItems(ArrayList<Items> items) {
        this.items = items;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public String toHTML(){
        StringBuilder sb = new StringBuilder();

        sb.append("<html> \n <table style=\"width:100%; border: 1px solid black\"> \n");
        sb.append(" <tr style=\"border: 1px solid black;\"> <th style=\"border: 1px solid black;\"> Name </th>" +
                "  <th style=\"border: 1px solid black;\"> Amount </th> </tr> \n");
        items.stream().forEach(item -> sb.append(item.toHTML()));
        sb.append(" </table> \n </html>");

        return sb.toString();
    }
}
