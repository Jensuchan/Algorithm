import java.util.Arrays;

class Solution {
    public int solution(String before, String after) {
        String[] tmp1 = before.split("");
        String[] tmp2 = after.split("");
        Arrays.sort(tmp1);
        Arrays.sort(tmp2);
        int count = 0;
        for(int i=0; i<tmp1.length; i++) {
        	if(tmp1[i].equals(tmp2[i])) {
        		count++;
        	}
        }
        if(count == tmp1.length) {
        	return 1;
        }
        return 0;
    }
}