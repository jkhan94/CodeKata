/*
1. 스테이지에 도달한 플레이어 수 
    지나간 사람도 포함되므로 따로 계산해야 함.
2. 스테이지에 도달했으나 아직 클리어하지 못한 플레이어의 수
    stages에 저장된 값
3. N+1 다 끝낸 사람
4. 실패율 DESC, 스테이지 번호 ASC
    도달한 플레이어 없으면 실패율=0
    
테스트케이스 추가
4 [1,1,1,1,1,1] [1,2,3,4]
*/
// 메소드 오버라이딩을 통한 comparable 방식
import java.util.*;
class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        int[] uncleared = new int[N+2];
        int[] reached = new int[N+2];
        double failRatio = 0.0;
        List<Stage> failList = new ArrayList<>();
        
        for(int s : stages){           
            uncleared[s]++;            
        }
        reached[N+1] = uncleared[N+1]; // 올클
        for(int i=N; i>=1; i--){
            reached[i] = uncleared[i] + reached[i+1]; // 해당 스테이지 미클 + 클리어한 유저
        }
        
        for(int i=1; i<=N; i++){
            failRatio = reached[i]==0? 0.0 : (double)uncleared[i]/reached[i];
            failList.add(new Stage(i, failRatio));
        }
        
        // 클래스에서 Comparable 방식
        Collections.sort(failList);
        
        for (int i=0; i<N; i++) {
            answer[i] = failList.get(i).stageNumber;
        }       
                
        return answer;
    }
    
    static class Stage implements Comparable<Stage> {
        int stageNumber;
        double failRatio;
        
        Stage(int stageNumber, double failRatio) {
            this.stageNumber = stageNumber;
            this.failRatio = failRatio;
        }     
        
        @Override
        public int compareTo(Stage other) {
            // this(현 객체) 전달 후 other(인수) 전달
            // (a.b) = (this,other)
            if (Double.compare(other.failRatio, this.failRatio) == 0) {
                return Integer.compare(this.stageNumber, other.stageNumber);
            }
            return Double.compare(other.failRatio, this.failRatio);
        }
    }
}

/*
// 람다식을 활용한 Comparator 방식
import java.util.*;
class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        int[] uncleared = new int[N+2];
        int[] reached = new int[N+2];
        double failRatio = 0.0;
        List<Stage> failList = new ArrayList<>();
        
        for(int s : stages){           
            uncleared[s]++;            
        }
        reached[N+1] = uncleared[N+1]; // 올클
        for(int i=N; i>=1; i--){
            reached[i] = uncleared[i] + reached[i+1]; // 해당 스테이지 미클 + 클리어한 유저
        }
        
        for(int i=1; i<=N; i++){
            failRatio = reached[i]==0? 0.0 : (double)uncleared[i]/reached[i];
            failList.add(new Stage(i, failRatio));
        }
        // for(int i=0; i<failList.size(); i++){
        //     System.out.println(failList.get(i).stageNumber+" "+failList.get(i).failRatio);
        // }
        
        // a,b 순서로 비교 대상이 주어짐
        // 연산값이 양수면 a, b의 위치 바꿈
        Collections.sort(failList, (a, b) -> {
            // 뒤값이 크므로 앞으로 이동
            if (Double.compare(b.failRatio, a.failRatio) == 0) {
                // 앞이 크므로 뒤로 이동
                return Integer.compare(a.stageNumber, b.stageNumber);
            }
            return Double.compare(b.failRatio, a.failRatio);
        });
        
        
        for (int i=0; i<N; i++) {
            answer[i] = failList.get(i).stageNumber;
        }       
                
        return answer;
    }
    
    static class Stage {
        int stageNumber;
        double failRatio;
        
        Stage(int stageNumber, double failRatio) {
            this.stageNumber = stageNumber;
            this.failRatio = failRatio;
        }        
    }
}
*/

/*
import java.util.*;
class Solution {
    public int[] solution(int N, int[] stages) {
        int idx = 0;
        int[] answer = new int[N];
        double[] uncleared = new double[N+2];
        double[] reached = new double[N+2];
        double[] failRatio = new double[N+1];
        double[] sortedFailRatio = new double[N];
        
        for(int i=0; i<stages.length; i++){
            for(int j=1; j<=stages[i]; j++){
                reached[j]++;                
            }            
            uncleared[stages[i]]++;            
        }
        
        for(int i=1; i<=N; i++){
            failRatio[i] = uncleared[i]/reached[i];
            if(Double.isNaN(failRatio[i])){
                failRatio[i]=0.0;
            }
            sortedFailRatio[i-1] = failRatio[i];
            // System.out.println(uncleared[i]+" "+reached[i]+" "+sortedFailRatio[i-1]);
        }
        
        Arrays.sort(sortedFailRatio); // ASC
        
        // for(int i=1; i<=N; i++){
        //     System.out.println(sortedFailRatio[i-1]);
        // }
        
        for(int i=N-1; i>=0; i--){
            for(int j=1; j<=N; j++){
                if(sortedFailRatio[i] == failRatio[j]){
                    answer[idx++] = j;
                    failRatio[j] = -1.0;
                    break;
               }
            }            
        }        
                
        return answer;
    }
}
*/