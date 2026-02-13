package feature.CSVDataHandling;

import java.io.*;

public class WriteCSV {

    public static void main(String[] args) {

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("employees.csv"))) {

            bw.write("ID,Name,Department,Salary\n");

            bw.write("1,Komal,IT,60000\n");
            bw.write("2,Riya,HR,45000\n");
            bw.write("3,Aman,Finance,55000\n");
            bw.write("4,Neha,IT,70000\n");
            bw.write("5,Raj,Marketing,50000\n");

            System.out.println("File Created Successfully!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}