class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        int cnt = 0; //0의개수
        int count = 0; //반복횟수
        while(!s.equals("1")) {
        	int sl = s.length();
        	s = s.replaceAll("0", "");
        	count++;
        	int nsl = s.length(); //4
        	cnt += sl-nsl;
        	s = Integer.toBinaryString(nsl);
        }
        answer[0] = count;
        answer[1] = cnt;
        return answer;
    }
}