class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        String strK = Integer.toString(k);
        for(int a=i; a<=j; a++) {
        	String tmp = Integer.toString(a);
        	String[] tmpArr = tmp.split("");
        	for(int b=0; b<tmpArr.length; b++) {
        		if(tmpArr[b].equals(strK)) {
        			answer++;
        		}
        	}
        }
        return answer;
    }
}