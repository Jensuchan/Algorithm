class Solution {
    public static boolean solution(int x) {
        boolean answer = false;
        int y = x;
        int tmp = 0;
        
        while(x > 0) {
        	tmp += (x%10);
        	x /= 10;
        }
        if(y%tmp == 0) {
        	return true;
        }
        return answer;
    }
}