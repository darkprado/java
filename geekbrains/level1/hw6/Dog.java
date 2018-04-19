public class Dog extends Animal {

    public Dog () {
        this.run = (float)(Math.round((Math.random() * 400 + 200) * Math.pow(10, 2)) / Math.pow(10, 2));
        this.jump = (float)(Math.round((Math.random()) * Math.pow(10, 2)) / Math.pow(10, 2));
        this.swim = (float)(Math.round((Math.random() * 10) * Math.pow(10, 2)) / Math.pow(10, 2));
    }

}
