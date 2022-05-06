package less3;

public class less3 {
    import java.util.Random;
    import java.util.Scanner;
        public static Scanner scanner = new Scanner(System.in);
        public static Random random = new Random();

        public static void main(String[] args) {

            printCoordinatesArrays(5,3);

            int[][][] array10 = new int[10][3][5];

//        for (int i = 0; i < ; i++) {
//            for (int j = 0; j < ; j++) {
//                for (int k = 0; k < ; k++) {
//
//                }
//            }
//        }

//        int[] myArrayInt = new int[40];
//        String[][] myArrayString2 = new String[3][3];
//
//        for (int i = 0; i < myArrayString2.length; i++) {
//            for (int j = 0; j < myArrayString2[i].length; j++) {
//                myArrayString2[i][j] = "String " + i;
//            }
//        }
//
//        for (int i = 0; i < myArrayString2.length; i++) {
//            for (int j = 0; j < myArrayString2[i].length; j++) {
//                System.out.print(myArrayString2[i][j] + " | ");
//            }
//            System.out.println();
//        }
//        myArrayInt[0] = 15;
//        myArrayInt[1] = 2;
//        myArrayInt[2] = 20;
//        myArrayInt[3] = 20;

//        System.out.println(myArrayInt[1]);
//        myArrayInt[1] = 30;
//        System.out.println(myArrayInt[1]);

//        for (int i = 0; i < myArrayInt.length; i++) {
//            myArrayInt[i] = randomUserValue(-10, 10);
//        }
//
//        for (int i = 0; i < myArrayInt.length; i++) {
//            System.out.print(myArrayInt[i] + " | ");
//        }

//        String[] myStringArray = {"One", "Two", "Three"};
//        for (int i = 0; i < myStringArray.length; i++) {
//            System.out.println("index " + i + " = " + myStringArray[i]);
//        }

//        int[][] myArray2 = new int[4][];
//
//        for (int i = 0; i < myArray2.length; i++) {
//            myArray2[i] = new int[randomUserValue(1, 6)];
//        }
//
//        for (int i = 0; i < myArray2.length; i++) {
//            for (int j = 0; j < myArray2[i].length; j++) {
//                myArray2[i][j] = randomUserValue(-10,10);
//            }
//        }
//
//        for (int i = 0; i < myArray2.length; i++) {
//            for (int j = 0; j < myArray2[i].length; j++) {
//                System.out.print(myArray2[i][j] + "\t");
//            }
//            System.out.println();
//        }

//        studyRandom();
//        for (int i = 0; i < 10; i++) {
//            System.out.print(randomUserValue(-3, 2) + " | ");
//        }


//        System.out.print("Enter something > ");
//        String tmp = scanner.next();
//        System.out.println("Hello " + tmp);
//        System.out.println(welcomeUser("Enter something", "Hello"));

//        int a = inputValue("Enter value A");
//        int b = inputValue("Enter value B");
//        System.out.println("Result = " + (a + b));

        }

        public static int randomUserValue(int min, int max) {
            return min + random.nextInt(max - min + 1);
        }

        public static void studyRandom() {
            for (int i = 0; i < 10; i++) {
                System.out.println(random.nextInt()); //[-int;+int]
                System.out.println(random.nextInt(20)); //[0;value)
                System.out.println(random.nextFloat()); //[0;1)
            }
        }

        public static String welcomeUser(String sysMsg, String welcomeMsg) {
            System.out.print(sysMsg + " > ");
            return welcomeMsg + " " + scanner.next();
        }

        public static int inputValue(String sysMsg) {
            System.out.print(sysMsg + " > ");
            return scanner.nextInt();
        }

        public static void printCoordinatesArrays(int h, int w) {
            String[][] array = new String[h][w];

            for (int y = 0; y < array.length; y++) {
                for (int x = 0; x < array[y].length; x++) {
                    array[y][x] = "[" + y + ":" + x + "]";
                }
            }

            for (int y = 0; y < array.length; y++) {
                for (int x = 0; x < array[y].length; x++) {
                    System.out.print(array[y][x] + "\t");
                }
                System.out.println();
            }
        }

    }



