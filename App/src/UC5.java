import java.util.*;

public class UC5 {
    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        Set<String> formation = new LinkedHashSet<>();

        formation.add("Engine");
        formation.add("Sleeper");
        formation.add("Cargo");
        formation.add("Guard");

        formation.add("Sleeper");

        System.out.println("Train Formation: " + formation);

        System.out.println("Program continues...");
    }
}