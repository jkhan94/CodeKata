import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        StringBuffer answer= new StringBuffer();
        char temp = 'a';
        
        for(int i=0; i<a.length(); i++){
            temp = a.charAt(i);
            if(Character.isUpperCase(temp)){
                answer.append(Character.toLowerCase(temp));
            } else if(Character.isLowerCase(temp)){
                answer.append(Character.toUpperCase(temp));
            }       
       }
        
        System.out.println(answer);
        
    }
}