public class Java1HW1 {

    /*
    task1
        Создать пустой проект в IntelliJ IDEA и прописать метод main();
    */

    public static void main(String[] args) {

        System.out.println(calc(1,2,3,4));
        System.out.println(isRange(5, 10));
        System.out.println(isRange(15, 10));
        System.out.println(positiveOrNegative(7));
        System.out.println(positiveOrNegative(-7));
        System.out.println(isNegative(-6));
        System.out.println(isNegative(6));
        hello("Артем");
        leapYear(4);
        leapYear(7);
        leapYear(300);
        leapYear(1200);
        leapYear(2018);
    }

    /*
    task2
        Создать переменные всех пройденных типов данных, и инициализировать их значения;
    */

    byte by = 1;
    short sh = 2;
    int in = 3;
    long lo = 15L;
    float fl = 2.4f;
    double doub = 123.4352352;
    char ch = 'r';
    boolean bool = true;

    /*
    task3
        Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
        где a, b, c, d – входные параметры этого метода;
    */

    public static double calc (double a, double b, double c, double d) {
        return a * (b + (c / d));
    }

    /*
    task4
        Написать метод, принимающий на вход два числа, и проверяющий что их сумма лежит в
        пределах от 10 до 20(включительно), если да – вернуть true, в противном случае – false;
    */

    public static boolean isRange (int a, int b) {
        int res = a + b;
        return  (res > 9 && res < 21);
    }

    /*
    task5
        Написать метод, которому в качестве параметра передается целое число, метод должен
        напечатать в консоль положительное ли число передали, или отрицательное; Замечание:
        ноль считаем положительным числом.
    */

    public static String positiveOrNegative (int n) {
        String res = "Отрицательное число.";
        if (n >= 0) res = "Положительное число.";
        return res;
    }

    /*
    task6
        Написать метод, которому в качестве параметра передается целое число, метод должен
        вернуть true, если число отрицательное;
    */

    public static boolean isNegative (int n) {
        return  n < 0;
    }

    /*
    task7
        Написать метод, которому в качестве параметра передается строка, обозначающая имя,
        метод должен вывести в консоль сообщение «Привет, указанное_имя!»;
    */

    public static void hello (String name) {
        System.out.println("Привет, " + name + "!");
    }

    /*
    task8
        *Написать метод, который определяет является ли год високосным, и выводит сообщение в
        консоль. Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й –
        високосный.
    */

    public static void leapYear (int year) {
        boolean leap = (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
        if (leap)
            System.out.println("Год " + year + " високосный.");
        else
            System.out.println("Год " + year + " не високосный.");
    }

}
