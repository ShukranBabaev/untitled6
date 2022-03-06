package com.company;

import animals.Camel;
import exceptions.TransferException;
import interfaces.Transfer;

public class Main {
    public static void main(String[] args) {
        Train train = new Train();
        try {
            train.transfer(100, "Некрасовку");
        } catch (TransferException e) {
            System.out.println(e.getMessage());
        }
        train.fillup(500);
        try {
            train.transfer(100, "Некрасовку");
        } catch (TransferException e) {
            System.out.println(e.getMessage());
        }


        Electrictrain electrictrain = new Electrictrain();
        try {
            electrictrain.transfer(70, "Пенягино");
        } catch (TransferException e) {
            System.out.println(e.getMessage());
        }
        electrictrain.fillup(300);
        try {
            electrictrain.transfer(70, "Пенягино");
        } catch (TransferException e) {
            System.out.println(e.getMessage());
        }

        Camel camel = new Camel();
        try{
            camel.transfer(5, "Некрасовка");
        }catch (TransferException e) {
            System.out.println(e.getMessage());}

        Transfer[] transfers = new Transfer[3];
        transfers[0] = new Train();
        transfers[1] = new Electrictrain();
        transfers[2] = new Camel();

        System.out.println();

   //  transferAll(2, "Египет", transfers);


        Way way1 = new Way("Nekrasovka-Kosino", 1000);
        Way way2 = new Way("Kosino-Nekrasovka", 1000);

        Priceway priceway = new Priceway(45, 65);

        Tunnel tunnel1 = new Tunnel(200);
        Tunnel tunnel2 = new Tunnel(300);
        Tunnel tunnel3 = new Tunnel(500);

        Depo depo = new Depo(15, "Lermontovsy prospekt");
    }

//    private static void transferAll(int people, String place, Transfer[] transfers) throws TransferException {
//        for (Transfer ts : transfers) {
//            ts.transfer(people, place);
//        }
//
//    }
}
