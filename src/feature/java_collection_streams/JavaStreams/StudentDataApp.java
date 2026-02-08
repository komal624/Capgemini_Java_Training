package feature.java_collection_streams.JavaStreams;


import java.io.*;

public class StudentDataApp {

    private static final String FILE_NAME = "students.dat";

    public static void main(String[] args) {

        writeData();
        readData();
    }

    // Write primitive data
    public static void writeData() {
        try (DataOutputStream dos =
                     new DataOutputStream(new FileOutputStream(FILE_NAME))) {

            dos.writeInt(101);
            dos.writeUTF("Komal");
            dos.writeDouble(8.7);

            dos.writeInt(102);
            dos.writeUTF("Aman");
            dos.writeDouble(9.1);

            System.out.println("Student data written successfully.");

        } catch (IOException e) {
            System.out.println("Write Error: " + e.getMessage());
        }
    }

    // Read primitive data
    public static void readData() {
        try (DataInputStream dis =
                     new DataInputStream(new FileInputStream(FILE_NAME))) {

            while (dis.available() > 0) {
                int roll = dis.readInt();
                String name = dis.readUTF();
                double gpa = dis.readDouble();

                System.out.println(roll + " | " + name + " | GPA: " + gpa);
            }

        } catch (IOException e) {
            System.out.println("Read Error: " + e.getMessage());
        }
    }
}