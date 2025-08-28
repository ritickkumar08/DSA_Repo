package August_2025;

import java.util.Scanner;

public class Nim_Game_24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n % 4 == 0){
            System.out.println("false you can't win the game");
        }
        else{
            System.out.println("yayy! you can win");
        }
    }
}
