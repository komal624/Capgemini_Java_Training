package feature.java_collection_streams.JavaStreams;

import java.io.*;

public class ErrorLineReaderApp {

    public static void main(String[] args) {

        String fileName = "large_log.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {

            String line;
            while ((line = br.readLine()) != null) {
                if (line.toLowerCase().contains("error")) {
                    System.out.println(line);
                }
            }

        } catch (IOException e) {
            System.out.println("Read Error: " + e.getMessage());
        }
    }
}