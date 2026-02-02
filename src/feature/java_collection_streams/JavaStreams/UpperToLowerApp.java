package feature.java_collection_streams.JavaStreams;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class UpperToLowerApp {

    public static void main(String[] args) {

        String inputFile = "input.txt";
        String outputFile = "output_lowercase.txt";

        try (
                FileReader fr = new FileReader(inputFile, StandardCharsets.UTF_8);
                BufferedReader br = new BufferedReader(fr);

                FileWriter fw = new FileWriter(outputFile, StandardCharsets.UTF_8);
                BufferedWriter bw = new BufferedWriter(fw)
        ) {

            int ch;
            while ((ch = br.read()) != -1) {
                bw.write(Character.toLowerCase((char) ch));
            }

            System.out.println("Conversion completed successfully.");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
