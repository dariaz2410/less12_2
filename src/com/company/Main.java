package com.company;

public class Main {

    public static void main(String[] args) {
        BankAccount boss = new BankAccount("Boss");
        BankAccount ivan = new BankAccount("Ivan");
        BankAccount alex = new BankAccount("Alex");
        BankAccount sergey = new BankAccount("Sergey");

        boss.add(10000);
        System.out.println(boss);

        boss.transfer(ivan, 1000);
        boss.transfer(alex, 1500);
        boss.transfer(sergey, 2000);

        System.out.println(ivan);
        System.out.println(alex);
        System.out.println(sergey);
        System.out.println(boss);
        System.out.println("Commission: " + Percent.getMoney());
    }
}
