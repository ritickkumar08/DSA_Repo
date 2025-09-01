package August_2025;

import java.util.Scanner;

public class Tohex_29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number" + " ");
        int n = sc.nextInt();


        if (n == 0) System.out.println("0");

        long num = n & 0xFFFFFFFFL;

        StringBuilder sb = new StringBuilder();
        char[] ch = "0123456789abcdef".toCharArray();

        while(num > 0){
            int remainder = (int)(num % 16);
            sb.append(ch[remainder]);
            num /= 16;
        }
        System.out.println(sb.reverse());

    }
}
