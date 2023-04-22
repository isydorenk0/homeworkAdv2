package Ex2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> wordsList = new ArrayList<>();
        for(int i = 0; i < 5; i++){
            System.out.println("Enter word " + (i + 1) + ": ");
            wordsList.add(scanner.nextLine());
        }
        List<String> doubleWordsList = doubleValues(wordsList);
        System.out.println(wordsList);
    }

    private static List<String> doubleValues(List<String> wordsList) {
        int bound = 2 * wordsList.size();
        for (int i = 1; i < bound; i += 2){
            wordsList.add(i, wordsList.get(i-1));
        }
        return wordsList;
    }
}
