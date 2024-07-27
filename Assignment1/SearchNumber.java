package Assignment1;

import java.util.Scanner;

public class SearchNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter how many numbers of 6 digits you want to take in input: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the numbers:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Now enter the number you want to search: ");
        int s = sc.nextInt();
        int comparisons = binarySearch(arr, s);
        
        if (comparisons != -1) {
            System.out.println("The number of comparisons required to find the number: " + comparisons);
        } else {
            System.out.println("Not Found :"+ -1);
        }

        sc.close();
    }

    public static int binarySearch(int[] arr, int target) {
        int start = 0, end = arr.length - 1, mid;
        int comparisons = 0;
        
        while (start <= end) {
            mid = start + (end - start) / 2;
            comparisons++;

            if (arr[mid] == target) {
                return comparisons;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
