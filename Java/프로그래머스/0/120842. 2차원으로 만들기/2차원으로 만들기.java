class Solution {
    public int[][] solution(int[] num_list, int n) {
        int row = num_list.length/n;
        int col = n;
        int idx=0;
        int[][] answer = new int[row][col];
        
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                answer[i][j] = num_list[idx++];
            }
        }
                          
        return answer;
    }
}
/*
class Solution {
    public int[][] solution(int[] num_list, int n) {
        int[][] answer = {};
        int length = num_list.length;
        answer = new int[length/n][n];

        // n으로 나눴을 때 몫=행, 나머지=열
        for(int i=0; i<length; i++){
            answer[i/n][i%n]=num_list[i];
        }

        return answer;
    }
}
*/