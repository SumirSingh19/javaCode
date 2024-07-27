package Assignment2;

import java.util.Scanner;

public class expression {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the expression: ");
        
        String exp = sc.nextLine();
        
        System.out.println("The answer to your expression is:- "+evaluate(exp));

        sc.close();
    }

    public static int evaluate(String exp)
    {   
        String newStr = exp.replaceAll("\\s+", "");
        
        int start = 0;
        int open = newStr.indexOf("(");
        int close = newStr.indexOf(")");

        String operator = newStr.substring(start, open);
        String nums = newStr.substring(open + 1, close);
        
        operator = operator.toUpperCase();
        String[] numbers = nums.split(",");

        int num1 = Integer.parseInt(numbers[0]);
        int num2 = Integer.parseInt(numbers[1]);

        if(operator.equals("ADD"))
        return num1+num2;

        else if(operator.equals("SUB") )
        return num1-num2;

        else if(operator.equals("MUL") )
        return num1*num2;

        else if(operator.equals("DIV"))
        {
            if(num2 == 0)
            return 0;
            
            return num1/num2;
        }
        
        
        else if(operator.equals("POW"))
        {
            int result = 1;
            while(num2 > 0)
            {
                result *= num1;
                num2--;
            }
            return result;
        }

        return 0;
    }
}
