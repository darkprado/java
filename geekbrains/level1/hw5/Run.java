public class Run {
    public static void main(String[] args) {
        Worker[] workers = new Worker[5];
        workers[0] = new Worker("Иван", "Водитель", "ivan@ya.ru", 89008007060L, 25, 30000);
        workers[1] = new Worker("Никита", "Водитель", "nikita@ya.ru", 89008007060L, 47, 37000);
        workers[2] = new Worker("Ольга", "Контролер", "olga@ya.ru", 89008007060L, 21, 20000);
        workers[3] = new Worker("Сергей", "Наборщик", "sergey@ya.ru", 89008007060L, 33, 40000);
        workers[4] = new Worker("Олег", "Директор", "oleg@ya.ru", 89008007060L, 52, 70000);

        for (Worker w : workers) {
            if (w.getAge() > 40) w.print();
        }
    }
}
