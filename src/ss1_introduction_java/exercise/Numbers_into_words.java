package ss1_introduction_java.exercise;

import java.util.Scanner;

public class Numbers_into_words {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Nhâp số cần chuyển: ");
//        int number = scanner.nextInt();
//        String[] array = new String[]{"one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
//        String[] array2 = new String[]{"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
//        int hundred = number / 100;
//        int dozens = (number % 100) / 10;
//        int unit = (number % 100) % 10;
//        if (number >= 100) {
//            for (int i = 1; i <= array.length; i++) {
//                if (hundred == i) {
//                    if (dozens == 0 && unit == 0) {
//                        System.out.println(array[i - 1] + "hundred ");
//                    } else {
//                        System.out.print(array[i - 1] + " hundred and ");
//                    }
//                }
//            }
//        }
//        if (dozens >= 6) {
//            for (int i = 1; i <= array.length; i++) {
//                if (dozens == i) {
//                    if (unit == 0) {
//                        System.out.print(array[i - 1] + "ty");
//                    } else {
//                        System.out.println(array[i - 1] + "ty " + array[unit - 1]);
//                    }
//                }
//            }
//        } else if (dozens < 6 && dozens != 1 && dozens != 0) {
//            if (unit == 0) {
//                switch (dozens) {
//                    case 5:
//                        System.out.print("fifty");
//                        break;
//                    case 4:
//                        System.out.print("forty");
//                        break;
//                    case 3:
//                        System.out.print("thirty");
//                        break;
//                    case 2:
//                        System.out.print("twenty");
//                        break;
//                }
//            } else {
//                switch (dozens) {
//                    case 5:
//                        System.out.print("fifty " + array[unit - 1]);
//                        break;
//                    case 4:
//                        System.out.print("forty " + array[unit - 1]);
//                        break;
//                    case 3:
//                        System.out.print("thirty " + array[unit - 1]);
//                        break;
//                    case 2:
//                        System.out.print("twenty " + array[unit - 1]);
//                        break;
//                }
//            }
//        } else if (dozens == 1) {
//            for (int i = 0; i < array2.length; i++) {
//                if (unit == i) {
//                    System.out.println(array2[i]);
//                }
//            }
//        } else {
//            for (int i = 1; i <= array.length; i++) {
//                if (unit == i) {
//                    System.out.print(array[i - 1]);
//                }
//            }
//        }
//    }
//}

        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số bạn muốn đọc : ");
        int number = scanner.nextInt();
        if (number < 10) {
            switch (number) {
                case 0:
                    System.out.print("zero");
                    break;
                case 1:
                    System.out.print("one");
                    break;
                case 2:
                    System.out.print("two");
                    break;
                case 3:
                    System.out.print("three");
                    break;
                case 4:
                    System.out.print("four");
                    break;
                case 5:
                    System.out.print("five");
                    break;
                case 6:
                    System.out.print("six");
                    break;
                case 7:
                    System.out.print("seven");
                    break;
                case 8:
                    System.out.print("eight");
                    break;
                case 9:
                    System.out.print("nine");
                    break;
                default:
                    System.out.println("out of ability");
            }
        } else if (number < 20) {
            switch (number % 10) {
                case 0:
                    System.out.print("ten");
                    break;
                case 1:
                    System.out.print("eleven");
                    break;
                case 2:
                    System.out.print("twelve");
                    break;
                case 3:
                    System.out.print("thirteen");
                    break;
                case 4:
                    System.out.print("fourteen");
                    break;
                case 5:
                    System.out.print("fifteen");
                    break;
                case 6:
                    System.out.print("sixteen");
                    break;
                case 7:
                    System.out.print("seventeen");
                    break;
                case 8:
                    System.out.print("eighteen");
                    break;
                case 9:
                    System.out.print("nineteen");
                    break;
                default:
                    System.out.println("out of ability");
            }
        } else if (number < 100) {
            switch (number / 10) {
                case 2:
                    System.out.print("twenty");
                    break;
                case 3:
                    System.out.print("thirty");
                    break;
                case 4:
                    System.out.print("forty");
                    break;
                case 5:
                    System.out.print("fifty");
                    break;
                case 6:
                    System.out.print("sixty");
                    break;
                case 7:
                    System.out.print("seventy");
                    break;
                case 8:
                    System.out.print("eighty");
                    break;
                case 9:
                    System.out.print("ninety");
                    break;
                default:
                    System.out.println("out of ability");
            }
            if (number % 10 != 0) {
                switch (number % 10) {
                    case 1:
                        System.out.print(" one");
                        break;
                    case 2:
                        System.out.print(" two");
                        break;
                    case 3:
                        System.out.print(" three");
                        break;
                    case 4:
                        System.out.print(" four");
                        break;
                    case 5:
                        System.out.print(" five");
                        break;
                    case 6:
                        System.out.print(" six");
                        break;
                    case 7:
                        System.out.print(" seven");
                        break;
                    case 8:
                        System.out.print(" eight");
                        break;
                    case 9:
                        System.out.print(" nine");
                        break;
                    default:
                        System.out.println("out of ability");
                }
            }
        } else if (number > 100 && number < 1000) {
            switch (number / 100) {
                case 1:
                    System.out.print("one hundred");
                    break;
                case 2:
                    System.out.print("two hundred");
                    break;
                case 3:
                    System.out.print("three hundred");
                    break;
                case 4:
                    System.out.print("four hundred");
                    break;
                case 5:
                    System.out.print("five hundred");
                    break;
                case 6:
                    System.out.print("six hundred");
                    break;
                case 7:
                    System.out.print("seven hundred");
                    break;
                case 8:
                    System.out.print("eight hundred");
                    break;
                case 9:
                    System.out.print("nine hundred");
                    break;
            }
            if (number % 100 != 0) {
                switch ((number / 10) % 10) {
                    case 2:
                        System.out.print(" and twenty");
                        break;
                    case 3:
                        System.out.print(" and thirty");
                        break;
                    case 4:
                        System.out.print(" and forty");
                        break;
                    case 5:
                        System.out.print(" and fifty");
                        break;
                    case 6:
                        System.out.print(" and sixty");
                        break;
                    case 7:
                        System.out.print(" and seventy");
                        break;
                    case 8:
                        System.out.print(" and eighty");
                        break;
                    case 9:
                        System.out.print(" and ninety");
                        break;
                }
            }
            if (number % 100 != 0) {
                switch (number % 10) {
                    case 1:
                        System.out.print(" one");
                        break;
                    case 2:
                        System.out.print(" two");
                        break;
                    case 3:
                        System.out.print(" three");
                        break;
                    case 4:
                        System.out.print(" four");
                        break;
                    case 5:
                        System.out.print(" five");
                        break;
                    case 6:
                        System.out.print(" six");
                        break;
                    case 7:
                        System.out.print(" seven");
                        break;
                    case 8:
                        System.out.print(" eight");
                        break;
                    case 9:
                        System.out.print(" nine");
                        break;
                }
            }
        }
    }
}