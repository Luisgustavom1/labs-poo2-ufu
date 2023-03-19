import java.util.ArrayList;

public class Ordenabled {
    public static void OrderVet(Comparable[] comparables) {
        Comparable temp;
        boolean ordered = false;

        while (!ordered) {
            ordered = true;

            for (int j = 0; j < comparables.length - 1; j++) {
                if (comparables[j].compareTo(comparables[j + 1]) > 0) {
                    temp = comparables[j];
                    comparables[j] = comparables[j + 1];
                    comparables[j + 1] = temp;
                    ordered = false;
                }
            }
        }
    }

    public static void OrderArr(ArrayList<Comparable> comparables) {
        Comparable temp;
        boolean ordered = false;

        while (!ordered) {
            ordered = true;
            
              for (int j = 0; j < comparables.size() - 1; j++) {
                if (comparables.get(j).compareTo(comparables.get(j + 1)) > 0) {
                    temp = comparables.get(j);
                    comparables.set(j, comparables.get(j + 1));
                    comparables.set(j + 1, temp);
                    ordered = false;
                }
            }
        }
    }
}