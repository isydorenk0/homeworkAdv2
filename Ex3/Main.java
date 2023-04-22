package Ex3;

import java.util.*;

public class Main {
    public static <List> void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of the list: ");
        int size = scanner.nextInt();
        LinkedList<Integer> intList = getIntegerList(scanner, size);
        System.out.println(intList);
        System.out.println("Minimum is: " + getMinimumIterator(intList));
    }

    private static int getMinimumIterator(LinkedList<Integer> intList) {
        ListIterator<Integer> iterator = intList.listIterator();
        int min = iterator.next();
        while (iterator.hasNext()) {
            int current = iterator.next();
            if (min > current) min = current;
        }
        return min;
    }

    private static LinkedList<Integer> getIntegerList(Scanner scanner, int size) {
        LinkedList<Integer> intList = new LinkedList<>();
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            intList.add(random.nextInt(100));
        }
        return intList;
    }
}
