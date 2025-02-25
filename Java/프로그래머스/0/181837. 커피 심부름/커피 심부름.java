/*
ice, hot은 무관.
americano, cafelatte, anything만 고려하면 됨.
*/
class Solution {
    private static final int AMERICANO = 4500;
    private static final int CAFELATTE = 5000;
    
    public int solution(String[] order) {      
        int answer = 0;
        
        for(String o : order){
            if(o.contains("cafelatte")){
                answer += CAFELATTE;
            } else {
                answer += AMERICANO;
            }
        }

        return answer;
    }
}
/*
class Solution {
    private static final int AMERICANO = 4500;
    private static final int CAFELATTE = 5000;
    
    public int solution(String[] order) {
        int black=0, latte=0;
        
        for(String o : order){
            if(o.contains("americano") || o.contains("anything")){
                black++;
            } else if(o.contains("cafelatte")){
                latte++;
            }
        }

        return AMERICANO*black + CAFELATTE*latte;
    }
}
*/