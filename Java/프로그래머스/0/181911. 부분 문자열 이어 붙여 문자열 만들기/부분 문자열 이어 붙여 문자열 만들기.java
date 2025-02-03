class Solution {
    public String solution(String[] my_strings, int[][] parts) {
        StringBuffer answer = new StringBuffer();
        
            for(int i=0; i<my_strings.length; i++){
                answer.append(my_strings[i].substring(parts[i][0], parts[i][1]+1));
            }
        
        return answer.toString();
    }
}