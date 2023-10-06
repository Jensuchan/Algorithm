class Solution {
    public String solution(String rsp) {
        String answer = "";
        String[] tmp = rsp.split("");
        for(int i=0; i<tmp.length; i++) {
        	if(tmp[i].equals("0")) {
        		answer+="5";
        	}else {
        		answer += (tmp[i].equals("2")?"0":"2");
        		
        	}
        }
        return answer;
    }
}