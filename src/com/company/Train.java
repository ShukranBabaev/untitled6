package com.company;

import exceptions.TransferException;
import interfaces.Transfer;

public class Train implements Transfer {
      public static final int LIMIT_FUEL_FOR_ONE_TRANSFER = 50;
      int tankLiters;

      public void transfer(int people, String place) throws TransferException {

            if (tankLiters < LIMIT_FUEL_FOR_ONE_TRANSFER) {
                 throw new TransferException("Недостаточно топлива для поездки в - " + place);
            }

            System.out.println(people + " человек отправилось в " + place);
                   tankLiters -= LIMIT_FUEL_FOR_ONE_TRANSFER;


            }
            public void fillup (int litters){

                   tankLiters += litters;
                   System.out.println("Заправили транспорт на " + litters + " литров");
            }

}










