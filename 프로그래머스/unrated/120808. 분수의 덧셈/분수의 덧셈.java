class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        //numer : 분자 // denom : 분모    
        int top = 0; // 분자
        int bottom = 0; // 분모
        int gcd = 0;
        top = (numer1*denom2) + (numer2*denom1); // 통분 후 분자 4
        bottom = denom1*denom2; // 통분 후 분모 10
        int min = Math.min(top, bottom); //4
        int max = Math.max(top, bottom); //10
        for(int i=1; i<= min; i++) {
        	if(min%i==0 && max%i==0) {
        		gcd = i;
        	}
        }
        top /= gcd;
        bottom /= gcd;
        answer[0] = top;
        answer[1] = bottom;
        return answer;
    }
}