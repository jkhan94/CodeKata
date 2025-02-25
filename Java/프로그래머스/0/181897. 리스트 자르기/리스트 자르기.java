class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        // 시작은 0 || a
        int start = n==1? 0 : slicer[0];
        
        // 끝은 b || 마지막 인덱스
        int end = n==2? num_list.length-1 : slicer[1];
        
        // 인덱스 간격은 c || 1
        int step = n==4? slicer[2] : 1;
        
        // 등차수열 항 개수 공식 : (마지막항 - 첫항) / 공차 +1
        // 인덱스가 start부터 end까지 step 간격으로 증가
        int[] answer = new int[(end - start + step) / step];
        
        for (int i=start, j=0; i<=end; i+=step) {
            answer[j++] = num_list[i];
        }
        
        return answer;
    }
}

/*
import java.util.*;
class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int[] answer = {};
        int a=slicer[0], b=slicer[1], c=slicer[2];
        
        switch(n){
            case 1:
                answer = Arrays.copyOfRange(num_list, 0, b+1);
                break;
            case 2:
                answer = Arrays.copyOfRange(num_list, a, num_list.length);
                break;
            case 3:
                answer = Arrays.copyOfRange(num_list, a, b+1);
                break;
            case 4:
                ArrayList<Integer> arr = new ArrayList<>();
                for(int i=a; i<=b; i+=c){
                    arr.add(num_list[i]);
                }
                answer = arr.stream().mapToInt(Integer::intValue).toArray();
                break;
        }
        
        return answer;
    }
}
*/