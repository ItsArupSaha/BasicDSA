package Sieve;

import java.util.Scanner;

public class FindPrimeFactors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=2; i*i <= n; i++){
            while(n%i == 0){
                System.out.print(i+" ");
                n /= 2;
            }
        }

        if(n != 1) System.out.println(n);
    }
}
