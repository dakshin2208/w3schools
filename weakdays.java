package w3problems1;

import java.util.Scanner;

public class weakdays {
    public static void main(String[] args) {
        while(true){
            System.out.println("select number from below:");
            for (int i = 1; i < 8; i++) {
                System.out.println(i);
            }
            System.out.println("enter the number:");
            Scanner in= new Scanner(System.in);
            int days =in.nextInt();
            switch(days){
                case 1:
                    System.out.println("sunday");
                    break;
                case 2:
                    System.out.println("monday");
                    break;
                case 3:
                    System.out.println("tuesday");
                    break;
                case 4:
                    System.out.println("wednesday");
                    break;
                case 5:
                    System.out.println("thursday");
                    break;
                case 6:
                    System.out.println("friday");
                    break;
                case 7:
                    System.out.println("saturday");
                    break;

            }
             if(days>=8)
            {
                break;
            }



        }


    }
}
