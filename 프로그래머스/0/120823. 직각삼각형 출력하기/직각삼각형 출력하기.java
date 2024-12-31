/*
밑변, 높이 * n개
*/
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int repeat = 1;
        
        while(repeat<=n){
            for(int i=0; i<repeat; i++){
                System.out.print("*");
            }
            System.out.println();
            repeat++;
        }  
        
        //  for(int i=0; i<n; i++){
        //     for(int j=0; j<=i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        
        // for(int i=1; i<=n; i++){
        //     System.out.println("*".repeat(i));
        // }
        
    }
}