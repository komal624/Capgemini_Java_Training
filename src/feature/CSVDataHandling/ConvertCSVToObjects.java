package feature.CSVDataHandling;

import feature.CSVDataHandling.Student;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ConvertCSVToObjects {

    public static void main(String[] args) {

        String filePath = "students.csv";
        List<Student> students = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            String line = br.readLine(); // skip header

            while ((line = br.readLine()) != null) {

                String[] data = line.split(",");

                Student student = new Student(
                        Integer.parseInt(data[0]),
                        data[1],
                        Integer.parseInt(data[2]),
                        Integer.parseInt(data[3])
                );

                students.add(student);
            }

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
            return;
        }

        System.out.println("Students Loaded Successfully:\n");

        students.forEach(System.out::println);
    }
}