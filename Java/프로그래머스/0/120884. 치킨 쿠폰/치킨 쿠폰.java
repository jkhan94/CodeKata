/*
최대 서비스 치킨 수는 몫의 합
서비스 치킨 수 : chicken/10
chicken/10 + chicken%10 <10일 때까지 반복
*/
/*
class Solution {
    public int solution(int chicken) {
        int answer = 0;
        
        while(true){            
            answer+=chicken/10;   
            chicken = chicken/10 + chicken%10;
            if(chicken < 10){
                break;
            }                      
        }
        
        return answer;
    }
}
*/
/*
첫 10마리 시키면 1마리 공짜 = 쿠폰 1장 있는 상태
이후부터는 9마리 시킬때마다 1마리 공짜

주어진 닰 수가 9로 나누어떨어지면 맨 처음은 10마리여야 하므로 1마리 빼야 함.
0마리 시켰을 경우도 chicken/9 = 0 > 0%9=0라서 -1 리턴됨. 따라서 1마리 이상 주문한 경우를 고려해서 -1 해야 함
*/
class Solution {
    public int solution(int chicken) {
        int answer = chicken/9;
        
        if(chicken>0 && chicken%9==0){
            answer--;
        }

        return answer;
    }
}