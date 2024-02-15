
package Lesson_3;

public class Main {


    public static void main(String[] args) {
        int a = 5; // Первое значение для задачи №1
        int b = 7; // Второе значение для задачи №1
        int c = 7; // Значение для задачи №3
        int d = 5; // Значение для задачи №4
        int year = 400; // Значение для задачи №5
        int len = 5; // Значение для задачи №10
        int initalValue = 3; // Значение для задачи №10

        System.out.println(TaskOne(a, b));
        TaskTwo(c);
        System.out.println(TaskThree(d));
        System.out.println(HiYear(year));
        TaskSix();
        TaskSeven();
        TaskEight();
        TaskNine();
        TaskTen(len, initalValue);


    }

    public static boolean TaskOne(int a, int b) {
        if ((a + b) > 10 && (a + b) < 20) {
            return true;
        } else {
            return false;
        }

    }

    public static void TaskTwo(int c) {

        if (c >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    public static boolean TaskThree(int d) {
        if (d >= 0) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean HiYear(int year) {
        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }

    public static void TaskSix() {
        int[] arr = {1, 0, 0, 1, 0, 1, 0, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }

        }
         //for (int element: arr)
        //System.out.print(element);

    }

    public static void TaskSeven() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        //for (int element: arr)
        //System.out.print(element);


    }
    public static void TaskEight() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= 6) {
                arr[i] = arr[i] * 2;
            } else {
                arr[i] = arr[i];
            }

        }
        //for (int element: arr)
        //System.out.print(element);


    }
    public static void TaskNine() {
        int[][] table = new int [3][3];

        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table.length; j++) {
                if (i == j) {
                    table[i][j] = 1;

                } else {
                    table[i][j] = 0;
                }
         //   System.out.print(table[i][j]);
        }
        //    System.out.println();
        }
    }



    public static void TaskTen(int len, int initalValue) {
        int[] arr = new int [len];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = initalValue;

            }
       // for (int element: arr)
           // System.out.println(element);
        }
    }
/* Для проверяющего,
В заданиях не было условий вывода в консоль, но для простолты проверки
я все выводы в консоль закомментировал (поставил "//")
 */