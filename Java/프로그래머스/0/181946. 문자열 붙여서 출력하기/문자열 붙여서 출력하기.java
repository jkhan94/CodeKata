/*
String 불변객체. 값 변경 시 새 객체 추가
StringBuilder 문자열 변경 시 기존 객체 변경. 싱글스레드에서 유리.
StringBuffer 문자열 변경 시 기존 객체 변경. 멀티스레드에서 유리.
*/
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        
        StringBuffer sb = new StringBuffer();
        
        System.out.println(sb.append(a).append(b));
    }
}