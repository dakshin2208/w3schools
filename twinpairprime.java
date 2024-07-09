package w3problems1;

public class twinpairprime {
    public static void main(String[] args) {
        for (int i = 2; i < 100; i++) {
            if(isprime(i)&&isprime(i+2)){
                System.out.printf("(%d %d)\n",i,i+2);

            }

        }
    }
    static boolean isprime(int a){
        if(a<2)
            return false;
        for (int i = 2; i <= a/2; i++) {
            if(a%i==0) return false;


        }
        return true;
    }
}
