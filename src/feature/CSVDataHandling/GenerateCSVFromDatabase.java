package feature.CSVDataHandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.*;

public class GenerateCSVFromDatabase {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/company";
        String username = "root";
        String password = "root";   // change as per your DB

        String outputFile = "employee_report.csv";

        String query = "SELECT id, name, department, salary FROM employees";

        try (
                Connection conn = DriverManager.getConnection(url, username, password);
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(query);
                BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile))
        ) {

            // Write Header
            bw.write("Employee ID,Name,Department,Salary");
            bw.newLine();

            // Write Data
            while (rs.next()) {

                int id = rs.getInt("id");
                String name = rs.getString("name");
                String department = rs.getString("department");
                double salary = rs.getDouble("salary");

                bw.write(id + "," + name + "," + department + "," + salary);
                bw.newLine();
            }

            System.out.println("CSV Report Generated Successfully!");

        } catch (SQLException e) {
            System.out.println("Database Error: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("File Error: " + e.getMessage());
        }
    }
}
