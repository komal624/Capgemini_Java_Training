package feature.java_collection_streams.JavaStreams;

import java.io.*;

public class BufferedCopyApp {

    private static final int BUFFER_SIZE = 4096;

    public static void main(String[] args) {

        String source = "largefile.dat";
        String destBuffered = "buffered_copy.dat";
        String destNormal = "normal_copy.dat";

        long bufferedTime = copyBuffered(source, destBuffered);
        long normalTime = copyNormal(source, destNormal);

        System.out.println("Buffered Stream Time (ns): " + bufferedTime);
        System.out.println("Normal Stream Time (ns): " + normalTime);
    }

    // Buffered Copy
    public static long copyBuffered(String src, String dest) {
        long start = System.nanoTime();

        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(src));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(dest))) {

            byte[] buffer = new byte[BUFFER_SIZE];
            int bytesRead;

            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }

        } catch (IOException e) {
            System.out.println("Buffered Copy Error: " + e.getMessage());
        }

        return System.nanoTime() - start;
    }

    // Normal Copy
    public static long copyNormal(String src, String dest) {
        long start = System.nanoTime();

        try (FileInputStream fis = new FileInputStream(src);
             FileOutputStream fos = new FileOutputStream(dest)) {

            byte[] buffer = new byte[BUFFER_SIZE];
            int bytesRead;

            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }

        } catch (IOException e) {
            System.out.println("Normal Copy Error: " + e.getMessage());
        }

        return System.nanoTime() - start;
    }
}