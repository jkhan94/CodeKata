class Solution {
    public String solution(String my_string, int[] index_list) {
        StringBuffer answer = new StringBuffer();
        
        for(int i : index_list){
            answer.append(my_string.charAt(i));
        }
        
        return answer.toString();
    }
}