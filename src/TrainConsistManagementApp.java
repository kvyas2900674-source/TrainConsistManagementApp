import java.util.LinkedHashSet;
import java.util.Set;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=======================================");
        System.out.println(" UC5 - Preserve Insertion Order of Bogies ");
        System.out.println("=======================================\n");

        // Create train consist using LinkedHashSet
        Set<String> trainConsist = new LinkedHashSet<>();

        // Adding bogies (in a specific order)
        trainConsist.add("B3");
        trainConsist.add("B1");
        trainConsist.add("B2");
        trainConsist.add("B2"); // Duplicate (ignored)

        // Display train consist
        System.out.println("Bogies added (insertion order preserved, duplicates removed).\n");

        System.out.println("Current Train Consist (Insertion Order):");
        for (String bogie : trainConsist) {
            System.out.println(bogie);
        }

        // Display total count
        System.out.println("\nTotal Unique Bogies: " + trainConsist.size());
    }
}