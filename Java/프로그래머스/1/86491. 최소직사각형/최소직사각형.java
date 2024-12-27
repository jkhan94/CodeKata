/*
[[60, 50], [30, 70], [60, 30], [80, 40]] 80*50	4000
60 50 / 70 30 / 60 30 / 80, 40

[[10, 7], [12, 3], [8, 15], [14, 7], [5, 15]] 15*8	120
10 7 / 12 3 / 15 8 / 14 7 / 15 5

[[14, 4], [19, 6], [6, 16], [18, 7], [7, 11]] 19*7	133
14 4 / 19 6 / 16 6 / 18 7 /11 7

큰 값 앞에, 작은 값 뒤에 넣고 각각 최대값 구하기
*/
class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int temp = 0;
        int max = 0, max2 = 0;

        for (int i = 0; i < sizes.length; i++) {
            for (int j = 0; j < sizes[i].length - 1; j++) {
                if (sizes[i][j] < sizes[i][j + 1]) {
                    temp = sizes[i][j];
                    sizes[i][j] = sizes[i][j + 1];
                    sizes[i][j + 1] = temp;
                }
            }
        }

        max = sizes[0][0];
        for (int i = 0; i < sizes.length; i++) {
            if (max < sizes[i][0]) {
                max = sizes[i][0];
            }
        }

        max2 = sizes[0][1];
        for (int i = 0; i < sizes.length; i++) {
            if (max2 < sizes[i][1]) {
                max2 = sizes[i][1];
            }
        }
        answer = max*max2;
        return answer;
    }
}
/*
// 가로, 세로 중 큰 값은 지갑의 가로 길이로, 작은 값은 지갑의 높이로 사용.
// 굳이 정렬하지 않고 이렇게 풀었어도 될 듯.
class Solution {
    public int solution(int[][] sizes) {
        int length = 0, height = 0;
        for (int[] card : sizes) {
            length = Math.max(length, Math.max(card[0], card[1]));
            height = Math.max(height, Math.min(card[0], card[1]));
        }
        int answer = length * height;
        return answer;
    }
}
*/
/*
import java.util.*;

class Solution {
    public int solution(int[][] sizes) {
        // 큰 값 중에 최대, 작은 값 중에 최대 구해서 곱한 값 출력
        return Arrays.stream(sizes)
            .reduce( (a, b) -> new int[] {                                                                    Math.max( Math.max(a[0], a[1]), Math.max(b[0], b[1])),                                Math.max(Math.min(a[0], a[1]), Math.min(b[0], b[1])) 
            }
         ).map(it -> it[0] * it[1]).get();
    }
}
*/