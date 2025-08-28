package August_2025;

import java.util.Scanner;

public class ConvertDateToBinary_28 {

    private String convert(String date){
        StringBuilder sb = new StringBuilder();
        int number = 0;

        for(int i = 0 ; i <= date.length(); i++){
            if(i == date.length() || date.charAt(i) == '-'){
                if(number == 0){
                    sb.append('0');
                }
                else{
                    StringBuilder binary = new StringBuilder();
                    while(number > 0){
                        binary.append(number % 2);
                        number /= 2;
                    }
                    sb.append(binary.reverse());
                }
                if( i != date.length()) sb.append('-');
                number = 0;
            }
            else{
                int digit = date.charAt(i) - '0';
                number = number*10 + digit;
            }
        }
        return sb.toString();

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a date to convert it to binary" + " ");
        String s = sc.next();

        ConvertDateToBinary_28 ob = new ConvertDateToBinary_28();
        String result = ob.convert(s);
        System.out.println(result);
    }
}
