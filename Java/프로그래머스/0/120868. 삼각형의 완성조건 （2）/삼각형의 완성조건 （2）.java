/*
sides = {a,b}  (a < b)
1. b가 가장 긴 변
    a+c>b => b-a < c <= b => a개
2. a+b보다 작은 긴 변
    a+b > c > b => a-1개
*/
class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int a = Math.min(sides[0], sides[1]);
        int b = Math.max(sides[0], sides[1]);      
        
        // 1. b가 가장 긴 변
        answer += a;
        
        // 2. a+b보다 작은 긴 변
        answer += a-1;
        
        
        return answer;
    }
}