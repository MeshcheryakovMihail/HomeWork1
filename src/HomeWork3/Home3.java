package HomeWork3;


public class Home3 {


    public static void main (String[] args){

argument(1, 10);


        int [] myArrayInt = new int[] {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < myArrayInt.length; i++){
            if(myArrayInt[i] == 1) {
                myArrayInt[i] = 0;
            } else {
                myArrayInt[i] =1;
            }
            System.out.print(myArrayInt[i] + " | ");

        }

        int [] myArray2 = new int[101];
        for (int i = 1; i <= 100; i++){
            myArray2[i] = i;
            System.out.print(myArray2[i] + " | ");
        }

        int [] myArray3 = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < myArray3.length; i++){
            if (myArray3[i] <= 6){
                myArray3[i] = (myArray3[i] * 2);
            }
            System.out.print(myArray3[i] + " | ");
        }


        int[][] array4 = new int[4][4];
        for (int i = 0; i < array4.length; i++) {
            for (int j = 0; j < array4.length; j++) {
                if (i == j) {
                    array4[i][j] = 1;
                }
                System.out.print(array4[i][j] + " | ");

            }
            System.out.println();
        }


    }
    public static void argument(int len, int initialValue){
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
            System.out.print( i + " | " + arr[i]);
        }
    }
}
