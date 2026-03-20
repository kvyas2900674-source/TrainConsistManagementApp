import java.util.HashMap;
import java.util.Map;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=======================================");
        System.out.println(" UC6 - Map Bogie to Capacity ");
        System.out.println("=======================================\n");

        // Create HashMap for bogie → capacity
        Map<String, Integer> trainConsist = new HashMap<>();

        // Adding bogies with capacity
        trainConsist.put("B1", 72);
        trainConsist.put("B2", 64);
        trainConsist.put("B3", 80);
        trainConsist.put("B2", 64); // Duplicate key (overwrites, not duplicates)

        // Display mapping
        System.out.println("Bogie Capacity Mapping:\n");

        for (Map.Entry<String, Integer> entry : trainConsist.entrySet()) {
            System.out.println("Bogie: " + entry.getKey() +
                    " | Capacity: " + entry.getValue());
        }

        // Total bogies
        System.out.println("\nTotal Bogies: " + trainConsist.size());
    }
}