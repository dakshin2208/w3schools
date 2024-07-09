package w3problems1;

import java.util.Scanner;

public class methodsumofdigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int result = sum(number);
        System.out.println(result);



    }
    static int sum(int a)
    {
        int sum =0;
         while(a>0)
         {
             int da = a%10;
             sum =sum+da;
             a=a/10;

        }
         return sum;
    }
}
