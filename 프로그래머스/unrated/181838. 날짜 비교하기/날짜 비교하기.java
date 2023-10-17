import java.util.*;


class Solution {
    public int solution(int[] date1, int[] date2) {
//    	int answer = 0;
//        Calendar c1 = Calendar.getInstance();
//        Calendar c2 = Calendar.getInstance();
//        c1.set(date1[0], date1[1]-1, date1[2]);
//        c2.set(date2[0], date2[1]-1, date2[2]);
//        if(c1.equals(c2)) {
//        	return 0;
//        }
//        answer = (c1.before(c2))?1:0;
//        return answer;
    	if(date1[0] != date2[0]) {
    		return (date1[0] < date2[0])? 1: 0; 
    	}
    	if(date1[1] != date2[1]) {
    		return (date1[1] < date2[1])? 1: 0; 
    	}
    	if(date1[2] != date2[2]) {
    		return (date1[2] < date2[2])? 1: 0; 
    	}
    	return 0;
    }
}