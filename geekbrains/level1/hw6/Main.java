public class Main {

    public static void main(String[] args) {
        Animal[] animals = {
                new Cat(),
                new Dog()
        };

        animals[0].run(50);
        animals[0].run(300);
        animals[0].jump(1.5f);
        animals[0].jump(3);
        animals[0].swim(3);
        animals[0].swim(0);

        animals[1].run(500);
        animals[1].run(700);
        animals[1].jump(0.5f);
        animals[1].jump(3);
        animals[1].swim(3);
        animals[1].swim(12);

    }

}
