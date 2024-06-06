import java.util.Arrays;

public class SumTwoNumbers {
    public static void main(String[] args) {
        int[] numbers = {2, 1, 3, 4, 1};
        int[] temp = new int[numbers.length*(numbers.length - 1)/2];
        int idx=0;

        for (int i = 0; i < numbers.length; i++) {
            for(int j=i+1; j<numbers.length; j++){
                temp[idx] = numbers[i] + numbers[j];
                idx++;
            }
        }

        int[] answer = Arrays.stream(temp).distinct().toArray();
        Arrays.sort(answer);

        for(int num : answer){
            System.out.print(num+" ");
        }

    }

}
