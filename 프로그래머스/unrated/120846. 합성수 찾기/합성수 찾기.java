class Solution {
    public int solution(int n) {
        int answer = 1;
        int count = 0;
        for(int i=1; i<=n; i++) {
        	for(int j=1; j<=i; j++) {
        		if(i%j==0) {
        			count++;
        		}
        	}//j for문 종료
        	if(count==2) {
        		answer++;
        	}
        	count=0;
        } //i for문 종료

        return n-answer;
    }
}