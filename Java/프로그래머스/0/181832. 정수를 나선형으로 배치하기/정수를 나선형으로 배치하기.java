/*
00 01 02 03
13 23 33
32 31 30
20 10
11 12
22 21

행=0 > 열=n-1 > 행=n-1 > 열=0 > 행=1 > 열=n-2 > 행=n-2 > 열=1 > ...
행은 0부터 1씩 더하고, 열은 n-1부터 1씩 빼고.
좌우
상하
우좌
하상
*/
/*
class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        int rowStart = 0;
        int rowEnd = n-1;
        int colStart = 0;
        int colEnd = n-1;
        int val = 1;
        
        while(val<=n*n){            
            // 좌우
            for(int i=colStart; i<=colEnd; i++){
                answer[rowStart][i] = val++;
            }
            rowStart++; // 상하는 아래행부터 시작
                
            // 상하
            for(int i=rowStart; i<=rowEnd; i++){
                answer[i][colEnd] = val++;
            }
            colEnd--; // 우좌는 1칸 왼쪽부터 시작
            
            // 우좌
            for(int i=colEnd; i>=colStart; i--){
                answer[rowEnd][i] = val++;
            }
            rowEnd--; // 하상은 1칸 위부터 시작
            
            // 하상
            for(int i=rowEnd; i>=rowStart; i--){
                answer[i][colStart] = val++;
            }         
            colStart++; // 다은 좌우는 1칸 오른쪽부터 시작
        }
        
        return answer;
    }
}
*/
class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        int num = 1;
        int x = 0, y = 0;
        int dx[] = {1, 0, -1, 0}; // 우하좌상
        int dy[] = {0, 1, 0, -1};
        int direction = 0;

        while (num <= n * n) {
            answer[y][x] = num++;

            int nx = x + dx[direction]; 
            int ny = y + dy[direction];

            if (nx < 0 || nx >= n || ny < 0 || ny >= n || answer[ny][nx] != 0) {
                direction = (direction + 1) % 4; //범위 밖에 나갔을 때 방향전환
                nx = x + dx[direction];
                ny = y + dy[direction];
            }
            x = nx;
            y = ny;
        }

        return answer;
    }
}