/*class Solution {
    public int solution(int n) {
        int answer = 0;
        
        if(n==1 || n== 2 || n==3){
            answer = 0;
        } else { // 4 이상부터는 나뉘면 바로 카운트후 다음 수로 이동
            for(int i=4; i<=n; i++){
                for(int j=2; j<i; j++){
                    if(i%j == 0){
                        answer++;
                        break;
                    }
                    
                }            
            }
        }
        
        return answer;
    }
}
*/
class Solution {
    public int solution(int n) {
        int answer = 0;

        for (int i = 1; i <= n; i++) {
            int cnt = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) cnt++; // 약수 개수 셈
            }
            if (cnt >= 3) answer++;
        }

        return answer;
    }
}