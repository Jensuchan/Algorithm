class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] tmp = s.split(" ");
        int first = Integer.parseInt(tmp[0]);
        for(int i=1; i<tmp.length; i++) {
        	if(tmp[i].equals("Z")) {
        		answer -= Integer.parseInt(tmp[i-1]);
        	}else {
        		answer += Integer.parseInt(tmp[i]);
        	}
        }
        return answer+first;
    }
}