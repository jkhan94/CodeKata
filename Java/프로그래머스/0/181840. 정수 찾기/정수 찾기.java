/*
테스트케이스 추가
[1, 30, 40], 3 , 0
contains는 부분 문자열을 찾음. 30에 3이 있어서 1 리턴.
문자열 대신 리스트의 contains를 쓰면 정확하게 3일 때만 1 리턴.
*/
import java.util.*;
class Solution {
    public int solution(int[] num_list, int n) {
        ArrayList<String> ans = new ArrayList<>();
        
        for(int num : num_list){
            ans.add(String.valueOf(num));
        }
        
        return ans.contains(String.valueOf(n))? 1:0;
    }
}
/*
class Solution {
    public int solution(int[] num_list, int n) {
        for(int num : num_list){
            if(num == n){
                return 1;
            }
        }        
        return 0;
    }
}
*/