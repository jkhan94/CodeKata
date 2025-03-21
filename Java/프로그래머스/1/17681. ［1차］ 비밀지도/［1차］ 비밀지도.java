import java.lang.*;
class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        StringBuffer sb = new StringBuffer();
        sb.append("%").append(n).append("s");
        String format = sb.toString();
        
        
        
        for(int i=0; i<n; i++){
            answer[i] = String.format(format,Integer.toBinaryString(arr1[i] | arr2[i]));
            answer[i] = answer[i].replaceAll("1","#");
            answer[i] = answer[i].replaceAll("0"," ");
        }
                

        
        return answer;
    }
}