package feature.java_collection_streams.JavaStreams;

import java.io.*;

public class ImageByteArrayApp {
    public static void main(String[] args) {

        String inputImage = "input.jpg";
        String outputImage = "output.jpg";

        try (FileInputStream fis = new FileInputStream(inputImage);
             ByteArrayOutputStream baos = new ByteArrayOutputStream()) {

            byte[] buffer = new byte[4096];
            int bytesRead;

            while ((bytesRead = fis.read(buffer)) != -1) {
                baos.write(buffer, 0, bytesRead);
            }

            byte[] imageBytes = baos.toByteArray();

            try (ByteArrayInputStream bais = new ByteArrayInputStream(imageBytes);
                 FileOutputStream fos = new FileOutputStream(outputImage)) {

                while ((bytesRead = bais.read(buffer)) != -1) {
                    fos.write(buffer, 0, bytesRead);
                }
            }

            System.out.println("Image copied successfully using ByteArray streams.");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}