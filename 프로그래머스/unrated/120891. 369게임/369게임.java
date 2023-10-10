class Solution {
    public int solution(int order) {
    	String tmp1 = Integer.toString(order);
        int answer = 0;
        int remain = 0;
        for(int i=0; i<tmp1.length(); i++){
        	remain = order % 10;
            if(remain == 3 || remain == 6 || remain == 9){
                answer++;
            }
            order = order / 10;
            remain=0;
        }
        return answer;
    }
}