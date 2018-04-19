public abstract class Animal implements Skills {
    public Animal() {

    }
    protected float run;
    protected float swim;
    protected float jump;

    @Override
    public void run(float length) {
        boolean isDone = (length <= run && length > 0) ? true : false;
        System.out.println(getClass().getName() + " run on distance " + length + ": " + isDone);
    }

    @Override
    public void swim(float length) {
        boolean isDone = (length <= swim && length > 0) ? true : false;
        System.out.println(getClass().getName() + " swim on distance " + length + ": " + isDone);
    }

    @Override
    public void jump(float height) {
        boolean isDone = (height <= jump && height > 0) ? true : false;
        System.out.println(getClass().getName() + " jump on distance " + height + ": " + isDone);
    }
}
