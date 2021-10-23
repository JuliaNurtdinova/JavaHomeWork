package com.pb.nurtdinova.hw3;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите Элементы массива: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        for (int number : numbers) {
            System.out.print(number + " ");
        }

        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("\nСумма всех элементов массива = " + sum);

        int countPositive = 0;
        int sumPositive = 0;
        for (int number : numbers) {
            if (number > 0) {
                countPositive++;
                sumPositive += number;
            }
        }
        System.out.println("Сумма позитивных чисел = " + sumPositive
                + "\nКоличество позитивных чисел = " + countPositive);

        System.out.println("Сортировка метадом пузырька: ");
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                if (numbers[i] > numbers[j]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[i];
                    numbers[i] = temp;
                }
            }
            System.out.print(numbers[i] + " ");
        }
    }
}
