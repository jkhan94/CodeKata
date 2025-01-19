/*
원소간의 차이가 동일하면 등차 / 원소간의 몫이 동일하면 등비
등차수열 합(n항까지): n(1항 값 + n항 값)/2
등비수열 합: 첫항(공비^n - 1) / (공비-1)

테스트케이스 추가
[2,4,6] 8
[-1, 2, -4] 8
[0,3,6] 9
[1,2,4] 8

*/
class Solution {
    public int solution(int[] common) {
        int answer = 0;
        int sum = 0;
        int arithSum = common.length*(common[0] + common[common.length-1]);
        
        // common의 합
        for(int c : common){
            sum+=c;
        }
        
        if(arithSum%2 == 0 && sum == arithSum/2){ // 등차수열
            answer = common[common.length-1] + (common[1]-common[0]);            
        } else { // 등비수열
            answer = common[common.length-1] * (common[1]/common[0]);
        }
        
        return answer;
    }
}