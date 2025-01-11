/*
테스트케이스 추가
"3 + 3 - 3" 3

후순위 표기법으로 바꿔서 스택을 써도 되는데 오히려 더 복잡할 듯.
*/
class Solution {
    public int solution(String my_string) {        
        String[] my = my_string.split(" ");
        int answer = Integer.parseInt(my[0]);
        
        for(int i=0; i<my.length-1; i++){
            if(my[i].equals("+")){
                answer += Integer.parseInt(my[i+1]);
            } else if(my[i].equals("-")){
                answer -= Integer.parseInt(my[i+1]);
            }
        }
        
        return answer;
    }
}