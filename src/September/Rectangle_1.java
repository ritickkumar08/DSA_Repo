package September;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Rectangle_1 {
    private ArrayList<Integer> factor(int area){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 1 ; i*i <= area ; i++){
            if(area % i == 0){
                list.add(i);
            if(i != area/i){
                list.add(area/i);
              }
            }
        }
//        System.out.println(list);
        return list;
    }
    private int[] createRectangle(int area){
        ArrayList<Integer> factors = factor(area);
        int l = area;
        int b = 1;
        int minDiff = Integer.MAX_VALUE;


        for(int f1 : factors){
            int f2 = area / f1;
            if(f1 * f2 == area){
                int diff = Math.abs(f1 - f2);
                if(diff < minDiff){
                    minDiff = diff;
                    l = Math.max(f1, f2);
                    b = Math.min(f1, f2);
                }
            }
        }
        return new int[]{l,b};

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int area = sc.nextInt();

        Rectangle_1 ob = new Rectangle_1();
        ArrayList<Integer> factors = ob.factor(area);
        System.out.println(factors);

        int[] lengthbredth = ob.createRectangle(area);

        System.out.println(Arrays.toString(lengthbredth));
    }
}
