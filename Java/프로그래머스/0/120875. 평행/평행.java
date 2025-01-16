/*
평행하다 = 기울기가 같다 = y차/x차 가 같은 경우가 있다
점이 0,1,2,3번이라고 하면 01 23 / 02 31 / 03 12 총 3개

정수/정수일 경우 소수점은 계산되지 않음 -> 더블로 캐스팅 필요

테스트케이스 추가
[[10, 1], [9, 3], [2, 2], [4, 4]] 0
*/
class Solution {
    private static final int xPos = 0;
    private static final int yPos = 1;
    
    public int solution(int[][] dots) {
        double[] x = new double[dots.length];
        double[] y = new double[dots.length];
        double slope1 = 0.0;
        double slope2 = 0.0;
        
        for(int i=0; i<dots.length; i++){
            x[i] = (double)dots[i][xPos];
            y[i] = (double)dots[i][yPos];
        }
        
        // 01 23 
        slope1 = (y[0]-y[1]) / (x[0]-x[1]);
        slope2 = (y[3]-y[2]) / (x[3]-x[2]);
        if(slope1 == slope2){
            return 1;
        }
        
        // 02 31 
        slope1 = (y[0]-y[2]) / (x[0]-x[2]);
        slope2 = (y[3]-y[1]) / (x[3]-x[1]);
        if(slope1 == slope2){
            return 1;
        }
        
        // 03 12
        slope1 = (y[0]-y[3]) / (x[0]-x[3]);
        slope2 = (y[2]-y[1]) / (x[2]-x[1]);
        if(slope1 == slope2){
            return 1;
        }
        
        return 0;
    }
}