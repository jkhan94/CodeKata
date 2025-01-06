class Solution {
    public int solution(String[] babbling) {
        String[] word = {"aya", "ye", "woo", "ma"};
        int answer = 0;
               
        for(String b : babbling){
            for(int i=0; i<word.length; i++){
                b = b.replaceAll(word[i]," "); // 공백으로 단어 구분
            }
            b = b.replaceAll(" ",""); // 공백 제거
            if(b.length() == 0){
                answer++;
            }
        }
        return answer;
    }
}