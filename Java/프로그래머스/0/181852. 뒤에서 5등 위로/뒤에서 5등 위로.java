import java.util.*;
/*
class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length-5];
        
        Arrays.sort(num_list); // ASC
        
        for(int i=0; i<answer.length; i++){
            answer[i] = num_list[i+5];
        }        
        return answer;
        
        return Arrays.copyOfRange(num_list,5,num_list.length);
        // return Arrays.stream(numList).sorted().skip(5).toArray();
    }
}
*/
class Solution {
    public int[] solution(int[] num_list) {        
        Arrays.sort(num_list); // ASC
        
        return Arrays.copyOfRange(num_list,5,num_list.length);
    }
}
/*
class Solution {
    public int[] solution(int[] num_list) {
        return Arrays.stream(num_list).sorted().skip(5).toArray();
    }
}
*/