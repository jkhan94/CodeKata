class Solution {
    public int solution(int[] num_list) {
        StringBuffer odd = new StringBuffer();
        StringBuffer even = new StringBuffer();
        
        for(int num : num_list){
            if(num%2==0){
                even.append(Integer.toString(num));
            } else {
                odd.append(Integer.toString(num));
            }
        }

        return Integer.parseInt(even.toString()) + Integer.parseInt(odd.toString());
    }
}