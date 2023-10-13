class Solution {
    public String solution(String[] seoul) {
        String answer = "";
        int index = 0;
        for(int i=0; i<seoul.length; i++) {
        	if(seoul[i].equals("Kim")) {
        		index = i;
        		break;
        	}
        }
        String tmp = String.valueOf(index).concat("에 있다");
        answer += "김서방은 ".concat(tmp);
        return answer;
    }
}