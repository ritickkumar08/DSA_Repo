package August_2025;

import java.util.Scanner;

public class Pattern9_16 {
    public void printPattern(int n){
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j <= i ; j++){
                if((i+j) % 2 == 0 ){
                    System.out.print(1);
                }
                else{
                    System.out.print(0);
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Pattern9_16 pattern = new Pattern9_16();
        pattern.printPattern(n);
    }
}
