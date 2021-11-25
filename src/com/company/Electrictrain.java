package com.company;

public class Electrictrain extends Train{
    public static final int LIMIT_FUEL_FOR_ONE_TRANSFER = 25;
    int power;

    @Override
    public void fillup(int power) {
        super.fillup(power);
        System.out.println("Зарядили транспорт на " + power + " Кв");
    }
}


