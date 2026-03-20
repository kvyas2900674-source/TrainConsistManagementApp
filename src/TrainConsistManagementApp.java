import java.util.Set;
import java.util.TreeSet;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=======================================");
        System.out.println(" UC4 - Maintain Ordered Bogie IDs ");
        System.out.println("=======================================\n");

        // Create train consist using TreeSet (SortedSet behavior)
        Set<String> trainConsist = new TreeSet<>();

        // Adding bogies (out of order intentionally)
        trainConsist.add("B3");
        trainConsist.add("B1");
        trainConsist.add("B2");
        trainConsist.add("B2"); // Duplicate (ignored)

        // Display sorted train consist
        System.out.println("Bogies added (automatically sorted & duplicates removed).\n");

        System.out.println("Current Train Consist (Sorted):");
        for (String bogie : trainConsist) {
            System.out.println(bogie);
        }

        // Display total count
        System.out.println("\nTotal Unique Bogies: " + trainConsist.size());
    }
}