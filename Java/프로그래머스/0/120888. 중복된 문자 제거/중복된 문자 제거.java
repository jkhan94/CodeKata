/*
set을 쓰면 순서가 안 지켜지므로 "복된 문자 중 가장 앞에 있는 문자를 남김" 조건 위배.
LinkedHashSet은 중복 미허용 + 삽입 순서대로 저장
*/
/*
import java.util.*;
class Solution {
    public String solution(String my_string) {
        String answer = "";
        String[] my = my_string.split("");
        HashSet<String> mySet = new HashSet<>(); // 원소 저장용
        
        for(int i=0; i<my.length; i++){
            if(!mySet.contains(my[i])){
                answer += my[i];
                mySet.add(my[i]);
            }            
        }
        
        return answer;
    }
}
*/
import java.util.*;
class Solution {
    public String solution(String my_string) {
        String[] answer = my_string.split("");
        
        Set<String> set = new LinkedHashSet<String>(Arrays.asList(answer));
        
        return String.join("", set);
    }
}