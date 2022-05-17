package less3;

import java.util.Random;
import java.util.Scanner;

public class lessons3 {
    public static Scanner scanner = new Scanner(System.in);
    public static Random random = new Random();


    public static void main(String[] args) {
        printCoordinatesArrays(10, 10);
        String[][] myArrayString2 = new String[3][3];

//        for (int i = 0; i < myArrayString2.length; i++) {
//            for (int j = 0; j < myArrayString2[i].length; j++) {
//                myArrayString2[i][j] = "String" + i;
//            }
//        }
//
//        for (int i = 0; i < myArrayString2.length; i++) {
//            for (int j = 0; j < myArrayString2[i].length; j++) {
//                System.out.print(myArrayString2[i][j] + " | ");
//            }
//            System.out.println();
//        }

//        int[][] myArray2 = new int[4][];
//
//        for (int i = 0; i < myArray2.length; i++){
//          myArray2[i] = new int[randomUserValue(1,6)];
//        }
//
//        for (int i = 0; i < myArray2.length; i++){
//            for (int j = 0; j < myArray2[i].length; j++){
//                myArray2[i][j] = randomUserValue(-10, 10);
//            }
//        }
//
//        for (int i = 0; i < myArray2.length; i++) {
//            for (int j = 0; j < myArray2[i].length; j++) {
//                System.out.print(myArray2[i][j] + "\t");
//            }
//            System.out.println();
//        }


//        String[] myStringArray = {"One", "Two", "Three"};
//        for (int i = 0; i < myStringArray.length; i++ ){
//            System.out.println("index " + i + " = " + myStringArray[i]);
//        }
//        int[] myArrayInt = new int[40];

//        myArrayInt[0] = 1;
//        myArrayInt[1] = 10;
//        myArrayInt[2] = 15;
//        myArrayInt[3] = 20;
//
//        System.out.println(myArrayInt[1]);
//        myArrayInt[1] = 11;
//        System.out.println(myArrayInt[1]);

//        for (int i = 0; i < myArrayInt.length; i++) {
//            myArrayInt[i] = randomUserValue(-10, 10);
//        }
//        for (int i = 0; i < myArrayInt.length; i++) {
//            System.out.print(myArrayInt[i] + " | ");
//        }

//        for (int i = 0; i < 10; i++) {
//            System.out.print(randomUserValue(-3, 2) + " | ");
//        }

//        for (int i = 0; i < 10; i ++ ) {
//            System.out.println(random.nextInt()); // (-int,+int)
//            System.out.println(random.nextInt(20)); // 0-включительно, 20-исключительно
//            System.out.println(random.nextFloat()); // от 0 до (1 -исключительно)
//        }

//       System.out.print (welcomeUser("Enter name", "Hello"));
//       System.out.print("Enter name > ");
//       String tmp = scanner.next();
//       System.out.println("Hello " + tmp);


//         int a = inputValue("Enter value a");
//         int b = inputValue("Enter value b");
//         System.out.print("result = " + (a + b));


    }

    public static int randomUserValue(int min, int max) {
        return min + random.nextInt(max - min + 1);
    }

    //
//    public static String welcomeUser(String sysMsg, String welcomeMsg) {
//        System.out.print(sysMsg + "> ");
//        return welcomeMsg + " " + scanner.next();
//    }
//
//    public static int inputValue(String sysMsg) {
//        System.out.print(sysMsg + "> ");
//        return scanner.nextInt();
//    }
    public static void printCoordinatesArrays(int h, int w) {
        String[][] array = new String[h][w];
        for (int y = 0; y < array.length; y++) {
            for (int x = 0; x < array[y].length; x++) {
                array[x][y] = "[" + y + ":" + x + "]";
            }
        }

        for (int y = 0; y < array.length; y++) {
            for (int x = 0; x < array[y].length; x++) {
                System.out.print(array[x][y] + "\t");
            }
            System.out.println();
        }

    }
}