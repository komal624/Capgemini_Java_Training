package DataStructures.LinearandBinarySearch;

public class SearchSentence {
    public static void main(String[] args) {
        String[] sentences = {
                "Java is fun",
                "I love programming",

        };

        String word = "programming";
        String result = "Not Found";

        for (String s : sentences) {
            if (s.contains(word)) {
                result = s;
                break;
            }
        }

        System.out.println(result);
    }
}