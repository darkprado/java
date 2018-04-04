import java.util.Arrays;

public class Java1HW2 {

    public static void main(String[] args) {

        /*
        task1.
        Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
        С помощью цикла и условия заменить 0 на 1, 1 на 0;
        */

        System.out.println("Задание 1.");
        System.out.println("Массив до:");

        int[] arr1 = {1, 1, 0, 1, 0, 0, 0, 0, 1, 0, 1, 0};

        System.out.println(Arrays.toString(arr1));

        for (int i = 0; i < arr1.length; i++)
            arr1[i] = (arr1[i] == 0) ? 1 : 0;

        System.out.println("Массив после:");
        System.out.println(Arrays.toString(arr1));

        /*
        task2.
        Задать пустой целочисленный массив размером 8.
        С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
        */

        System.out.println("Задание 2.");

        int[] arr2 = new int[8];
        for (int i = 0, j = 0; i < arr2.length; i++, j+=3)
            arr2[i] = j;

        System.out.println(Arrays.toString(arr2));

        /*
        task3.
        Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
        */

        System.out.println("Задание 3.");
        System.out.println("Массив до:");

        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        System.out.println(Arrays.toString(arr3));

        for (int i = 0; i < arr3.length; i++)
            arr3[i] = (arr3[i] < 6) ? arr3[i] * 2 : arr3[i];

        System.out.println("Массив после:");
        System.out.println(Arrays.toString(arr3));

        /*
        task4.
        Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
        и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
        */

        System.out.println("Задание 4.");

        int[][] arr4 = new int[5][5];
        for (int i = 0, j = arr4.length - 1; i < arr4.length; i++) {
            arr4[i][i] = 1;
            arr4[i][j - i] = 1;
            j = arr4.length - 1;
        }

        //Вывод массива
        for (int i = 0; i < arr4.length; i++) {
            for (int j = 0; j < arr4.length; j++) {
                System.out.print(arr4[i][j]);
            }
            System.out.println();
        }

        /*
        task5.
        ** Задать одномерный массив и найти в нем минимальный и максимальный элементы
        (без помощи интернета);
        */

        System.out.println("Задание 5.");

        int[] arr5 = {1, 2, 5, -7, 12, 4, 5, 100};

        System.out.println("Массив: " + Arrays.toString(arr5));

        int min = arr5[0], max = arr5[0];

        for (int i : arr5) {
            if (i > max) max = i;
            if (i < min) min = i;
        }

        System.out.println("Минимальное значение массива: " + min + ", максимальное значение массива: " + max + ".");

        /*
        task6.
        ** Написать метод, в который передается не пустой одномерный целочисленный массив,
        метод должен вернуть true если в массиве есть место, в котором сумма левой и правой части
        массива равны. Примеры: checkBalance([1, 1, 1, || 2, 1]) → true, checkBalance ([2, 1, 1, 2, 1]) →
        false, checkBalance ([10, || 10]) → true, граница показана символами ||, эти символы в массив не входят.
        */

        System.out.println("Задание 6.");

        int[] arr6test1 = {1, 1, 1, 2, 1};
        int[] arr6test2 = {2, 1, 1, 2, 1};
        int[] arr6test3 = {10, 10};

        System.out.println(checkBalance(arr6test1));
        System.out.println(checkBalance(arr6test2));
        System.out.println(checkBalance(arr6test3));

        /*
        task7.
        **** Написать метод, которому на вход подаётся одномерный массив и число n (может быть
        положительным, или отрицательным), при этом метод должен сместить все элементы
        массива на n позиций. Для усложнения задачи нельзя пользоваться вспомогательными
        массивами.
        */

        System.out.println("Задание 7.");

        int[] arr7 = {1, 2, 3, 4, 5, 6, 7};

        System.out.println("Массив до:");
        System.out.println(Arrays.toString(arr7));

        pushArray(arr7, 3);

        System.out.println("Массив после:");
        System.out.println(Arrays.toString(arr7));

        /*
        task8.
        (Доп задание) Создать матрицу с указанной размерностью.
        Заполнить матрицу по спирали (числа увеличиваются на 1)
        */

        System.out.println("Задание 8.");

        int[][] arr8 = fillingSpiral(3, 3);

        for (int i = 0; i < arr8.length; i++) {
            for (int j = 0; j < arr8[i].length; j++) {
                System.out.print(arr8[i][j]);
            }
            System.out.println();
        }

    }

    //метод для задания 6
    public static boolean checkBalance (int[] arr) {
        int sum = 0;
        for (int i : arr) sum += i;

        if (sum % 2 == 0) {
            int middle = sum / 2;
            for (int i = 0, j = 0; i < arr.length; i++) {
                j+=arr[i];
                if (j == middle) return true;
            }
        }

        return false;
    }

    //метод для задания 7
    public static void pushArray (int[] arr, int n) {
        if ((arr.length != 0 && arr.length != 1) && n != 0) {
            int temp = 0;
            if (n > 0) {
                for (int i = 0; i < n; i++) {
                    temp = arr[arr.length - 1];
                    for (int j = arr.length - 1; j > 0; j--) {
                        arr[j] = arr[j - 1];
                    }
                    arr[0] = temp;
                }
            } else {
                for (int i = n; i < 0; i++) {
                    temp = arr[0];
                    for (int j = 0; j < arr.length - 1; j++) {
                        arr[j] = arr[j + 1];
                    }
                    arr[arr.length - 1] = temp;
                }
            }
        }
    }

    //метод для задания 8

    public static int[][] fillingSpiral (int gorizontLine, int verticalLine) {

        int[][] arr = new int[gorizontLine][verticalLine];

        boolean indexCorrect = gorizontLine > 0 && verticalLine > 0;

        if(indexCorrect) {
            int count = 1;
            int numOfIterate = 0;
            while (count <= gorizontLine * verticalLine) {

                for (int i = 0 + numOfIterate; i < arr.length - numOfIterate; i++) {
                    if (i == numOfIterate) {
                        for (int j = 0 + numOfIterate; j < arr[i].length - numOfIterate; j++) {
                            arr[i][j] = count++;
                        }
                    } else if (i != arr.length - 1 - numOfIterate) {
                        arr[i][arr[i].length - 1 - numOfIterate] = count++;
                    } else {
                        for (int j = arr[i].length - 1 - numOfIterate; j >= numOfIterate; j--) {
                            arr[i][j] = count++;
                        }
                        for (int j = arr.length - 2  - numOfIterate; j > numOfIterate; j--) {
                            arr[j][numOfIterate] = count++;
                        }
                    }
                }
                numOfIterate++;
            }
        }
        return arr;
    }

}
