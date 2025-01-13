/*
substring(int idx)              idx부터 끝까지 자름
substring(int start, int end)   start 부터 end-1까지 리턴
05 0
611 1
1215 2

02 0
35 1
68 2
*/
/*
class Solution {
    public String[] solution(String my_str, int n) {
        int length = my_str.length()%n == 0? my_str.length()/n : my_str.length()/n+1;
        String[] answer = new String[length];
        int start = 0, end = n;
        
        for(int i=0; i<length; i++){            
            answer[i] = my_str.substring(start, end);
            start += n;            
            end +=n;
            if(end>my_str.length()){
                end = my_str.length();
            }
        }
        
        System.out.println(length);
        
        return answer;
    }
}
*/
class Solution {
    public String[] solution(String my_str, int n) {
        // 나머지 최대값인 n-1을 더해서 나머지가 있을 경우 올림
        // 나누어 떨어지면 0 + n-1 이므로 몫은 변화 없음
        // 나머지가 있으면 r + n-1이므로 1 + (r-1)/n. 즉 몫+1.
        int length = (my_str.length() + n-1) / n;
        String[] answer = new String[length];

        for (int i = 0; i < length; i++) {
            int start = n * i;
            int end = start + n >= my_str.length()? my_str.length(): start + n;
            answer[i] = my_str.substring(start, end);
        }

        return answer;
    }
}