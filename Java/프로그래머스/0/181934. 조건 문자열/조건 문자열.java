class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        int answer = 0;
        String cond = ineq+eq;
        
        switch(cond){
            case ">=":
                if(n >= m){
                    answer = 1;
                }
                break;
            case "<=":
                if(n <= m){
                    answer = 1;
                }
                break;
            case ">!":
                if(n > m){
                    answer = 1;
                }
                break;
            case "<!":
                if(n < m){
                    answer = 1;
                }
                break;                
        }
        
        return answer;
    }
}
/*
class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        int answer = 0;
        
        if(ineq.equals(">")){
            if(eq.equals("=")){
                if(n >= m){
                    answer = 1;
                }
            } else {
                if(n > m){
                    answer = 1;
                }
            }
        } else {
            if(eq.equals("=")){
                if(m >= n){
                    answer = 1;
                }
            } else {
                if(m > n){
                    answer = 1;
                }
            }
        }
        
        return answer;
    }
}
*/