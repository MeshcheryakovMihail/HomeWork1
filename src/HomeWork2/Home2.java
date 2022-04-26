package HomeWork2;

import kotlin.reflect.jvm.internal.impl.resolve.constants.KClassValue;

public class Home2 {
    public static void main(String[] args) {
sum();
numberName(2);
paramNumber(-1);
stringNumber(5, "banan");
leapYear(200);
    }
    public static void sum(){
        int a = 1;
        int b = 3;
        boolean i =(a + b >= 10 & a + b <= 20);
        System.out.println(i);
    }
    public static void numberName(int num) {
        System.out.println();
        if (num >= 0) System.out.println("Число" +" "+ num +" "+ "положительное");
        else System.out.println("Число"+" " + num +" " + "отрицательное");
    }
    public static void paramNumber(int num){
        boolean a = (num < 0);
        System.out.println(a);
    }
    public static void stringNumber(int num, String text){
        String result = text;
        for (int i = 1; i <= num; i++){
            result = result;
            System.out.println(result);
        }
    }
    public static void leapYear(int Year){
        int true1 = 4, true2 = 400;
        int no = 100;
        boolean i = (Year % true1 == 0 && Year % true2 == 0 || Year % no != 0);
            System.out.println(i); // Нашел решение в интернете, сам бы не додумался!
        }
    }




