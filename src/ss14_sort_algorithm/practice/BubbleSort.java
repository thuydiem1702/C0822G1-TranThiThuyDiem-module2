package ss14_sort_algorithm.practice;

public class BubbleSort {
    static int[] list = {1, 2, 3, 9, 8, 6, 4, 5};

    public static void bubbleSort(int[] list) {
        boolean needNextPass = true;
        for (int i = 1; i < list.length && needNextPass; i++) {
            needNextPass = false;
            for (int j = 0; j < list.length - i; j++) {
                if (list[j] > list[j + 1]) {
                    int temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                    needNextPass = true;
                }
            }
        }
    }

    public static void main(String[] args) {
        bubbleSort(list);
        for (int j = 0; j < list.length; j++) {
            System.out.print(list[j]);
        }
    }
}
