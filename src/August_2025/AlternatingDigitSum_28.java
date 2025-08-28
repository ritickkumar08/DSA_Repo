package August_2025;

import java.util.Scanner;

public class AlternatingDigitSum_28 {

    private int sum(int n){
        String s = String.valueOf(n);
        int sum = 0;
        int sign = 1;
        for(int i = 0 ; i < s.length(); i++){
            int digit = s.charAt(i) - '0';
            sum = sign*sum + digit;
            sign *= -1;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        AlternatingDigitSum_28 ob = new AlternatingDigitSum_28();
        int result = ob.sum(n);
        System.out.println(result);
    }
}
