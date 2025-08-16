package August_2025;

import java.util.Scanner;

public class Pattern8_16 {
    public void printPattern(int n){
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j <= i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n-1-i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Pattern8_16 pattern = new Pattern8_16();
        pattern.printPattern(n);
    }
}
