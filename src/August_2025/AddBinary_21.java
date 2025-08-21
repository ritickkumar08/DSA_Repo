package August_2025;

import java.util.Scanner;

public class AddBinary_21 {

    public String add(String a,String b){
        StringBuilder result = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;

        while(i >= 0 || j >= 0 || carry > 0){
            int sum = carry;

            if(i >= 0) sum += a.charAt(i--) - '0';
            if(j >= 0) sum += b.charAt(j--) - '0';

            result.append(sum % 2);
            carry =sum / 2;
        }
        return result.reverse().toString();

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String binary1 = sc.next();
        String binary2 = sc.next();

        AddBinary_21 sum = new AddBinary_21();
        String result = sum.add(binary1 ,binary2);
        System.out.println(result);
    }
}
