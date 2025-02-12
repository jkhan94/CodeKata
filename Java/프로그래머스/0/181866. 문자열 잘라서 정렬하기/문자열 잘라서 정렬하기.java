/*
테스트케이스 추가
"bbxba" ["ba", "bb"]
"axbxxc" ["a", "b", "c"]
*/
import java.util.*;
class Solution {
    public String[] solution(String myString) {
        ArrayList<String> answer = new ArrayList<>();
        
        for(String my : myString.split("x")){
            if(my.isEmpty()){
                continue;
            }
            answer.add(my);
        }
        Collections.sort(answer);
        
        return answer.toArray(String[]::new);
    }
}
/*
import java.util.*;
class Solution {
    public String[] solution(String myString) {
        return Arrays.stream(myString.split("x")) // "x" 기준으로 분리
                     .filter(s -> !s.isEmpty())   // 빈 문자열 제거
                     .sorted()                    // 오름차순 정렬
                     .toArray(String[]::new);     // 배열로 변환
    }
}
*/