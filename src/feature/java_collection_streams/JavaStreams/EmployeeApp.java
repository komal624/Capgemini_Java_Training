package feature.java_collection_streams.JavaStreams;


import java.io.*;
import java.util.*;

public class EmployeeApp {

    private static final String FILE_NAME = "employees.ser";

    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(101, "Komal", "IT", 50000));
        employees.add(new Employee(102, "Aman", "HR", 45000));

        serializeEmployees(employees);
        deserializeEmployees();
    }

    // Serialize
    public static void serializeEmployees(List<Employee> employees) {
        try (ObjectOutputStream oos =
                     new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {

            oos.writeObject(employees);
            System.out.println("Employees serialized successfully.");

        } catch (IOException e) {
            System.out.println("Serialization Error: " + e.getMessage());
        }
    }

    // Deserialize
    public static void deserializeEmployees() {
        try (ObjectInputStream ois =
                     new ObjectInputStream(new FileInputStream(FILE_NAME))) {

            List<Employee> list = (List<Employee>) ois.readObject();
            System.out.println("Deserialized Employees:");

            for (Employee e : list) {
                System.out.println(e);
            }

        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Deserialization Error: " + e.getMessage());
        }
    }
}