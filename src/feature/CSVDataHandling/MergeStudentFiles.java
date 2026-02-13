package feature.CSVDataHandling;


import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class MergeStudentFiles {

    public static void main(String[] args) {

        String file1 = "students1.csv";
        String file2 = "students2.csv";
        String outputFile = "merged_students.csv";

        Map<String, String[]> studentMap = new HashMap<>();

        // Step 1: Read students1.csv
        try (BufferedReader br1 = new BufferedReader(new FileReader(file1))) {

            br1.readLine(); // skip header
            String line;

            while ((line = br1.readLine()) != null) {
                String[] data = line.split(",");
                studentMap.put(data[0], data);  // ID as key
            }

        } catch (IOException e) {
            System.out.println("Error reading file1: " + e.getMessage());
            return;
        }

        // Step 2: Read students2.csv and merge
        try (BufferedReader br2 = new BufferedReader(new FileReader(file2));
             BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile))) {

            bw.write("ID,Name,Age,Marks,Grade");
            bw.newLine();

            br2.readLine(); // skip header
            String line;

            while ((line = br2.readLine()) != null) {

                String[] data2 = line.split(",");
                String id = data2[0];

                if (studentMap.containsKey(id)) {

                    String[] data1 = studentMap.get(id);

                    String mergedLine =
                            data1[0] + "," +
                                    data1[1] + "," +
                                    data1[2] + "," +
                                    data2[1] + "," +
                                    data2[2];

                    bw.write(mergedLine);
                    bw.newLine();
                }
            }

            System.out.println("Files merged successfully!");

        } catch (IOException e) {
            System.out.println("Error merging files: " + e.getMessage());
        }
    }
}