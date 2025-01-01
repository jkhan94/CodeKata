class Solution {
    static final int PRICE = 5500; // 커피값
        
    public int[] solution(int money) {
        int[] answer = new int [2];
        
        answer[0] = money / PRICE;
        answer[1] = money % PRICE;
        
        return answer;        
        // return new int[] { money / 5500, money % 5500 };
    }
}