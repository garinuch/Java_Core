package Lesson1_HW;

public class Dog implements Competitable {
    private final int jumpHeight;
    private final int runLength;

    public Dog(int jumpHeight, int runLength) {
        this.jumpHeight = jumpHeight;
        this.runLength = runLength;
    }

    @Override
    public void jump(int height) {
        if (height > jumpHeight) {
            System.out.println("Собака не смогла перепрыгнуть!");
        } else {
            System.out.println("Собака смогла перепрыгнуть!");
        }
    }

    @Override
    public void run(int length) {
        if (length > runLength) {
            System.out.println("Собака не смогла пробежать!");
        } else {
            System.out.println("Собака смогла пробежать!");
        }
        System.out.println("Собака лает.");
    }


    @Override
    public void voice() {

        System.out.println("Собака лает.");
        }
}
