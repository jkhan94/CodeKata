/*
배수 개수 세고, 숫자 따로 저장하는 게 속도가 더 빠름.
*/
class Solution {
    public int[] solution(int n, int[] numlist) {
        int count = 0;
        for(int i : numlist){
            if(i%n==0){
                count++;
            }
        }

        int[] answer = new int[count];
        int idx = 0;
        for(int i : numlist){
            if(i%n==0){
                answer[idx]=i;
                idx++;
            }
        }


        return answer;
    }
}
/*
import java.util.*;
class Solution {
    public int[] solution(int n, int[] numlist) {
        List<Integer> list = new ArrayList<>();
        
        for(int i=0; i<numlist.length; i++){
            if(numlist[i]%n == 0){
                list.add(numlist[i]);
            }
        }
        
        return list.stream().mapToInt(Integer::intValue).toArray();               
    }
}
*/
/*
import java.util.*;
class Solution {
    public int[] solution(int n, int[] numList) {
        return Arrays.stream(numList).filter(value -> value % n == 0).toArray();
    }
}
*/