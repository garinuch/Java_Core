package Lesson1_HW;

public class Horse implements Competitable {
    private int jumpHeight;
    private int runLength;

    public Horse(int jumpHeight, int runLength) {
        this.jumpHeight = jumpHeight;
        this.runLength = runLength;
    }

    @Override
    public void jump(int height) {
        if (height > jumpHeight) {
            System.out.println("Лошадь не смогла перепрыгнуть!");
        } else {
            System.out.println("Лошадь смогла перепрыгнуть!");
        }
    }

    @Override
    public void run(int length) {
        if (length > runLength) {
            System.out.println("Лошадь не смогла пробежать!");
        } else {
            System.out.println("Лошадь смогла пробежать!");
        }
        System.out.println("Лошадь ржёт.");
    }

    @Override
    public void voice() {
        System.out.println("Лошадь ржёт.");
    }

}