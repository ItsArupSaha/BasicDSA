package Sieve;

import java.util.Arrays;

public class GeneratePrime {
    public static void main(String[] args) {
        boolean[] ans = sieve(10);
        for(int i=0; i<ans.length; i++){
            if(ans[i]){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }

    static boolean[] sieve(int n){
        boolean[] ans = new boolean[n+1];
        Arrays.fill(ans, true);
        ans[0] = false;
        ans[1] = false;

        for(int i=2; i*i<=n; i++){
            for(int j=2*i; j<=n; j += i){
                ans[j] = false;
            }
        }

        return ans;
    }
}
