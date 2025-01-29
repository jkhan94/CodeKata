import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        StringBuffer answer= new StringBuffer();
        String[] str = a.split("");
        
        for(int i=0; i<str.length; i++){
            if(Character.isUpperCase(a.charAt(i))){
                answer.append(str[i].toLowerCase());
            } else if(Character.isLowerCase(a.charAt(i))){
                answer.append(str[i].toUpperCase());
            }       
       }
        
        System.out.println(answer);
        
    }
}