class Solution {
    public int[] solution(int n, int k) {
        int[] answer = new int[n/k];

        // 개수 만큼 k의 배수를 저장한 배열 리턴
        for (int i = 1; i <= n/k; i++) {
            answer[i - 1] = k * i;
        }

        return answer;
    }
}
/*
class Solution {
    public int[] solution(int n, int k) {
        int[] answer = new int[n/k];
        
        for(int i=1; i<=n; i++){
            if(i%k == 0){
                answer[i/k-1] = i;
            }
        }
        
        return answer;
    }
}
*/