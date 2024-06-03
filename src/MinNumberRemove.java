public class MinNumberRemove {
    public static void main(String[] args) {
        int[] arr = {5,3,1,9};
//        if(arr.length <= 1){
//            int[] answer = {-1};
//            return answer;
//        }

        int[] answer = new int[arr.length-1];
        int min = arr[0];
        for(int i=1; i<arr.length; i++){
            min = Math.min(min, arr[i]);
        }
        int index=0;
        for(int i=0; i<arr.length; i++){
            if(min != arr[i]){
                answer[index] = arr[i];
                index++;
            }
        }

        System.out.println(answer);
    }
}
