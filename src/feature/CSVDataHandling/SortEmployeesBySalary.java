package feature.CSVDataHandling;



import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SortEmployeesBySalary {

    public static void main(String[] args) {

        String filePath = "employees.csv";
        List<String[]> employees = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            String line = br.readLine(); // skip header

            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                employees.add(data);
            }

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
            return;
        }

        // Sort by salary in descending order
        employees.sort((e1, e2) ->
                Double.compare(
                        Double.parseDouble(e2[3]),
                        Double.parseDouble(e1[3])
                )
        );

        System.out.println("Top 5 Highest Paid Employees:");

        for (int i = 0; i < Math.min(5, employees.size()); i++) {
            String[] emp = employees.get(i);
            System.out.println(
                    "ID: " + emp[0] +
                            " | Name: " + emp[1] +
                            " | Department: " + emp[2] +
                            " | Salary: " + emp[3]
            );
        }
    }
}