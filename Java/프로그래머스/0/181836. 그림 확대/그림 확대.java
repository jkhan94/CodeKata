/*
원소 개수 k배, 길이도 k배
*/
class Solution {
    public String[] solution(String[] picture, int k) {
        String[] answer = new String[picture.length*k];
        StringBuffer temp = new StringBuffer();
        int idx=0;
        
        for(String p : picture){
            for(int i=0; i<p.length(); i++){
                for(int j=0; j<k; j++){
                    temp.append(p.charAt(i));
                }
            }
            for(int j=0; j<k; j++){
                answer[idx++] = temp.toString();
            }
            temp.delete(0,temp.length());
        }
        
        return answer;
    }
}