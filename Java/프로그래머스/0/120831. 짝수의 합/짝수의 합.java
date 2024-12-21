// for(int i=2; i<=n; i+=2){ answer+=i;   }
// 값 체크를 해도 if문이 하나 빠지니까 실행 시간이 줄어들 것 같다.

class Solution {
    public int solution(int n) {
        int answer = 0;
        if(0<n && n<=1000){
            for(int i=0; i<=n; i++){
              if(i%2==0){
                 answer += i;
              }   
            }            
        }
        return answer;
    }
}