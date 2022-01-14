package Lesson5_HW;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws Exception {
        AppData appData = new AppData();
        AppData.load();

        System.out.println(appData.exists());

        System.out.println(Arrays.toString(appData.getHeader()));
        System.out.println(Arrays.deepToString(appData.getData()));
    }
}
