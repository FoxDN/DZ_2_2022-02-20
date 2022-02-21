package com.app;

public class Main {

    public static void main(String[] args) {
	// write your code here
    CarOfWarehouse firstCar = new CarOfWarehouse();
        firstCar.carBrand = "ZAZ";
        firstCar.carName = "Tavrija";
        firstCar.carPrice = 1000;
        firstCar.carQuantity=10;

        CarOfWarehouse secondCar = new CarOfWarehouse();
        secondCar.carBrand = "BMV";
        secondCar.carName = "X10";
        secondCar.carPrice = 100000;
        secondCar.carQuantity=5;

        System.out.println("Приветствую Вас в нашем автосалоне, представьтесь");
        IdentityCard firstPerson = new IdentityCard();
        firstPerson.name = "Mitya";
        firstPerson.age = 37;
        firstPerson.cash=10000;
        firstPerson.creditAcept=false;

        System.out.println("Приветст я " + firstPerson.name);

        if (firstPerson.age>=18) {
            System.out.println("Смотрю вы уже совершеннолетний, пройдёмте выбирать машину");

            if (firstPerson.cash >=firstCar.carPrice){
                System.out.println("хороший выбор, пойдёмте оформляться");
                }
                    else {
                System.out.println("сожалею, у вас недостаточно средст, попробуем оформить кредит");
                        if (firstPerson.creditAcept){
                            System.out.println("Здорово, пойдёмте оформлять кредит, можем оформить на 3 года");
                            // расчёт  кредитного тела
                        }   else {
                            System.out.println("Благодарим за визит, если вы отказываетесь от кредита,\n" +
                                    "просим придти потом с деньгами.");
                        }

            }

                                } else {
            System.out.println("Смотрю вы еще не совершеннолетний, пприходите попозже,  через " + (18-firstPerson.age) +" лет");
                        }






    }
}
