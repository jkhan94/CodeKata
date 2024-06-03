public class MinNameCard {
    public static void main(String[] args) {
        int[][] sizes = {{14, 4}, {19, 6}, {6, 16}, {18, 7}, {7, 11}};
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

        System.out.println(max);
        System.out.println(max2);
    }
}
