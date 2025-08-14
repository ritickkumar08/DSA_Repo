package August_2025;

import java.util.Scanner;

public class Pattern7_14 {
    public void printPattern(int n){
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n-i-1 ; j++){
                System.out.print(" ");
            }
            for(int j = 0 ; j < 2*i+1 ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = 0 ; i < n-1; i++){
            for(int j = 0 ; j < 1+i ; j++){
                System.out.print(" ");
            }
            for(int j = 0 ; j < 2*(n-1) - (2*i+1); j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Pattern7_14 result = new Pattern7_14();
        result.printPattern(n);

        sc.close();
    }
}
