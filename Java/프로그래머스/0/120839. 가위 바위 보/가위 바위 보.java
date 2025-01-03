/*
가위 2    0
바위 0    5
보   5    2
*/
class Solution {
    private static final String SCISSOR = "2";
    private static final String ROCK = "0";
    private static final String PAPER = "5";
    
    public String solution(String rsp) {
        String answer = "";
        //  char[] cRsp = rsp.toCharArray();
        String[] rspArray = rsp.split("");
        
        for(String r : rspArray){
            // if-else문도 됨
            switch(r){
                case SCISSOR:
                    answer+=ROCK;
                    break;
                case ROCK:
                    answer+=PAPER;
                    break;
                case PAPER:
                    answer+=SCISSOR;
                    break;
            }
        }
        
        return answer;
    }
}