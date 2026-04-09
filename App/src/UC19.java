import java.util.Arrays;

public class UC19 {

    public static boolean binarySearch(String[] bogieIds, String key) {

        if (bogieIds == null || bogieIds.length == 0) {
            return false;
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

        String[] bogies1 = {"BG101","BG205","BG309","BG412","BG550"};
        System.out.println(binarySearch(bogies1, "BG309"));
        System.out.println(binarySearch(bogies1, "BG999"));
        System.out.println(binarySearch(bogies1, "BG101"));
        System.out.println(binarySearch(bogies1, "BG550"));

        String[] single = {"BG101"};
        System.out.println(binarySearch(single, "BG101"));

        String[] empty = {};
        System.out.println(binarySearch(empty, "BG101"));

        String[] unsorted = {"BG309","BG101","BG550","BG205","BG412"};
        System.out.println(binarySearch(unsorted, "BG205"));
    }
}