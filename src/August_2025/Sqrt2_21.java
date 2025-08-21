package August_2025;

import java.util.Scanner;

public class Sqrt2_21 {
    public int find(int n){
        if(n == 0 || n == 1) return n;
        int start = 1;
        int end = n;
        int ans = 0;

        while(start <= end){
            int mid = (start + end)/2;
            if(mid * mid == n) return mid;
            if(mid * mid < n){
                start = mid + 1;
                ans = mid;
            }
            else {
                end = mid -1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Sqrt2_21 ob = new Sqrt2_21();
        int result = ob.find(n);
        System.out.println(result);
    }
}
