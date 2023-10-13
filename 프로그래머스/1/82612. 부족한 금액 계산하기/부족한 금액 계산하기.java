class Solution {
    public static long solution(int price, int money, int count) {
        long answer = 0;
        long money1 = (long)money;
        for(int i=1; i<=count; i++) {
        	money1 -= ((long)price*i);
        }
        
        if(money1>0) {
        	return 0;
        }else {
        	answer = -money1;
        }

        return answer;
    }
}