/*
답은 반드시 있음. 음수 포함. 반환값의 길이는 가변적.
1. n-1, n  n+1,... 
    중앙값을 찾으면 해결됨. 그런데 매번 num으로 나누어떨어지진 않음.
2. n, n+1, n+2..로 봐야 할 지.
   total - (1 ~ n-1까지의 합) / num의 나머지가 0이면 몫부터 num개.
   
테스트케이스 추가
1 13 [13]
2 13 [6,7]

*/
class Solution {
    public int[] solution(int num, int total) {      
        int[] answer = new int[num];
        
        for(int i=1; i<num; i++){
            total -= i;
        }
        
        if(total%num == 0){    
            int temp = total/num;
            for(int i=0; i<answer.length; i++){
                answer[i] = temp;
                temp++;
            }
        }
        
        return answer;
    }
}