import java.util.*;
class Solution {
    public int[] solution(String my_string) {
        String myNum = my_string.replaceAll("[^0-9]",""); // 숫자만 남김
        String[] my = myNum.split("");
        int[] answer = new int[my.length];
        
        for(int i=0; i<my.length; i++){
            answer[i]=Integer.parseInt(my[i]);
            //  answer[i] = my_string.charAt(i) - '0'; // 문자0을 빼서 정수화
        }        
        Arrays.sort(answer);                
        
        return answer;
        
        //  return Arrays.stream(myString.replaceAll("[A-Z|a-z]", "").split("")).sorted().mapToInt(Integer::parseInt).toArray();
    }    
}