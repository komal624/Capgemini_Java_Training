package feature.CSVDataHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ProcessLargeCSV {

    public static void main(String[] args) {

        String filePath = "large_file.csv";
        int batchSize = 100;
        int totalProcessed = 0;

        List<String> batch = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            String line = br.readLine(); // skip header

            while ((line = br.readLine()) != null) {

                batch.add(line);

                if (batch.size() == batchSize) {

                    // Process current batch
                    processBatch(batch);

                    totalProcessed += batch.size();
                    System.out.println("Processed records: " + totalProcessed);

                    batch.clear(); // free memory
                }
            }

            // Process remaining records
            if (!batch.isEmpty()) {
                processBatch(batch);
                totalProcessed += batch.size();
            }

            System.out.println("Final Total Records Processed: " + totalProcessed);

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }

    private static void processBatch(List<String> batch) {

        // Simulate processing
        for (String record : batch) {
            // Example: Just print first 10 chars
            // System.out.println(record);
        }
    }
}