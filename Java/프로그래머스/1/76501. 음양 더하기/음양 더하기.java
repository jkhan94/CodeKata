/*
int answer = 0;
for (int i=0; i<signs.length; i++) {
    answer += absolutes[i] * (signs[i]? 1: -1);
}
return answer;
*/
class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 123456789;
        int sum=0;
        int minus=0;
        
        for(int i=0; i<signs.length;i++){
            if(signs[i]){
                sum+=absolutes[i];
            } else {
                minus+=absolutes[i];
            }
        }
        answer = sum - minus;
        return answer;
    }
}