package com.pb.nurtdinova.hw3;


import java.util.Random;
import java.util.Scanner;

class Bingo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int minNumber = 0;
        int maxNumber = 100;
        int exit = 777;
        boolean play = true;
        int count = 1;

        Random random = new Random();
        int bingoNumber = random.nextInt(maxNumber - minNumber) + minNumber;

        System.out.println("Отгадайте число от 0 до 100 в игре BINGO");
        System.out.println("Для завершения игры введите 777 ");
        do {
            int inputNumber = scanner.nextInt();
            if (inputNumber == bingoNumber) {
                System.out.println("Bingo!!! Вы выиграли!!!");
                System.out.println("Количество попыток = " + count);
                play = false;
            } else if (inputNumber == exit) {
                System.out.println("Игра завершена.");
                play = false;
            } else if (inputNumber > bingoNumber) {
                System.out.println("Задуманное число меньше");
                count++;
            } else {
                System.out.println("Задуманное число больше");
                count++;
            }
        }
        while (play);


    }


}