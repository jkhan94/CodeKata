class Solution {
    public String solution(int q, int r, String code) {
        StringBuilder sb = new StringBuilder();

        // q로 나눈 나머지가 r일 때마다 = r부터 시작해서 q간격으로
        for (int i=r; i<code.length(); i+=q){
            sb.append(code.charAt(i));
        }

        return sb.toString();
    }
}
/*
class Solution {
    public String solution(int q, int r, String code) {
        StringBuffer answer = new StringBuffer();
        
        for(int i=0; i<code.length(); i++){
            if(i%q == r){
                answer.append(code.charAt(i));
            }
        }
        
        return answer.toString();
    }
}
*/
/*
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
*/