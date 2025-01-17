/*
테스트케이스 추가
[[0, 0, 0, 0, 0], [0, 0, 0, 0, 0], [0, 0, 0, 0, 0], [0, 0, 0, 0, 0], [0, 0, 0, 0, 0]] 25
*/
class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        // 상 좌 우 하 좌상 우상 좌하 우하
        int[] dx = {-1,0,1,0,-1,-1,1,1}; 
        int[] dy = {0,-1,0,1,-1,1,-1,1}; 
        
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[0].length; j++){
                if(board[i][j] == 1){
                    for(int k=0; k<dx.length; k++){
                        int x = i+dy[k];
                        int y = j+dx[k];
                        if(x<0){
                            x=0;
                        } else if(x>=board.length){
                            x=i;
                        }
                        if(y<0){
                            y=0;
                        } else if(y>=board[0].length){
                            y=j;
                        }
                        
                        if(board[x][y] != 1){
                            board[x][y]--;
                        }
                        
                    }
                }
            }
        }
        
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[0].length; j++){
                // System.out.print(board[i][j]+" ");
                if(board[i][j] == 0){
                    answer++;
                }
            }
            // System.out.println();
        }

        return answer;
    }
}