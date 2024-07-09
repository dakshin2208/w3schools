package w3problems1;

import java.util.Scanner;

public class nnandsum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        int sum=0;
//        for(int i = 1;i<=n;i++)
//        {
//            System.out.println("the natural numbers:");
//            System.out.println(i);
//            sum=sum+i;
//
//        }
//        System.out.println("the sum of the natural number:");
//        System.out.println(sum);
//    }

//         int sum=0;
//        System.out.println("enter how many time to run loop");
//         int range =in.nextInt();
//        for(int i=1;i<=range;i++)
//        {
//            System.out.print("enter the"+i +"number");
//            int a = in.nextInt();
//            sum=sum+a;
//
//
//        }
//        System.out.println("the sum :"+sum);
//        int avg = sum/range;
//        System.out.println("the avg:"+avg);

//

        System.out.print("what table you want ??");
        int table =in.nextInt();
        int multiples;
        for(int i=1;i<=20;i++)
        {
            multiples=table*i;
            System.out.println(i +"*"+ table + "=" +multiples);
        }


    }

}
