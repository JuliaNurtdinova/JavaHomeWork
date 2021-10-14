package com.pb.nurtdinova.hw2;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int operand1;
        int operand2;
        String sign;

        Scanner in = new Scanner(System.in);

        System.out.println("Введите значение 1:");
        operand1 = in.nextInt();

        System.out.println("Введите значение 2:");
        operand2 = in.nextInt();

        System.out.println("Введите арифметический знак:");
        sign = in.next();

        switch (sign) {
            case "+":
                System.out.print("Сумма чисел = ");
                System.out.println(operand1 + operand2);
                break;
            case "-":
                System.out.print("Разница чисел = ");
                System.out.println(operand1 - operand2);
                break;
            case "*":
                System.out.print("Произведение чисел = ");
                System.out.println(operand1 * operand2);
                break;
            case "/":
                if (operand2 == 0){
                    System.out.println("Ошибка! На 0 делить нельзя!!!");
                }
                else {
                    System.out.print("Частное чисел = ");
                    System.out.println(operand1 / operand2);
                    break;
                }

        }

    }
}
