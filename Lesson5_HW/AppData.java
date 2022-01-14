package Lesson5_HW;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class AppData extends IllegalArgumentException {
    private String[] header;
    private int[][] data;


    public AppData() {
    }

    public AppData(int parseInt) {
    }

    public String[] getHeader() {

        return header;
    }

    private void setHeader(String... header) {

        this.header = header;
    }

    public int[][] getData() {

        return data;
    }

    private void setData(int[]... data) {

        this.data = data;
    }

    @Override
    public String toString() {
        return "AppData{" +
                "header=" + Arrays.toString(header) +
                ", data=" + Arrays.toString(data) +
                '}';
    }

    @SuppressWarnings("MismatchedQueryAndUpdateOfCollection")
    public static void load() throws IOException {
        try (PrintWriter writer = new PrintWriter("HW5.csv")) {

            String sb = "Value 1; Value 2; Value 3" +
                    '\n' +
                    "100; 200; 123" +
                    "\n" +
                    "300, 400, 500";

            writer.write(sb);

            System.out.println("Dot it!");

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("HW5.csv"))) {
            System.out.println(bufferedReader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }

        ArrayList<Object> appData;
        appData = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("HW5.csv"))) {
            String temp;

            while ((temp = bufferedReader.readLine()) != null) {
                String[] appDataParam = temp.split(" ");
                appData.add(new AppData(Integer.parseInt(appDataParam[1])));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println(appData);
    }

    public boolean exists() {
        return false;
    }
}
