import java.util.*;
import java.util.stream.Collectors;
class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        int p=0, q=0, r=0;
        int[] cnt = new int[7]; // 인덱스=숫자 개수        
        cnt[a]++;
        cnt[b]++;
        cnt[c]++;
        cnt[d]++;
        
        List<Integer> cntList = Arrays.stream(cnt).boxed().collect(Collectors.toList());  
        
        if(cntList.contains(4)){
            answer = cntList.indexOf(4)*1111;
                
        } else if(cntList.contains(3)){
            answer = (int)Math.pow(10*cntList.indexOf(3) + cntList.indexOf(1),2);
            
        } else if(cntList.contains(2) && !cntList.contains(1)){
            p = cntList.indexOf(2);
            q = cntList.lastIndexOf(2);
            answer = (p+q) * (Math.abs(p-q));
            
        } else if(cntList.contains(2) && cntList.contains(1)){
            q = cntList.indexOf(1);
            r = cntList.lastIndexOf(1);            
            answer = q*r;
            
        } else {
            answer = cntList.indexOf(1);
        }
        
        return answer;
    }
}