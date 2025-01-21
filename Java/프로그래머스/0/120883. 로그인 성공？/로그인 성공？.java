class Solution {
    public String solution(String[] id_pw, String[][] db) {
        String answer = "fail";
        
        for(int i=0; i<db.length; i++){
            if(db[i][0].equals(id_pw[0])){ // ID 일치
                if(db[i][1].equals(id_pw[1])){ // PW 일치
                    answer = "login";
                } else {
                    answer = "wrong pw";
                }
            }                 
        }       
        
        return answer;
    }
}