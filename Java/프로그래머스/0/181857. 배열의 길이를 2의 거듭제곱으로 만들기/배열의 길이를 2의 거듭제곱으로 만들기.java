class Solution {
    public int[] solution(int[] arr) {
        int len = (int)Math.pow(2, Math.ceil(Math.log(arr.length) / Math.log(2)));
        int[] answer = new int[len];
        
        for(int i=0; i<arr.length; i++){
            answer[i] = arr[i];
        }
        return answer;
    }
}