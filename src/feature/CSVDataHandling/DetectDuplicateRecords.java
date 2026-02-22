package feature.CSVDataHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class DetectDuplicateRecords {

    public static void main(String[] args) {

        String filePath = "students.csv";
        Set<String> seenIDs = new HashSet<>();
        boolean duplicateFound = false;

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            String line = br.readLine(); // skip header

            while ((line = br.readLine()) != null) {

                String[] data = line.split(",");
                String id = data[0];

                if (!seenIDs.add(id)) {
                    System.out.println("Duplicate Found: " + line);
                    duplicateFound = true;
                }
            }

            if (!duplicateFound) {
                System.out.println("No duplicates found.");
            }

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}