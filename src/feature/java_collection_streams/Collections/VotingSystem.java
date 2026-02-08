package feature.java_collection_streams.Collections;

import java.util.*;

public class VotingSystem {

    private HashMap<String, Integer> votes = new HashMap<>();
    private LinkedHashMap<String, Integer> voteOrder = new LinkedHashMap<>();

    public void castVote(String candidate) {
        votes.put(candidate, votes.getOrDefault(candidate, 0) + 1);
        voteOrder.put(candidate, votes.get(candidate));
    }

    // Display sorted results
    public void displayResultsSorted() {
        TreeMap<String, Integer> sorted = new TreeMap<>(votes);
        System.out.println("Sorted Results:");
        for (String c : sorted.keySet()) {
            System.out.println(c + " -> " + sorted.get(c));
        }
    }

    // Display vote order
    public void displayVoteOrder() {
        System.out.println("Vote Order:");
        for (String c : voteOrder.keySet()) {
            System.out.println(c + " -> " + voteOrder.get(c));
        }
    }
}