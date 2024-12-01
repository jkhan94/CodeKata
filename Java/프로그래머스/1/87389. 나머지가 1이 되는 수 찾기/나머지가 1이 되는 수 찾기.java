class Solution {
    public int solution(int n) {
        int answer = 0;        
        if(3<=n && n<=1000000){
            for(answer=1; answer<n; answer++){
                if(n%answer == 1){                   
                    break;
              }
            }            
        }
        
        return answer;
    }
}

/*
class Solution {
    public int solution(int n) {
        int answer = 1;
        while(true) {
            if (n%answer==1) break;
            answer++;
        }
        return answer;
    }
}
*/