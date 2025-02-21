import java.util.Arrays;
class Solution {
    public String[] solution(String myStr) {
        String[] arr = Arrays.stream(myStr.split("[abc]+"))
                                .filter(str -> !str.isEmpty())
                                .toArray(String[]::new);
        
        return arr.length == 0 ? new String[] { "EMPTY" } : arr;
    }
}

/*
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
*/