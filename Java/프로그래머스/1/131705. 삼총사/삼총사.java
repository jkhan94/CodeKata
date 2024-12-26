/* 0 1 2 3 4 총 5명이면
0+1+2
0+1+3
0+1+4
0+2+3
0+2+4
0+3+4
1+2+3
1+2+4
1+3+4
2+3+4
이 중 숫자 합이 0인 것만 찾으면 됨.
*/
class Solution {
    public int solution(int[] number) {
        int answer = 0;
        
       for(int i=0;i<number.length-2;i++){
            for(int j=i+1;j<number.length-1;j++){
                for(int k=j+1; k<number.length;k++){                    
                    if(number[i]+number[j]+number[k]==0){
                        answer++;
                    }
                }
            }
        }
        
        return answer;
    }
}