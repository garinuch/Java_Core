package project_7HW;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        AccuweatherModel accuweatherModel = new AccuweatherModel();

        System.out.println(accuweatherModel.getWeather("Moscow", Period.NOW));
    }
}

