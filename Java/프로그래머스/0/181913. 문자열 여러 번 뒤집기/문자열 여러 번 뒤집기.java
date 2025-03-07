class Solution {
    public String solution(String my_string, int[][] queries) {
        String[] answer = my_string.split("");
        int s=0, e=0;
        
        for(int i=0; i<queries.length; i++){
            s=queries[i][0];
            e=queries[i][1];
            for(int j=s, k=e; j<=e; j++){
                answer[j] = my_string.charAt(k--)+"";
            }            
            my_string=String.join("",answer);
        }
        
        return String.join("",answer);
    }
}