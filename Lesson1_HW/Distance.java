package Lesson1_HW;

public class Distance implements Overcom {
    private int length;

    public Distance(int length) {
        this.length = length;
    }

    public void overcome(Competitable competitable) {
        competitable.run(length);
    }
}