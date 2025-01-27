/*
class Solution {
    public int[] solution(int[] arr, int n) {
        if(arr.length%2 == 0){ // even
            for(int i=1; i<arr.length; i+=2){
                arr[i]+=n;
            }
        } else { // odd
            for(int i=0; i<arr.length; i+=2){
                arr[i]+=n;
            }
        }
        return arr;
    }
}
*/
class Solution {
    public int[] solution(int[] arr, int n) {
        for(int idx=arr.length%2*-1 + 1; idx<arr.length; idx+=2) {
            arr[idx]+=n;
        }

        return arr;
    }
}