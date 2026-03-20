import java.util.ArrayList;
import java.util.List;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=======================================");
        System.out.println(" UC2 - Add Passenger Bogies to Train ");
        System.out.println("=======================================\n");

        // Create train consist using ArrayList
        List<String> trainConsist = new ArrayList<>();

        // Adding bogies
        trainConsist.add("B1");
        trainConsist.add("B2");
        trainConsist.add("B3");

        // Display train consist
        System.out.println("Bogies successfully added to the train.");

        System.out.println("\nCurrent Train Consist:");
        for (String bogie : trainConsist) {
            System.out.println(bogie);
        }

        // Display total count
        System.out.println("\nTotal Bogies: " + trainConsist.size());
    }
}
