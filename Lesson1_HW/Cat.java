package Lesson1_HW;

public class Cat implements Competitable {
    private final int jumpHeight;
    private final int runLength;

    public Cat(int jumpHeight, int runLength) {
        this.jumpHeight = jumpHeight;
        this.runLength = runLength;
    }

    @Override
    public void jump(int height) {
        if (height > jumpHeight) {
            System.out.println("Кот не смог перепрыгнуть!");
        } else {
            System.out.println("Кот смог перепрыгнуть!");
        }
    }

    @Override
    public void run(int length) {
        if (length > runLength) {
            System.out.println("Кот не смог пробежать!");
        } else {
            System.out.println("Кот смог пробежать!");
        }
        System.out.println("Кот мяукает.");
    }
    public void voice() {
        System.out.println("Кот мяукает.");
    }
}
