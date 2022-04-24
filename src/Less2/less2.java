package Less2;

    /**
     * Created by Aleksandr Gladkov [Anticisco]
     * Date: 23.04.2022
     */

    public class TwoClass {

        public static int valueClass = 55;

        public static void main(String[] args) {
//        System.out.println(valueClass);
//        int valueMethod = 99;
//        System.out.println(valueMethod);
//
//        studySwitch();

//        System.out.println(1);
//        System.out.println(2);
//        System.out.println(3);
//        System.out.println(4);
//        System.out.println(5);
//        System.out.println(6);
//        System.out.println("*****");

//        for (int i = 2; i == 6; i++) {
//            System.out.println(i);
//        }

//        System.out.println(myMath(2, 4));

//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < 4; j++) {
//
//            }
//        }
//        printTablePifagor(10, 10);

            int value = 0;
            int maxValue = 10;

            do {
                value++;
                if (value == 4 || value == 7) {
                    continue;
                }

                if (value == 6) {
                    break;
                }
                System.out.print(value + " | ");
            } while (value < maxValue);

//        while (value < maxValue) {
//            value++;
//            if (value == 4 || value == 7) {
//                continue;
//            }
//
//            if (value == 6) {
//                break;
//            }
//            System.out.print(value + " | ");
//        }

        }

        public static int myMath(int value, int signature) {
            int result = value;
            for (int i = 1; i < signature; i++) {
                result *= value;
            }

            return result;
        }

        public static void printTablePifagor(int maxHeightValue, int maxWidthValue) {

            for (int y = 1; y <= maxHeightValue; y++) {
                for (int x = 1; x <= maxWidthValue; x++) {
                    System.out.print(y * x + "\t");
                }
                System.out.println();
            }
        }


//    public static void studySwitch() {
//        System.out.println(valueClass);
//        String nameLetter = "Oleg";
//
//        if (nameLetter == "Alex") {
//            System.out.println("Send letter to Alex");
//        } else if (nameLetter == "Oleg") {
//            System.out.println("Send letter to Oleg");
//            System.out.println(valueClass);
//        } else if (nameLetter == "Olga") {
//            System.out.println("Send letter to Olga");
//        } else if (nameLetter == "Boris") {
//            System.out.println("Send letter to Boris");
//        } else {
//            System.out.println("Go out office");
//        }
//
//        System.out.println("**********");
//
//        switch (nameLetter) {
//            case "Alex":
//                System.out.println("Send letter to Alex");
//                break;
//            case "Oleg":
//                System.out.println("Send letter to Oleg");
//                break;
//            case "Olga":
//                System.out.println("Send letter to Olga");
//                break;
//            case "Boris":
//                System.out.println("Send letter to Boris");
//                break;
//            default:
//                System.out.println("Go out office");
//                break;
//        }
//    }
    }
}
