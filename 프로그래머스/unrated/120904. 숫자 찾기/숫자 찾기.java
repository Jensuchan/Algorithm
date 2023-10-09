class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        String tmp1 = Integer.toString(num);
        String[] tmp = tmp1.split("");
        String tmp2 = Integer.toString(k);
        for(int i=0; i<tmp.length; i++) {
        	if(tmp[i].equals(tmp2)) {
        		answer = i+1;
        		break;
        	}
        }
        if(answer == 0) {
        	answer = -1;
        }
        return answer;
    }
}