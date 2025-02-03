class Solution {
    public String solution(int[] numLog) {
        StringBuffer answer = new StringBuffer();
        int diff = 0;
        
        for(int i=0; i<numLog.length-1; i++){
            diff = numLog[i+1] - numLog[i];
            switch(diff){
                case 1:
                    answer.append("w");
                    break;
                case -1: 
                    answer.append("s");
                    break;
                case 10:
                    answer.append("d");
                    break;
                case -10:
                    answer.append("a");
                    break;
            }
        }
        
        return answer.toString();
    }
}