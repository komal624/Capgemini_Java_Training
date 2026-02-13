package feature.CSVDataHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Pattern;

public class ValidateCSVData {

    public static void main(String[] args) {

        String filePath = "data.csv";

        // Regex patterns
        Pattern emailPattern =
                Pattern.compile("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$");

        Pattern phonePattern =
                Pattern.compile("\\d{10}");

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            String line = br.readLine(); // skip header

            while ((line = br.readLine()) != null) {

                String[] data = line.split(",");

                String email = data[2];
                String phone = data[3];

                boolean emailValid = emailPattern.matcher(email).matches();
                boolean phoneValid = phonePattern.matcher(phone).matches();

                if (!emailValid || !phoneValid) {
                    System.out.println("Invalid Record: " + line);

                    if (!emailValid) {
                        System.out.println("  → Invalid Email Format");
                    }

                    if (!phoneValid) {
                        System.out.println("  → Phone must contain exactly 10 digits");
                    }

                    System.out.println();
                }
            }

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}