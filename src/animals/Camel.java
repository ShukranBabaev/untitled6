package animals;

import exceptions.TransferException;
import interfaces.Transfer;

public class Camel extends Animals implements Transfer {
    public Camel() {
        super(200);

    }

    @Override
    public void eat(String food) {
        System.out.println("Я доволен");


    }

    @Override
    public void transfer(int people, String place) throws TransferException {




        if (people > 4) {
            throw new TransferException("Не смогу пойти, более 3 человек на мне");


        }
            System.out.println(people + " человек везу в " + place);


        }
    }







