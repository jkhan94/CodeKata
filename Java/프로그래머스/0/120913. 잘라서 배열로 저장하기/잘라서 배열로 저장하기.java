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