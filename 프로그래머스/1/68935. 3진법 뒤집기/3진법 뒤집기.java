import java.util.*;

class Solution {
    public int solution(int n) {
    	int answer = 0;
    	ArrayList<Integer> list = new ArrayList<Integer>();
    	while(n>0) {
    		list.add(n%3);
    		n /= 3;
    	}
    	// 2 2 1 1 1
    	int a = list.size();
    	for(int tmp : list) {
    		answer += tmp*(int)(Math.pow(3, a-1));
    		a--;
    	}
    	
        return answer;
    }
}