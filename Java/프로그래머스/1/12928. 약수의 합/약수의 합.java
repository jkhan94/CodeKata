class Solution {
    public int solution(int n) {
        int answer = 0;
        if(0<=n && n<=3000){
            if(n==0){
                answer = 0;
            } else{
                for(int i=1; i<=n; i++){
                    if(n%i == 0){
                        answer +=i;
                    }
                }
            }            
        }
        
        return answer;
    }
}