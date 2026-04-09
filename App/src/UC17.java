import java.util.Arrays;

public class UC17 {

    public static void sortAndDisplay(String[] bogieNames) {
        Arrays.sort(bogieNames);
        System.out.println(Arrays.toString(bogieNames));
    }

    public static void main(String[] args) {

        String[] bogies1 = {"Sleeper","AC Chair","First Class","General","Luxury"};
        sortAndDisplay(bogies1);

        String[] bogies2 = {"Luxury","General","Sleeper","AC Chair"};
        sortAndDisplay(bogies2);

        String[] bogies3 = {"AC Chair","First Class","General"};
        sortAndDisplay(bogies3);

        String[] bogies4 = {"Sleeper","AC Chair","Sleeper","General"};
        sortAndDisplay(bogies4);

        String[] bogies5 = {"Sleeper"};
        sortAndDisplay(bogies5);
    }
}