import java.util.Scanner;

public class Java1HW3 {

    public static void main(String[] args) {
        //guessNumGame();
        //guessWord();
        sale(3000);
    }

    /*
    task1
    Написать программу, которая загадывает случайное число от 0 до 9, и пользователю дается 3 попытки угадать это число.
    При каждой попытке компьютер должен сообщить больше ли указанное пользователем число чем загаданное, или меньше.
    После победы или проигрыша выводится запрос – «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).
    */

    public static void guessNumGame() {

        int num = (int) (Math.random() * 10);//получаем случайное число от 0 до 9

        Scanner scanner = new Scanner(System.in);
        int playerNum, attempt = 0, replay;
        boolean isGame = true;

        while (isGame) {

            do {
                if (attempt == 3) {
                    System.out.println("Ваши попытки закончились!");
                    attempt = 0;
                    break;
                }
                System.out.println("Введите целое число от 0 до 9.");
                playerNum = Integer.parseInt(scanner.nextLine());
                if (playerNum > num) {
                    System.out.println("Загаданное число меньше!");
                } else if (playerNum < num) {
                    System.out.println("Загаданное число больше!");
                } else {
                    System.out.println("Поздравляю, Вы угадали число!");
                    break;
                }
                attempt++;
            } while (true);

            System.out.println("Играем еще? (0 - выход, 1 - играем еще)");

            replay = Integer.parseInt(scanner.nextLine());
            if (replay == 0) isGame = false;

        }

    }

    /*
    task2
    Создать массив из слов String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli",
    "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea",
    "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
    При запуске программы компьютер загадывает слово, запрашивает ответ у пользователя,
    сравнивает его с загаданным словом и сообщает правильно ли ответил пользователь. Если слово не угадано,
    компьютер показывает буквы которые стоят на своих местах.
    apple – загаданное
    apricot - ответ игрока
    ap############# (15 символов, чтобы пользователь не мог узнать длину слова)
    Для сравнения двух слов посимвольно, можно пользоваться:
    String str = "apple";
    str.charAt(0); - метод, вернет char, который стоит в слове str на первой позиции
    Играем до тех пор, пока игрок не отгадает слово
    Используем только маленькие буквы
    */

    public static void guessWord() {

        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli",
                "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive",
                "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};

        String guessWord = words[(int) (Math.random() * words.length)];
        Scanner scanner = new Scanner(System.in);
        String playerWord;

        System.out.println(guessWord);

        while (true) {
            System.out.println("Введите слово");
            playerWord = scanner.nextLine();
            if (playerWord.equals(guessWord)) {
                System.out.println("Вы угадали!");
                break;
            }
            for (int i = 0; i < 15; i++) {
                if (i < playerWord.length() && i < guessWord.length() && playerWord.charAt(i) == guessWord.charAt(i))
                    System.out.print(guessWord.charAt(i));
                else System.out.print("*");
            }
            System.out.println();
        }

    }

    /*
    task3
    Определить скидку на товар в зависимости от суммы покупки. (Условия определяем самостоятельно,
    например при покупке свыше 5000, скидка 10%).
    Обязательно использовать оператора Switch. (Но можно использовать и другие конструкции тоже).
    */

    public static void sale (int sum) {
        int sale = 0;//категория скидок

        if (sum >= 10000) sale = 3;
        else if (sum >= 5000) sale = 2;
        else if (sum >= 2000) sale = 1;

        switch (sale) {
            case 0:
                System.out.println("У Вас нет скидки!");
                break;
            case 1:
                System.out.println("Ваша скидка 5%");
                break;
            case 2:
                System.out.println("Ваша скидка 10%");
                break;
            case 3:
                System.out.println("Ваша скидка 15%");
                break;
        }

    }

}
