class Solution {
    public int solution(String[] strArr) {
        int answer=0;
        int[] len = new int[strArr.length];
        
        for(int i=0; i<strArr.length; i++){
            len[strArr[i].length()]++;
        }
        
        answer = len[0];
        for(int i=1; i<len.length; i++){
            if(len[i] > answer){
                answer = len[i];
            }
        }
        
        return answer;
    }
}