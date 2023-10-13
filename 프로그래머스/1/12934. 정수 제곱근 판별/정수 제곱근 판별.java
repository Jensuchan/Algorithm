class Solution {
    public long solution(long n) {
        long answer = 0;
        int a = (int)Math.sqrt(n);
        if((long)a*a==n) {
        	return (long)(a+1)*(a+1);
        }
        return -1;
    }
}