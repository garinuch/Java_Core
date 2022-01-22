package project_7HW;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        AccuweatherModel2 accuweatherModel = new AccuweatherModel2();

        System.out.println(accuweatherModel.detectCityKey("New York"));
    }
}
