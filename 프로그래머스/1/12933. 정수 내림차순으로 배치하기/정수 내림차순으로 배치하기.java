import java.util.*;

class Solution {
    public long solution(long n) {
    	String answer = "";
    	String num = Long.toString(n);
    	String[] tmp = num.split("");
    	Arrays.sort(tmp);
    	for(int i=0; i<tmp.length; i++) {
    		answer += tmp[tmp.length-1-i];
    	}
    	long a = Long.parseLong(answer);
        
        return a;
    }
}