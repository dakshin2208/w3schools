package w3problems1;

import java.util.Scanner;

public class avaragemethod {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a =in.nextInt();
        int b=in.nextInt();
        int c=in.nextInt();
        int avg = avg(a,b,c);
        System.out.println("the avarage is :"+avg);

    }
    static int avg(int a ,int b,int c)
    {
        int sum =0;
        sum=a+b+c;
        int avg = sum/3;
        return avg;

    }
}
