import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 가로
        int m = sc.nextInt(); // 세로
        
        for(int j=1;j<=m;j++){
            for(int i=1; i<=n;i++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
/*
import java.util.Scanner;
import java.util.stream.IntStream;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        StringBuilder sb = new StringBuilder();

        IntStream.range(0, a).forEach(s -> sb.append("*"));
        IntStream.range(0, b).forEach(s -> System.out.println(sb.toString()));
    }
}
*/