public class UC16 {

    public static void bubbleSort(int[] capacities) {
        int n = capacities.length;

        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (capacities[j] > capacities[j + 1]) {
                    int temp = capacities[j];
                    capacities[j] = capacities[j + 1];
                    capacities[j + 1] = temp;
                    swapped = true;
                }
            }

            if (!swapped) {
                break;
            }
        }
    }

    public static void display(int[] capacities) {
        for (int c : capacities) {
            System.out.print(c + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int[] capacities1 = {72, 56, 24, 70, 60};
        bubbleSort(capacities1);
        display(capacities1);

        int[] capacities2 = {24, 56, 60, 70, 72};
        bubbleSort(capacities2);
        display(capacities2);

        int[] capacities3 = {72, 56, 56, 24};
        bubbleSort(capacities3);
        display(capacities3);

        int[] capacities4 = {50};
        bubbleSort(capacities4);
        display(capacities4);

        int[] capacities5 = {40, 40, 40};
        bubbleSort(capacities5);
        display(capacities5);
    }
}