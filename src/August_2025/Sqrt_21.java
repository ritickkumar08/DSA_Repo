package August_2025;

import java.util.Scanner;

public class Sqrt_21 {
    public double find(int n){
        double x = n;
        double root;
        while(true){
            root = 0.5 * (x + (n/x));
            if(Math.abs(root - x) < 0.0001){
                break;
            }
            x = root;
        }
        return root;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Sqrt_21 ob = new Sqrt_21();
        double result = ob.find(n);
        System.out.println(result);
    }
}
