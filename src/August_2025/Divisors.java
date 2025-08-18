package August_2025;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Divisors {
    public ArrayList<Integer> factors(int n){
        ArrayList<Integer> list = new ArrayList<>();
         for(int i = 1; i * i <= n ; i++){
            if(n % i == 0){
                list.add(i);

            if(i != n/i){
                list.add(n/i);
            }
            }
        }
         Collections.sort(list);
         return list;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Divisors number = new Divisors();
        System.out.println(number.factors(n));
    }
}
