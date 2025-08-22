package August_2025;

import java.util.Scanner;

public class HappyNumber_22 {
    private int square(int n){
        int ans = 0;
        while(n > 0){
            int digit = n % 10;
            ans += digit * digit;
            n /= 10;
        }
        return ans;
    }
    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;

        do{
            slow = square(slow);
            fast = square(square(fast));
        }while(slow != fast);

        return slow == 1;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        HappyNumber_22 ob = new HappyNumber_22();
        boolean result = ob.isHappy(n);
        System.out.println(result);
    }
}
