package Assignment1;

import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the time in which you want to calculate the distance: ");
        int X = sc.nextInt();
        double g = 9.8;
        double d = g * (X*X);

        System.out.println("Your calculated distance is : "+d + " meters");

        sc.close();
    }    
}
