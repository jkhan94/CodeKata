/*
올림	
    Math.ceil((double)n / x)
    (n+x-1)/x	    (n-1)/x +1
        n/x +1은 n이 x로 나누어떨어질 경우 1이 추가로 더해짐
버림	
    Math.floor((double)n / x)
    n/x
반올림
    Math.round((double)n / x)
    (n+ x/2 )/x      n/x + 0.5
        정수 나눗셈이라서 소수점 이하는 버려짐.
        즉, 0.5를 더해서 1이 넘어가면 정수부에 반영됨
*/
class Solution {
    public String[] solution(String[] names) {
        // int len = names.length%5==0? names.length/5 : names.length/5+1;
        // (int) Math.ceil(names.length / 5.0) // 실수 연산이라 비추
        String[] answer = new String[(names.length-1)/5 +1];
        
        for(int i=0; i<answer.length; i++){
            answer[i] = names[i*5];
        }
        
        return answer;
    }
}