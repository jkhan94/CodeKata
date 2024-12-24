/*
// 행과 열 개수가 다르면 Jagged Array
// 각 row의 column 길이
for (int i = 0; i < arr.length; i++) {
    System.out.println((i+1) + "번째 행의 원소 수 : " + arr[i].length);
}
출처: https://hianna.tistory.com/517
*/
// arr.length: 행 개수
// arr[0].length : 열 개수
// n by n 행렬이라서 가능. 
class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = arr1;
        for(int i=0; i<arr2.length;i++){
            for(int j=0; j<arr2[0].length;j++){
                // answer[i][j] += arr2[i][j];
                answer[i][j]=answer[i][j]+arr2[i][j];
            }
        }
        return answer;
    }
}