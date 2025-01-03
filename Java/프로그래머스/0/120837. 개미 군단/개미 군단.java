class Solution {
    private static final int GENERAL = 5; // 장군개미
    private static final int SOLDIER = 3;// 병정개미
    private static final int WORKER = 1;// 일개미
    
    public int solution(int hp) {
        int answer=0;
        
        answer += hp/GENERAL;
        hp%=GENERAL;
        answer+= hp/SOLDIER;
        hp%=SOLDIER;
        answer+=hp/WORKER;
        
        return answer;
    }
}