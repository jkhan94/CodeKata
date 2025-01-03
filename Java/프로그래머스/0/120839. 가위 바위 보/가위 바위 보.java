/*
가위 2    0
바위 0    5
보   5    2
*/
class Solution {
    private static final String scissor = "2";
    private static final String rock = "0";
    private static final String paper = "5";
    
    public String solution(String rsp) {
        String answer = "";
        //  char[] cRsp = rsp.toCharArray();
        String[] rspArray = rsp.split("");
        
        for(String r : rspArray){
            // if-else문도 됨
            switch(r){
                case scissor:
                    answer+=rock;
                    break;
                case rock:
                    answer+=paper;
                    break;
                case paper:
                    answer+=scissor;
                    break;
            }
        }
        
        return answer;
    }
}