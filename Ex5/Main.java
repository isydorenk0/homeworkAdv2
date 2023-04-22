package Ex5;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> queue = new ArrayList<>();
        fillQueue(scanner, queue);
        for (String string : queue) {
            System.out.println(string);
        }
    }
    private static void fillQueue(Scanner scanner, List<String> queue) {
        while (true) {
            System.out.println("Enter string, type 'end' to exit: ");
            String string = scanner.nextLine();
            if (string.equals("end")) break;
            queue.add(string);
        }
    }
}
