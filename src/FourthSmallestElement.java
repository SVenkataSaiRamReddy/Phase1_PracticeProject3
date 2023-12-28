import java.util.*;

public class FourthSmallestElement {
    public static void main(String[] args) {
        List<Integer> unsortedList = Arrays.asList(9, 4, 7, 2, 8, 3, 5, 1, 6, 4, 2, 2, 8);

        int fourthSmallest = findFourthSmallest(unsortedList);
        int fourthSmallestDistinct = findFourthSmallestDistinct(unsortedList);

        System.out.println("The fourth smallest element in the unsorted list is: " + fourthSmallest);
        System.out.println("The fourth smallest distinct element in the unsorted list is: " + fourthSmallestDistinct);
    }

    public static int findFourthSmallest(List<Integer> list) {
        if (list.size() < 4) {
            System.out.println("List has less than four elements");
            return -1;
        }

        List<Integer> sortedList = new ArrayList<>(list);
        Collections.sort(sortedList);

        return sortedList.get(3);
    }

    public static int findFourthSmallestDistinct(List<Integer> list) {
        Set<Integer> uniqueSet = new HashSet<>(list);

        if (uniqueSet.size() < 4) {
            System.out.println("List has less than four distinct elements");
            return -1;
        }

        List<Integer> distinctList = new ArrayList<>(uniqueSet);
        Collections.sort(distinctList);

        return distinctList.get(3);
    }
}
