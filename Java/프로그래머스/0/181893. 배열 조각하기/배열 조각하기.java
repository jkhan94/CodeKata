/*
순간적으로 query[i]가 짝수면 뒤를 자르고, 홀수면 앞을 자르라는 건 줄 알았음.
그래서 리스트로 풀었는데 query 인덱스 기준이면 int 두 개로 해결 가능.

테스트케이스 추가
[0, 1, 2, 3, 4, 5] [4, 0, 2] [0, 1, 2]
*/
import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[] query) {
        int start = 0;
        int end = arr.length-1;
        
        for(int i=0; i<query.length; i++){           
            if(i%2 == 0){ // even
                end = start + query[i];
            } else { // odd
                start += query[i];
            }
        }
        
        return Arrays.copyOfRange(arr, start, end+1);
    }
}

/*
import java.util.*;
import java.util.stream.Collectors;
class Solution {
    public int[] solution(int[] arr, int[] query) {
        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
        
        for(int i=0; i<query.length; i++){           
            if(i%2 == 0){ // even
                list = list.subList(0, query[i]+1);
            } else { // odd
                list = list.subList(query[i], list.size());
            }
        }
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
*/