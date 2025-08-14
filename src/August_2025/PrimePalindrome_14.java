package August_2025;

import java.util.Scanner;

public class PrimePalindrome_14 {
    public boolean isPrime(int n){
        if(n == 2) return true;
        if(n % 2 == 0) return false;

        for(int i = 3 ; i * i <= n ; i+=2){
            if(n % i == 0) return false;
        }
        return true;
    }

    public int makePalindrome(int left){
        String s = String.valueOf(left);
        String rev = new StringBuilder(s.substring(0 , s.length()-1)).reverse().toString();
        return Integer.parseInt(s + rev);
    }



    public int primePalindrome(int n) {
        if (n <= 2) return 2;
        if (n <= 3) return 3;
        if (n <= 5) return 5;
        if (n <= 7) return 7;
        if (n <= 11) return 11;

        for(int len = 1 ; len < 100000 ; len++){
            int palin = makePalindrome(len);
            if(palin >= n && isPrime(palin)){
                return palin;
            }
        }
        return - 1;

    }
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();

            PrimePalindrome_14 number = new PrimePalindrome_14();

            System.out.println(number.primePalindrome(n));
        }
}
