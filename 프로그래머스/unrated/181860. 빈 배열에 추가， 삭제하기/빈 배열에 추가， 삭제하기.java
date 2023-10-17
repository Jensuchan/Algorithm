import java.util.*;

class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int index = 0;
        for(int i=0; i<arr.length; i++) {
        	int tmp = arr[i];
        	if(flag[i] == true) {
        		for(int a=0; a<(tmp*2); a++) {
        			list.add(tmp);
        			index++;
        		}
        	}else {
        		for(int b=0; b<tmp; b++) {
        			list.remove(index-1);
        			index--;
        		}
        		
        	}
        }
        int[] answer = new int[list.size()];
        for(int i=0; i<list.size(); i++) {
        	answer[i] = list.get(i);
        }
        return answer;
    }
}