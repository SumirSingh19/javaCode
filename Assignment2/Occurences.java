package Assignment2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Occurences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your word or sentence:- ");
        String input = sc.nextLine();

        input = input.toLowerCase();

        int[] count = new int[26];
        
        // Count occurrences of each letter
        for (char c : input.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                count[c - 'a']++;
            }
        }

        List<Integer> sorted = new ArrayList<>();
        for (int i = 0; i <  26; i++) {
            if (count[i] > 0) {
                sorted.add(count[i]);
            }
        }

        sorted.sort(Collections.reverseOrder());

        for(int i=0; i<sorted.size(); i++)
        System.out.print(sorted.get(i)+" ");

        sc.close();
    }
}
