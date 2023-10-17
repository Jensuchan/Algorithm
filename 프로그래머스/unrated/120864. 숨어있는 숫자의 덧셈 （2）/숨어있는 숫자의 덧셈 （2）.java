class Solution {
    public static int solution(String my_string) {
        int answer = 0;
        String tmp[] = my_string.split("[a-zA-Z]");
        int index = 0;
        for(int i=0; i<tmp.length; i++) {
        	if(!tmp[i].equals("")) {
        		answer += Integer.parseInt(tmp[i]);
        	}
        }
        return answer;
    }
}