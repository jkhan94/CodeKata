class Solution {
    public String solution(int q, int r, String code) {
        StringBuffer answer = new StringBuffer();        
        String[] c = code.split("");
        
        for(int i=0; i<c.length; i++){
            if(i%q == r){
                answer.append(c[i]);
            }
        }
        
        return answer.toString();
    }
}