class Solution {
    public String solution(String my_string, int[][] queries) {
        String[] answer = my_string.split("");
        int s=0, e=0;
        String temp = "";
        
        for(int i=0; i<queries.length; i++){
            s=queries[i][0];
            e=queries[i][1];
            for(int j=s, k=e; j<(s+e+1)/2; j++, k--){                
                temp = answer[j];
                answer[j] = answer[k];
                answer[k]=temp;
            }            
            // System.out.println(String.join("",answer));
        }
        
        return String.join("",answer);
    }
}