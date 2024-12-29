class Solution {
    static final int price = 5500; // 커피값
        
    public int[] solution(int money) {
        int[] answer = new int [2];
        
        answer[0] = money / price;
        answer[1] = money % price;
        
        return answer;        
        // return new int[] { money / 5500, money % 5500 };
    }
}