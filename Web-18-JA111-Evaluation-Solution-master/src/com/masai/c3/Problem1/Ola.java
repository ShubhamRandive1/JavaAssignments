package com.masai.c3.Problem1;

public class Ola {

    public Car bookCar(int numberOfPassenger,int numberOfKMs){

        if(numberOfPassenger<=3) {
            Harchback h = new Harchback();
            h.setNumberOfKms(numberOfKMs);
            h.setNumberOfPassenger(numberOfPassenger);
            return h;
        }
        else {
            Sedan s = new Sedan();
            s.setNumberOfKms(numberOfKMs);
            s.setNumberOfPassenger(numberOfPassenger);
            return s;
        }

    }

    public int calculateFare(Car car){

        if(car instanceof Harchback){

            Harchback h=(Harchback)car;

            return h.farePerKm*h.getNumberOfKms();

        }
        else{

            Sedan s=(Sedan)car;
            
            return s.getNumberOfKms()*s.farePerKm;


        }


    }

}
class Car{

   private int numberOfPassenger;
   private int numberOfKms;


    public int getNumberOfPassenger() {
        return numberOfPassenger;
    }

    public void setNumberOfPassenger(int numberOfPassenger) {
        this.numberOfPassenger = numberOfPassenger;
    }

    public int getNumberOfKms() {
        return numberOfKms;
    }

    public void setNumberOfKms(int numberOfKms) {
        this.numberOfKms = numberOfKms;
    }
}

class Harchback extends Car{

    final int farePerKm=15;
}


class Sedan extends Car{

    final int farePerKm=20;
}


class Main{

    public static void main(String[] args) {

        Ola myOla=new Ola();
        //You need to use Scanner class to take input in this question
        Car myCar =myOla.bookCar(3,90);
        int res=myOla.calculateFare(myCar);

        System.out.println("The total fare amount is => "+res);
    }
}