package Lesson1_HW;

public class Wall implements Overcom {
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    public void overcome(Competitable competitable) {
        competitable.jump(height);
    }
}
