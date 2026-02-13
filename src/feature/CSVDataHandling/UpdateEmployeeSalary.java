package feature.CSVDataHandling;



import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class UpdateEmployeeSalary {

    public static void main(String[] args) {

        String inputFile = "employees.csv";
        String outputFile = "updated_employees.csv";

        List<String> updatedRecords = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(inputFile))) {

            String line = br.readLine(); // read header
            updatedRecords.add(line);   // keep header

            while ((line = br.readLine()) != null) {

                String[] data = line.split(",");

                if (data[2].equalsIgnoreCase("IT")) {
                    double salary = Double.parseDouble(data[3]);
                    salary = salary * 1.10;  // increase by 10%
                    data[3] = String.valueOf(salary);
                }

                updatedRecords.add(String.join(",", data));
            }

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
            return;
        }

        // Write updated data to new file
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile))) {

            for (String record : updatedRecords) {
                bw.write(record);
                bw.newLine();
            }

            System.out.println("Updated file created: " + outputFile);

        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }
    }
}