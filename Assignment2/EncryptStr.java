package Assignment2;

import java.util.Scanner;

public class EncryptStr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the string: ");
        String str = sc.nextLine();

        char[] arr = str.toCharArray();

        int start = 0, end = arr.length - 1, index = 0;
        char[] newArr = new char[arr.length];

        while(start <= end)
        {
            if(start ==  end)
            {
                newArr[index] = arr[start];
                break;
            }
            
            else
            {
                newArr[index] = arr[start];
                index++;
                newArr[index] = arr[end];
            }
            
            index++;
            start++;
            end--;
        }

        str = new String(newArr);
        sc.close();
        System.out.println(str);

    }
}
