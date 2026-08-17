package org.prog.session5;

//TODO:
// Write class Plane
// Plane must have max seats
// plane must have method board passengers
// board passengers will accept int amount of passengers to board
// if passengers to board more than seats -> write "too many passengers"
// else -> write "boarded X passengers, Y more seats remain"

public class HomeWork5 {

    public static void main(String[] args) {
        Plane plane1 = new Plane();
        plane1.boardPass(49);
    }

}

class Plane {

    int maxSeats = 50;

    void boardPass (int ticketsSold){
        if(ticketsSold>50){
            System.out.println("too many passengers");
        } else if(ticketsSold==50){
            System.out.println("Всё ОК, мы под завязку");
        } else{
            System.out.println("Всё ОК, у нас ещё "+ (maxSeats-ticketsSold) +" свободных мест");
        }
    }

}
