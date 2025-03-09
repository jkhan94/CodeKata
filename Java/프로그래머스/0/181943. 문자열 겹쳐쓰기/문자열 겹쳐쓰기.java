class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String bef = my_string.substring(0,s);
        String aft = my_string.substring(s+overwrite_string.length(), my_string.length());
        
        return bef + overwrite_string + aft;
    }
}
/*
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
*/