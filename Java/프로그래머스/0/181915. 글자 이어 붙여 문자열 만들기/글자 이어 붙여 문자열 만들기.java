class Solution {
    public String solution(String my_string, int[] index_list) {
        StringBuffer answer = new StringBuffer();
        
        for(int i=0; i<index_list.length; i++){
            answer.append(my_string.charAt(index_list[i]));
        }
        
        return answer.toString();
    }
}