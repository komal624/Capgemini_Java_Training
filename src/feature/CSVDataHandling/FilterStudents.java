package feature.CSVDataHandling;

import java.io.*;

public class FilterStudents {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader("students.csv"));
        br.readLine();

        String line;

        while ((line = br.readLine()) != null) {
            String[] data = line.split(",");
            int marks = Integer.parseInt(data[3]);

            if (marks > 80) {
                System.out.println(line);
            }
        }

        br.close();
    }
}