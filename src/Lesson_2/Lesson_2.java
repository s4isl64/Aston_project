package Lesson_2;

public class Lesson_2 {public static void main(String[] args) {

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
        int a = 7;
        int b = 8;
        if ((a + b) >= 0) {
            System.out.println("Положительный");
        } else {
            System.out.println("Отрицательный");
        }

    }

    public static void printColor() {
        int value = 94;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }

    }

    public static void compareNumbers() {
        int a = 8;
        int b = 7;
        if (a >= b) {
            System.out.println("a > b");
        } else {
            System.out.println("a < b");
        }

    }
}
