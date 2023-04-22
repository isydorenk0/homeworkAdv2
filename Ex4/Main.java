package Ex4;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, String> families = new HashMap<>();
        fillDictionary(scanner, families);
        System.out.println(families);

        showFamily(scanner, families);
    }

    private static void showFamily(Scanner scanner, HashMap<String, String> families) {
        System.out.println("Enter city: ");
        String city = scanner.nextLine();
        if (families.containsKey(city)) {
            System.out.println(families.get(city));
        } else {
            System.out.println(city + " was not found.");
        }
    }

    private static void fillDictionary(Scanner scanner, HashMap<String, String> families) {
        System.out.println("Enter family and city, type 'end' to exit.");
        while (true) {
            System.out.println("Enter family: ");
            String family = scanner.nextLine();
            if (family.equals("end")) break;
            System.out.println("Enter city: ");
            String city = scanner.nextLine();
            if (city.equals("end")) break;

            families.put(city, family);
        }
    }
}
