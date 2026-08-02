
//TODO: write if-else-if-else with:
// - declare int myMoney
// - declare int phonePrice
// logic: if you have more money TWICE that phone costs -> credit it.
// If THRICE money of phone price -> buy it



package org.prog.session2;

public class Homework {
    public static void main(String[] args) {
        int myMoney = 15000;
        int phonePrice = 5000;
        if (myMoney >= phonePrice * 3) {
            System.out.println("I have enough money. I need to buy a phone.");
        } else if (myMoney >= phonePrice * 2) {
            System.out.println("I don't have enough money, so I need to buy a phone on credit.");
        } else {
            System.out.println("I don't have enough money to buy a phone or get one on credit.");
        }
    }
}
