class Solution {
    public int solution(int[] a, int[] b) {
        int answer = 0;
        
        for(int i=0; i<a.length; i++){
            answer += a[i]*b[i];
        }
        
        return answer;
    }
}
/*
// 범위를 설정하고 .연사내용을 정의하고. 다 더함.
// 스트림이 코드 간결화에 좋을 수 밖에 없을 듯.
// 옵셔널을 null을 원하는대로 처리할 수 있단 점에서 NPE에 대비할 수 있고.

import java.util.stream.IntStream;

class Solution {
    public int solution(int[] a, int[] b) {
        return IntStream.range(0, a.length).map(index -> a[index] * b[index]).sum();
    }
}
*/