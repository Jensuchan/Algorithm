import java.util.*;

class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        //emergency 배열복사
        int[] tmp = new int[emergency.length];
        System.arraycopy(emergency, 0, tmp, 0, emergency.length);
        /* 오름차순 정렬
         * [30 10 23 6 100] emergency
         * [6 10 23 30 100] tmp
         * [2  4  3  5  1 ] answer
         */
        Arrays.sort(tmp);
        for(int i=0; i<emergency.length; i++) {
        	for(int j=0; j<tmp.length; j++) {
        		if(emergency[i] == tmp[j]) {
        			answer[i] = tmp.length-j;
        		}
        	}
        }
        return answer;
    }
}