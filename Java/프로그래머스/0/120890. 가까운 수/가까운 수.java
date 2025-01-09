class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        int diff = Integer.MAX_VALUE;
        int temp = 0;
        
        for(int a : array){
            temp = Math.abs(n-a);
            if(diff > temp){
                diff = temp;
                answer = a;
            } else if(diff == temp){
                answer = Math.min(answer, a);
            }
        }
        
        return answer;
    }
}