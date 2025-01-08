/*
class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] c = s.split(" ");
        
        for(int i=0; i<c.length; i++){
            System.out.println(i);
            if(i+1 < c.length && c[i+1].equals("Z")){
                i++;
                continue;
            }
            answer+=Integer.parseInt(c[i]);                                  
        }
        
        return answer;
    }
}
*/
import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();

        // 전부 스택에 넣지만 이어진 문자가 Z면 이전 문자 꺼냄
        for (String w : s.split(" ")) {
            if (w.equals("Z")) {
                stack.pop();
            } else {
                stack.push(Integer.parseInt(w));
            }
        }
        for (int i : stack) {
            answer += i;
        }
        return answer;
    }
}