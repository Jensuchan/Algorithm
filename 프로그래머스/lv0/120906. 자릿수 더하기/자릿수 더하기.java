class Solution {
    public int solution(int n) {
        int answer = 0;
        while (true) {
        	answer += n % 10; //4 3 2
        	n /= 10; // 123 12 1
        	if(n/10 == 0) {
        		answer += n;
        		break;
        	}
        }
        return answer;
    }
}