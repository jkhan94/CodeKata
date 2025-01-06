/*class Solution {
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
*/
class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        for(int i=0; i<babbling.length; i++){
            // (?!aya): Negative Lookahead 특정 패턴이 뒤따르지 않음
            // 문제에서 각 옹알이에는 단어가 하나씩만 포함된다고 함
            // 그래서 ayaaya는 배제시킴
            // 옹알이2인가 ayaaya도 되려면 ^(aya|ye|woo|ma)+$ 사용.
            // 그런데 한 번씩만 등장한다는 게 문제 조건이지, 같은 단어 두 번 반복 시 발음 불가하단 건 아님
            // 그래서 ayaaya 버전처럼 정규식을 써도 동작은 함.
            // if(babbling[i].matches("^(aya(?!aya) | ye(?!ye) | woo(?!woo) | ma(?!ma)) + $")){
            //     answer++;
            // }
            if(babbling[i].matches("^(aya|ye|woo|ma)+$")){
                answer++;
            }
        }
        return answer;
    }
}
