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
        
        return answer.toArray(new String[cnt]);
    }
}