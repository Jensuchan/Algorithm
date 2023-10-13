class Solution {
    boolean solution(String s) {
        boolean answer = false;
        int cntP = 0;
        int cntY = 0;
        String[] tmp = s.split("");
        for(int i=0; i<tmp.length; i++) {
        	if(tmp[i].equals("p") || tmp[i].equals("P")) {
        		cntP++;
        	}else if(tmp[i].equals("y") || tmp[i].equals("Y")) {
        		cntY++;
        	}
        }
        if(cntP == cntY) {
        	return true;
        }
        return answer;
    }
}