/*
벽을 n개의 구역으로 분할
m미터 롤러는 한 번에 m개 구역을 칠함

123456789
12  5   9
1234 5678

가장 작은 번호의 구역부터 칠함
칠해진 부분 제외 작은 번호의 구역부터 칠함
*/
public class PaintWall {
    public static void main(String[] args) {
        int n = 8;
        int m = 4;
        int[] section = {2, 3, 6};

        int answer = 1;

        int[] wall = new int[n];
        for (int i = 0; i < n; i++) {
            wall[i] = i + 1;
        }

        for (int j = 0; j <= section.length - 1; j++) {
            for (int k = j + 1; k < section.length; k++) {
                if (section[k] > section[j] + m - 1) {
                    answer++;
                    j=k;
                }
            }
        }

        System.out.println(answer);
    }
}
