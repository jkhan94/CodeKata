/*
테스트케이스 추가
"seventwo" 72
*/
class Solution {
    public long solution(String numbers) {
        String[] num = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        
        for(int i=0; i<num.length; i++){   
            numbers = numbers.replace(num[i],i+"");          
        }        
        
        return Long.valueOf(numbers);
    }
}