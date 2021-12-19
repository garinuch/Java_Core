package Lesson1_HW;

public class Main {

    private static Object Voice;

    public static void main(String[] args) {
        Competitable[] competitors = {new Cat(2, 5), new Dog(2, 9),
                new Horse(3, 10)};

        Overcom[] overcom = {new Wall(3), new Distance(5)};

        for (Competitable competitable : competitors) {
            for (Overcom overcome : overcom) {
                overcome.overcome(competitable);
            }
        }
    }
}
