public class FoodFighter {
    // 1  2 3   0
    // 1 22 333 0 333 22 1
    public static void main(String[] args) {
        int[] food = {1, 7, 1, 2};
        String answer = "";

        for(int i = 1; i < food.length; i++) {
            for(int j=0; j<food[i]/2;j++){
                answer += Integer.toString(i);
            }
        }
        StringBuffer sb = new StringBuffer(answer);
        String reverse = sb.reverse().toString();
        answer+="0";
        answer+=reverse;

        System.out.println(answer);
    }
}
