class Solution {
    public int solution(String myString, String pat) {
    	String tmp = "";
    	String[] tmp1 = myString.split("");
    	for(int i=0; i<tmp1.length; i++) {
    		tmp += (tmp1[i].equals("A"))?"B":"A";
    	}
    	if(tmp.contains(pat)) {
    		return 1;
    	}

        int answer = 0;
        return answer;
    }
}