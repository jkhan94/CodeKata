class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        
        for(int num : num_list){
            while(num>1){
                // 정수형은 홀수든 짝수든 나누면 몫이 같음
                num/=2;
                answer++;
            }
        }
        
        return answer;
    }
}