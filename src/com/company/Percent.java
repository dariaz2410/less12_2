package com.company;

public class Percent {
    private static double percent;

    public static void BankPercent(double percent) {
        Percent.percent += percent;
    }

    public static double getMoney() {
        return percent;
    }


}
