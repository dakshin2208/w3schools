package w3problems1;

import java.util.Scanner;

public class value2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int result = count(num);
        System.out.println("the number of 2 in given number:"+result);
    }
    static int count(int n ){
        int s=0;
        while(n>0)
        {
            int num = n%10;
            if(num==2)
            {
                s=s+1;
            }
            n=n/10;
        }
        return s;
    }
}
