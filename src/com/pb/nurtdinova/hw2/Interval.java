package com.pb.nurtdinova.hw2;

import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        int number;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите целое число:");
        number = in.nextInt();

        if (number >= 0 && number <= 14) {
            System.out.println("Промежуток 0-14");
        } else if (number >= 15 && number <= 35) {
            System.out.println("Промежуток 15-35");
        } else if (number >= 36 && number <= 50) {
            System.out.println("Промежуток 36-50");
        } else if (number >= 51 && number <= 100) {
            System.out.println("Промежуток 51-100");
        } else {
            System.out.println("Введенное число не попадает в один из имеющихся промежутков");
        }
    }
}