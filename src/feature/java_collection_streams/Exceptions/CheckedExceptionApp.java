package feature.java_collection_streams.Exceptions;

import java.io.*;

public class CheckedExceptionApp {

    public static void main(String[] args) {

        String fileName = "data.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println("File not found");
        }
    }
}
