import java.util.*;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        int sum = 0;
        Arrays.sort(d);
//        for(int i=0; i<d.length; i++) {
//        	if(sum>budget) {
//        		continue;
//        	}
//        	sum += d[i];
//        	answer++;
//        	if()
//        }
        
        for(int a : d) {
        	if(sum<=budget) {
        		sum += a;        		
        	}
        	answer++;
        	if(sum>budget) {
        		return answer-1;
        	}
        }
        return answer;
    }
}