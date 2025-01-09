/*
테스트 케이스 추가
369 3
0 0
30 1

컬렉션.stream()...
Stream.of(임의 객체)...

*/
import java.util.stream.Stream;

class Solution {
    public int solution(int order) {
        int answer = 0;
        int[] o = Stream.of(String.valueOf(order).split(""))
            .mapToInt(Integer::parseInt)
            .toArray();
        
        for(int i=0; i<o.length; i++){
            if(o[i] != 0){
                if(o[i]%3 == 0 || o[i]%6 == 0 || o[i]%9 == 0){
                    answer++;
                }
            }
        }

        return answer;
    }
}