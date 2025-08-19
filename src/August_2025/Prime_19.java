package August_2025;

import java.util.Scanner;

public class Prime_19 {
    public static boolean isPrime(int n){
        if (n < 2) return false;
        if(n == 2 ) return true;
        if(n % 2 == 0) return false;

        for(int i = 3 ; i * i <= n ; i++){
            if(n % i == 0) return false;
        }

        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("enter the elements");
        for(int k = 0 ; k < n ; k++){
            arr[k] = sc.nextInt();
        }


        boolean[] visited = new boolean[n];

        for(int i = 0 ; i < n ; i++){
            if(visited[i]) {
                continue;
            }

                int count = 1;
                for(int j = i+1 ; j < n ; j++){
                    if(arr[i] == arr[j]){
                        count ++;
                        visited[j] = true;
                    }
            }
                if(isPrime(count)){
                    System.out.println(arr[i]);
                }
        }
    }
}
