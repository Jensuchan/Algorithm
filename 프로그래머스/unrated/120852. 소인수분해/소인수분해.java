import java.util.*;

class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int count = 0;
        for(int i=1; i<=n; i++) {
        	if(n%i ==0) {
        		for(int j=1; j<=i; j++) {
        			if(i%j == 0) {
        				count++;
        			}
        		}
        		if(count == 2) {
        			list.add(i);
        		}
        		count =0;
        	}
        	}
        int[] answer = new int[list.size()];
        for(int i=0; i<list.size(); i++) {
        	answer[i] = list.get(i);
        }
        return answer;
    }
}