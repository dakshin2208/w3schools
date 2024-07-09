package w3problems1;

import java.util.Scanner;

public class vowelorconsonants {
    public static void main(String[] args) {
        System.out.println("enter the letter:");
        Scanner in =new Scanner(System.in);
        String letter =in.next().trim();
        boolean vowels=letter.equals("a")||letter.equals("A")||letter.equals("E")||letter.equals("e")||letter.equals("i")||letter.equals("I")||letter.equals("o")||letter.equals("O")||letter.equals("U")||letter.equals("u");
    if(vowels)
    {
        System.out.println("vowels");
    }
    else {
        System.out.println("consonants");
    }
    }
}
