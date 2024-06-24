package programmers;

public class ThreeToTen {
    public static void main(String[] args) {
        int n = 45;
        int answer = 0;
        int[] temp = new int[n];
        int count = 0;
        while (n > 0) {
            temp[count] = n % 3;
            n /= 3;
            count++;
        }
        count--;
        for (int i = 0; i <= count; i++) {
            answer += temp[i] * Math.pow(3, count - i);
        }
        System.out.println(answer);
    }

}
