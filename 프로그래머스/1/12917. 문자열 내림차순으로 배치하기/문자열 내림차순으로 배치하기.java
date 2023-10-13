import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] tmp = s.split("");
        Arrays.sort(tmp);
        for(int i=0; i<tmp.length; i++) {
        	answer += tmp[tmp.length-1-i];
        }
        return answer;
    }
}