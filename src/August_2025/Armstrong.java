package August_2025;

import java.util.Scanner;

public class Armstrong {
    public boolean Check(int n){
        int len = String.valueOf(n).length();
        int num = n;
        int digit = 0;
        int sum = 0;

        while(num > 0){
            digit = num % 10;
            sum = (int) (sum + Math.pow(digit,len));
            num = num/10;
        }
       return sum == n;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Armstrong number = new Armstrong();
        boolean result = number.Check(n);
        System.out.print(result);

    }
}
