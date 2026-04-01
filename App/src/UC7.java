import java.util.*;

class Bogie {
    String name;
    int capacity;

    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }
}

public class UC7 {
    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 40));

        bogies.sort(Comparator.comparingInt(b -> b.capacity));

        for (Bogie b : bogies) {
            System.out.println("Bogie: " + b.name + " | Capacity: " + b.capacity);
        }

        System.out.println("Program continues...");
    }
}