import java.util.*;
class Solution {
    public int solution(int[][] dots) {
        ArrayList<Integer> width = new ArrayList<>();
        ArrayList<Integer> height = new ArrayList<>();
        
        for(int i=0; i<dots.length; i++){
            width.add(dots[i][0]);
            height.add(dots[i][1]);
        }
            
        Collections.sort(width);
        Collections.sort(height);
        
        return (width.get(width.size()-1) - width.get(0)) * (height.get(height.size()-1) - height.get(0));
    }
}