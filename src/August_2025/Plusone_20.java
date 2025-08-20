package August_2025;

import java.util.Scanner;

public class Plusone_20 {
    public int[] incremented(int[] digits){
        int len = digits.length;

        for(int i = len - 1 ; i >= 0 ; i--){
            if(digits[i] < 9){
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] newNumber = new int[len+1];
        newNumber[0] = 1;
        return newNumber;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] digits = new int[n];
        for(int i = 0 ; i < n ; i++) {
            digits[i] = sc.nextInt();
        }

        Plusone_20 result = new Plusone_20();
        int[] incrementedNumber = result.incremented(digits);
        for(int num : incrementedNumber){
            System.out.print(num + " ");
        }

    }
}
