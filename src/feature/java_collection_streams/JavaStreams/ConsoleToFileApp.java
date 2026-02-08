package feature.java_collection_streams.JavaStreams;

import java.io.*;

public class ConsoleToFileApp {
    public static void main(String[] args) {

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             FileWriter writer = new FileWriter("user_data.txt")) {

            System.out.print("Enter Name: ");
            String name = reader.readLine();

            System.out.print("Enter Age: ");
            String age = reader.readLine();

            System.out.print("Enter Favorite Programming Language: ");
            String language = reader.readLine();

            writer.write("Name: " + name + "\n");
            writer.write("Age: " + age + "\n");
            writer.write("Favorite Language: " + language + "\n");

            System.out.println("User data saved to file.");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}