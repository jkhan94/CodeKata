/*
1. for문으로 1~n까지 나머지 0인 걸 찾음
2. 제곱근 활용
    1 2 루트8 = 2.82 4 8
    1 3(루트9) 9
    1 2 루트10=3.16 5 10
    
테스트케이스 추가
9 
[1,3,9]
*/
import java.util.*;
class Solution {
    public int[] solution(int n) {
        Set<Integer> answer = new HashSet<>();
        
        for(int i=1; i<=Math.sqrt(n); i++){
            if(n%i == 0){
                answer.add(i);
                answer.add(n/i);
            }
        }        
              
        return answer.stream().mapToInt(Integer::intValue).sorted().toArray();
    }
}
/*
import java.util.*;
class Solution {
    public int[] solution(int n) {
        List<Integer> answer = new ArrayList<>();
        
        for(int i=1; i<=Math.sqrt(n); i++){
            if(n%i == 0){
                answer.add(i);
                if(!answer.contains(n/i)){
                    answer.add(n/i);
                }
            }
        }        
        
        answer.sort(Comparator.naturalOrder());
        
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}
*/
/*
import java.util.stream.IntStream;
import java.util.Arrays;

class Solution {
    public int[] solution(int n) {
        return IntStream.rangeClosed(1, n).filter(i -> n % i == 0).toArray();
    }
}
*/