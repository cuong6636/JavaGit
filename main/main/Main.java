package main;

import service.PurchaseService;

public class Main {

    public static void main(String[] args) {

        PurchaseService service = new PurchaseService();
        
        service.insertMoney();
        service.selectProduct();
    }

}