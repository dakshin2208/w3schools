package w3problems1;

import jdk.dynalink.beans.StaticClass;

import java.util.Scanner;

public class methodsmallnumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b =in.nextInt();
        int c = in.nextInt();
        int result=min(a,b,c);//calling with arguments
        System.out.println("the smallest is :"+result);
    }
    static int min (int a ,int b,int c)
    {
        int max = a;
        if(b<max){
            max=b;

        }  if (c<max) {
            max=c;


        }
        return max;
    }

}
