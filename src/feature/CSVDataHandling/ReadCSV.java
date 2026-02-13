package feature.CSVDataHandling;

import java.io.*;

public class ReadCSV {

    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("students.csv"))) {

            String line = br.readLine(); // header

            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");

                System.out.println("ID: " + data[0] +
                        " | Name: " + data[1] +
                        " | Age: " + data[2] +
                        " | Marks: " + data[3]);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}