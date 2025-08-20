package August_2025;

import java.util.Scanner;

public class Romantointeger_20 {
    private int valueOf(char ch){
        if(ch == 'I') return 1;
        if(ch == 'V') return 5;
        if(ch == 'X') return 10;
        if(ch == 'L') return 50;
        if(ch == 'C') return 100;
        if(ch == 'D') return 500;
        if(ch == 'M') return 1000;

        return 0;
    }
    private int integer(String s){
        int n = s.length();
        int result = 0;

        for(int i = 0 ; i < n ; i++){
            int value = valueOf(s.charAt(i));

            if(i+1 < n && value < valueOf(s.charAt(i+1))){
                result -= value;
            }
            else{
                result += value;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String roman = sc.next();

        Romantointeger_20 number = new Romantointeger_20();
        int equivalentNumber = number.integer(roman);
        System.out.print(equivalentNumber);

    }
}
