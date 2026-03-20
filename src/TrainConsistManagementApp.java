import java.util.HashSet;
import java.util.Set;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=======================================");
        System.out.println(" UC3 - Track Unique Bogie IDs ");
        System.out.println("=======================================\n");

        // Create train consist using HashSet
        Set<String> trainConsist = new HashSet<>();

        // Adding bogies
        trainConsist.add("B1");
        trainConsist.add("B2");
        trainConsist.add("B3");
        trainConsist.add("B2"); // Duplicate

        // Display train consist
        System.out.println("Bogies added (duplicates automatically ignored).\n");

        System.out.println("Current Train Consist:");
        for (String bogie : trainConsist) {
            System.out.println(bogie);
        }

        // Display total count
        System.out.println("\nTotal Unique Bogies: " + trainConsist.size());
    }
}