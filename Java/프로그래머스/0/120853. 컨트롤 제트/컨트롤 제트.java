class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] c = s.split(" ");
        
        for(int i=0; i<c.length; i++){
            System.out.println(i);
            if(i+1 < c.length && c[i+1].equals("Z")){
                i++;
                continue;
            }
            answer+=Integer.parseInt(c[i]);                                  
        }
        
        return answer;
    }
}