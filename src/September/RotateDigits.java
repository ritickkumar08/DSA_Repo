package September;

import java.util.Scanner;

public class RotateDigits {
    private boolean isGood(int n){
        boolean diff = false;
        while(n > 0){
            int digit = n % 10;
            if(digit == 3 || digit == 4 || digit == 7) return false;
            else if (digit == 2 || digit == 5 || digit == 6 || digit == 9){
                diff = true;
            }
            n /= 10;
        }
        return diff;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int count = 0;
        RotateDigits ob = new RotateDigits();
        for(int i = 1; i <= n ; i++){
            if (ob.isGood(i)) count++;
        }
        System.out.println(count);
    }
}
