package August_2025;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ThreeDivisor_18 {
    public boolean factors(int n){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 1; i * i <= n ; i++){
            if(n % i == 0){
                list.add(i);

            if(i != n/i){
                list.add(n/i);
            }
            }
        }

        return list.size() == 3;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ThreeDivisor_18 number = new ThreeDivisor_18();
        System.out.println(number.factors(n));
    }
}
