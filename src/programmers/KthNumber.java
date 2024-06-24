package programmers;

import java.util.Arrays;

public class KthNumber {
    public static void main(String[] args) {
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};

        int[] answer = new int[commands.length];
        int index=0;

        // commands[i][0] ~ commands[i][1] 중 commands[i][2] 번째
        for (int i = 0; i < commands.length; i++) {
            int[] temp = new int[commands[i][1]-commands[i][0]+1];
            for (int j = commands[i][0]; j <= commands[i][1]; j++) {
                temp[index]=array[j-1];
                index++;
            }

            Arrays.sort(temp);

            answer[i]=temp[commands[i][2]-1];
            index=0;
        }

        for(int num : answer){
            System.out.print(num+" ");
        }

    }
}
