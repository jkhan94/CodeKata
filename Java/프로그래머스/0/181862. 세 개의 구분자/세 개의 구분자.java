import java.util.*;
import java.util.stream.*;
class Solution {
    public String[] solution(String myStr) {
        List<String> answer = Arrays.stream(myStr.split("a|b|c"))
                                    .filter(s -> !s.isEmpty()) // 빈 문자열 제거
                                    .collect(Collectors.toList());
        
        if(answer.isEmpty()){
            answer.add("EMPTY");
        }

        return answer.stream().toArray(String[]::new);
    }
}