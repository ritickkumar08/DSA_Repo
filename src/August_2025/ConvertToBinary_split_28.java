package August_2025;

import java.util.Scanner;

public class ConvertToBinary_split_28 {

    private String convert(String date){
        StringBuilder sb = new StringBuilder();
        String[] parts = date.split("-");

        for(int i = 0 ; i < parts.length ; i++){
            int number = Integer.parseInt(parts[i]);
            sb.append(Integer.toBinaryString(number));
            if(i < parts.length - 1) sb.append("-");

        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a date to get its binary conversion" + " ");
        String s = sc.next();

        ConvertToBinary_split_28 ob = new ConvertToBinary_split_28();
        String result = ob.convert(s);
        System.out.println(result);
    }
}
