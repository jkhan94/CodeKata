/*
테스트케이스 추가
"1 + 2 + 3" "6"
"10x + 11" "10x + 11"
"x" "x"
*/
class Solution {
    public String solution(String polynomial) {
        String answer = "";
        int x = 0;
        int c = 0;
        String[] p = polynomial.split(" ");       
        
        for(String a : p){
            if(a.contains("x")){
                if(a.equals("x")){
                    x+=1;
                } else {
                    x += Integer.parseInt(a.substring(0,a.length()-1));
                }                
            } else if(a.matches("^[0-9]*$")) {
                // + : 1자 이상, * : 0자 이상
                c += Integer.parseInt(a);
            }
        }             

        if(x==0){
            answer = c+"";
        } else if(x==1){
            if(c==0){
                answer = "x";
            } else {
                answer = "x + "+c;
            }            
        } else {
            if(c==0){
                answer = x+"x";
            } else {
                answer = x+"x + "+c;
            }            
        }       
                
        return answer;
    }
}