package DataStructures.runtimeanalysis.bigo;

public class StringPerformance {

    public static void main(String[] args) {
        int N = 100000;

        long start, end;

        // String
        start = System.nanoTime();
        String s = "";
        for (int i = 0; i < N; i++) {
            s += "hello";
        }
        end = System.nanoTime();
        System.out.println("String Time (ns): " + (end - start));

        // StringBuilder
        start = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.append("hello");
        }
        end = System.nanoTime();
        System.out.println("StringBuilder Time (ns): " + (end - start));

        // StringBuffer
        start = System.nanoTime();
        StringBuffer sbf = new StringBuffer();
        for (int i = 0; i < N; i++) {
            sbf.append("hello");
        }
        end = System.nanoTime();
        System.out.println("StringBuffer Time (ns): " + (end - start));
    }
}
