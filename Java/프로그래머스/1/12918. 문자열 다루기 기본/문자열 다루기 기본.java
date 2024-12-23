class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        if((s.length()==4 || s.length()==6) && s.matches("^[0-9]*$")) {
            return answer;
        }
        return answer=false;
    }
}
/*
class Solution {
  public boolean solution(String s) {
      if(s.length() == 4 || s.length() == 6){
          try{
              int x = Integer.parseInt(s);
              return true;
          } catch(NumberFormatException e){
              return false;
          }
      }
      else return false;
  }
}
*/