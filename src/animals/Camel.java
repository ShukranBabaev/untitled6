package animals;

import interfaces.Transfer;

public class Camel extends Animals implements Transfer {
     public Camel(){
         super(200);

     }

    @Override
    public void eat(String food) {
       System.out.println("Я доволен");


    }

    @Override
    public void transfer(int people, String place) {
        System.out.println(people + " человек везу в " + place);
    }
}
