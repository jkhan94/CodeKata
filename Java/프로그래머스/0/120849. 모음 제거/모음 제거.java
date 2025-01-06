class Solution {
    public String solution(String my_string) {
        String answer = "";
        String[] my = my_string.split("");
        for(int i=0; i<my.length; i++){
            if(my[i].equals("a") || my[i].equals("e") || my[i].equals("i") ||
              my[i].equals("o") || my[i].equals("u")){
                continue;
            }
            answer += my[i];
        }
        return answer;
        
         // return my_string.replaceAll("[aeiou]", "");

    }
}