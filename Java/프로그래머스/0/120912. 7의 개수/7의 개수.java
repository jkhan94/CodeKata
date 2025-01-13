class Solution {
    private static final int NUM = 7;
    
    public int solution(int[] array) {
        int answer = 0;
        
        for(int a : array){
            int temp = a;
            while(temp>0){
                if(temp%10 == NUM){
                    answer++;
                }
                temp/=10;
            }
        }
        
        return answer;
    }
}