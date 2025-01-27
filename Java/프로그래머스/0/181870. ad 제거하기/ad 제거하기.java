/*
list.toArray(new String[크기])
    실제 크기 < 지정된 값보다 작다면 남는 부분은 null
    실제 크기 > 지정된 값보다 크다면 값을 무시하고 생성
    보통 0으로 설정하는 것이 관례.

list.toArray(String[]::new) (Java 11 이상)
    크기를 자동으로 계산해서 생성
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
        
        // return answer.toArray(new String[0]);
        return answer.toArray(String[]::new);
    }
}
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