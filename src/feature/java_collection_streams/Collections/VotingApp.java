package feature.java_collection_streams.Collections;

public class VotingApp {
    public static void main(String[] args) {
        VotingSystem system = new VotingSystem();

        system.castVote("Alice");
        system.castVote("Bob");
        system.castVote("Alice");
        system.castVote("Charlie");

        system.displayVoteOrder();
        System.out.println();
        system.displayResultsSorted();
    }
}