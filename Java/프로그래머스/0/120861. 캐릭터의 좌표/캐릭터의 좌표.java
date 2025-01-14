/*
테스트케이스 추가
 ["right", "right", "right", "right", "right", "left"], [9, 5] [3,0]
*/
class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = {0,0}; // x y
        int[] dx = {0,-1,0,1}; // left right
        int[] dy = {1,0,-1,0}; // up down
        int width = (board[0]-1)/2;
        int length = (board[1]-1)/2;
        
        for(int i=0; i<keyinput.length; i++){
            switch(keyinput[i]){
                case "up":
                    answer[0] += dx[0];
                    answer[1] += dy[0];
                    break;
                case "down":
                    answer[0] += dx[2];
                    answer[1] += dy[2];
                    break;
                case "left":
                    answer[0] += dx[1];
                    answer[1] += dy[1];
                    break;
                case "right":
                    answer[0] += dx[3];
                    answer[1] += dy[3];
                    break;
            }
            
            if(answer[0] > width) {
                answer[0] = width;
            } else if(answer[0] < width*-1){
                answer[0] = width*-1;
            }

            if(answer[1] > length) {
                answer[1] = length;
            } else if(answer[1] < length*-1){
                answer[1] = length*-1;
            }
        }        
        
        return answer;
    }
}