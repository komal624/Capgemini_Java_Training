package feature.CSVDataHandling;

import java.io.*;

public class CountRows {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader("students.csv"));
        br.readLine(); // skip header

        int count = 0;
        while (br.readLine() != null) {
            count++;
        }

        System.out.println("Total Records: " + count);
        br.close();
    }
}