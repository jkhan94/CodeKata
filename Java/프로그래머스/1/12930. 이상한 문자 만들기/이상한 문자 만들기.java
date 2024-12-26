class Solution {
    public String solution(String s) {
        String answer="";
        String[] word = s.split("");
        int idx=0;

        for(int i = 0; i < word.length; i++) {
            if(word[i].equals(" ")) {
                idx=0;
            } else if(idx%2==0){
                word[i]=word[i].toUpperCase();
                idx++;
            } else if(idx%2!=0){
                word[i]=word[i].toLowerCase();
                idx++;
            }
            answer+=word[i];
        }
        return answer;
    }
}
/*
// 문자가 공백이면 cnt=0 아니면 기존 값에 +1.
// 이러면 첫번째 문자의 인덱스 0이 아니라 1. 즉 짝수번째 소문자, 홀수번째 대문자.
// 그래서 cnt가 짝수면 소문자, 홀수면 대문자인 것.
class Solution {
  public String solution(String s) {
        String answer = "";
        int cnt = 0;
        String[] array = s.split("");

        for(String ss : array) {
            cnt = ss.contains(" ") ? 0 : cnt + 1;
            answer += cnt%2 == 0 ? ss.toLowerCase() : ss.toUpperCase(); 
        }
      return answer;
  }
}
*/