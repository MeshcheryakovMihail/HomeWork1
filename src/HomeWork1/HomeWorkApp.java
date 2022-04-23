package HomeWork1;

import javax.swing.*;
// сделал домашку 1
public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign() {
        int a = 6;
        int b = 4;
        int c = (a + b);
        if (c >= 0) {
            System.out.println("Сумма положительная");
        } else if (c < 0) {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor() {
        int value = 30;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers() {
        int a = 10;
        int b = 15;
        if (a >= b) {
            System.out.println("a >= b");
        }
         else {
            System.out.println("a < b");
        }
    }
}