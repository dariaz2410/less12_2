package com.company;

public class BankAccount {
    private String name;
    private double money;

    public BankAccount(String name) {
        this.name = name;
    }

    // 0.5% commission
    public void add(double money) {
        double percent = money * 0.005;
        Percent.BankPercent(percent);
        this.money += money - percent;
    }

    // 1% commission
    public void transfer(BankAccount otherPerson, double money) {
        if (money > this.money){
            throw new IllegalArgumentException("Not enough money");
        }
            double percent = money * 0.01;
        Percent.BankPercent(percent);
        this.money -= money;
        otherPerson.money += money - percent;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "name='" + name + '\'' +
                ", count=" + money +
                '}';
    }
}
