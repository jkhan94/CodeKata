/*
3배수 아니고 3도 없으면 인덱스
*/

class Solution {
    public int solution(int n) {
        int answer = 0;
        int temp = 1;
        
        for(int i=0; i<n; i++){
            // temp=""는 너무 느림. 메소드 쓰는 게 나음.
            // Integer.toString(int i) > NPE 발생
            // String.valueOf(Object o) > "null" 리턴
            if(temp%3!=0 && !String.valueOf(temp).contains("3")){
                answer = temp;
            } else {
                i--;
            }
            temp++;                   
        }              
        
        return answer;
    }
}

/*
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
*/