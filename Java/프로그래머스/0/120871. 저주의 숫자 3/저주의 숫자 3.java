/*
3배수 아니고 3도 없으면 인덱스
*/
/*
class Solution {
    public int solution(int n) {
        int answer = 0;
        int temp = 1;
        
        for(int i=0; i<n; i++){
            if(temp%3!=0 && !(temp+"").contains("3")){
                answer = temp;
            } else {
                i--;
            }
            temp++;                   
        }              
        
        return answer;
    }
}
*/
class Solution {
    public int solution(int n) {
        int answer = 0;

        for (int i = 1; i <= n; i++) {
            answer++;
            if (answer % 3 == 0 || String.valueOf(answer).contains("3")) {
                i--;
            }
        }

        return answer;
    }
}