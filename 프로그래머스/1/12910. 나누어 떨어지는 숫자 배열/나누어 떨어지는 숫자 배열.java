import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
    	ArrayList<Integer> list = new ArrayList<Integer>();
    	for(int i=0; i<arr.length; i++) {
    		if(arr[i]%divisor==0) {
    			list.add(arr[i]);
    		}
    	}
    	if(list.isEmpty()) {
    		int[] answer = new int[] {-1};
    		return answer;
    	}
    	
    	int[] tmp = new int[list.size()];
    	for(int i=0; i<list.size(); i++) {
    		tmp[i] = list.get(i);
    	}
    	Arrays.sort(tmp);
        return tmp;
    }
}