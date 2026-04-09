import java.util.Arrays;

public class UC20 {

    public static boolean searchBogie(String[] bogieIds, String key) {

        if (bogieIds == null || bogieIds.length == 0) {
            throw new IllegalStateException("No bogies available in the train. Cannot perform search.");
        }

        Arrays.sort(bogieIds);

        int low = 0;
        int high = bogieIds.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            int cmp = bogieIds[mid].compareTo(key);

            if (cmp == 0) {
                return true;
            } else if (cmp < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        try {
            String[] empty = {};
            System.out.println(searchBogie(empty, "BG101"));
        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }

        String[] bogies1 = {"BG101","BG205"};
        System.out.println(searchBogie(bogies1, "BG101"));

        String[] bogies2 = {"BG101","BG205","BG309"};
        System.out.println(searchBogie(bogies2, "BG205"));
        System.out.println(searchBogie(bogies2, "BG999"));

        String[] single = {"BG101"};
        System.out.println(searchBogie(single, "BG101"));
    }
}