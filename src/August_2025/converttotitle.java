package August_2025;

import java.util.Scanner;

public class converttotitle {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        int columnNumber = sc.nextInt();

        while(columnNumber > 0){
            columnNumber--;
            int remainder = columnNumber % 26;
            sb.append((char)(remainder + 'A'));
            columnNumber /= 26;
        }
        System.out.println(sb.reverse());
    }
}
