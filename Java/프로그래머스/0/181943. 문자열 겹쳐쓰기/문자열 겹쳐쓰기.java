class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String[] answer = my_string.split("");
        int idx =0;
        
        for(int i=s; i<s+overwrite_string.length(); i++){
            answer[i] = String.valueOf(overwrite_string.charAt(idx++));
        }
        
        return String.join("",answer);
    }
}