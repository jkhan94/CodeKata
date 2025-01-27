/*
import java.util.*;
class Solution {
    public String[] solution(String[] strArr) {
        int cnt = 0;
        for(int i=0; i<strArr.length; i++){
            if(!strArr[i].contains("ad")){
                cnt++;
            }
        }
        
        String[] answer = new String[cnt];
        cnt = 0;
        
        for(int i=0; i<strArr.length; i++){
            if(!strArr[i].contains("ad")){
                answer[cnt] = strArr[i];
                cnt++;
            }
        }
        
        return answer;
    }
}
*/
import java.util.*;
class Solution {
    public String[] solution(String[] strArr) {
        ArrayList<String> answer = new ArrayList<>();
        int cnt = 0;
        
        for(int i=0; i<strArr.length; i++){
            if(!strArr[i].contains("ad")){
                answer.add(strArr[i]);
                cnt++;
            }
        }
        
        // return answer.toArray(new String[cnt]);
        return answer.toArray(String[]::new);
    }
}