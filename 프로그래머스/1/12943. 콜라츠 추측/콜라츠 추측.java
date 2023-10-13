class Solution {
    public static int solution(int num) {
        int cnt = 0;
        long tmp = (long)num;
        if(num==1) {
        	return 0;
        }
        while(tmp != 1) {
        	if(tmp%2==0) {
        		tmp /= 2;
        	}else {
        		tmp = (tmp*3) + 1;
        	}
        	cnt++;
        	if(cnt>500) {
        		return -1;
        	}
        }
        return cnt;
    }
}