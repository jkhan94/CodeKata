/*
원소간의 차이가 동일하면 등차 / 원소간의 몫이 동일하면 등비

길이 2까지 포함하면
    등차수열 합(n항까지): n(1항 값 + n항 값)/2
    등비수열 합: 첫항(공비^n - 1) / (공비-1)
    그런데 길이가 2면 [1,2]는 등비인지 등차인지 모름.

테스트케이스 추가
[13, 15] 17
[2,4,6] 8
[-1, 2, -4] 8
[0,3,6] 9
[1,2,4] 8
*/

// 길이가 3이상이므로 단순하게 쓸 수 있음
class Solution {
    public int solution(int[] common) {
        int answer = 0;
        int diff1 = common[1]-common[0];
        int diff2 = common[2]-common[1];
        
        if(diff1 == diff2){ // 등차
            answer = common[common.length-1] + diff1;
        } else { // 등비
            answer = common[common.length-1] * (common[1]/common[0]);
        }
        
        return answer;
    }
}


/*
// 길이 2도 고려
// [1,2] 같은 경우 때문에 등차 등비 구분 위한 추가 조건이 주어져야 함.
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
*/