public class Cat extends Animal {

    public Cat () {
        this.run = (float)(Math.round((Math.random() * 100 + 100) * Math.pow(10, 2)) / Math.pow(10, 2));
        this.jump = (float)(Math.round((Math.random() + 1) * Math.pow(10, 2)) / Math.pow(10, 2));
        this.swim = 0;
    }

}
