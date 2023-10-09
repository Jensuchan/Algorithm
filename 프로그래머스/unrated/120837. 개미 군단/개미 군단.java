class Solution {
    public int solution(int hp) {
        int answer = 0;
        if(hp>=5) {
            answer += hp/5;
            hp = hp - answer*5;
        }
        if(hp>=3) {
            int tmp = hp/3;
        	answer += tmp;
        	hp -= tmp*3;
        	
        }
        answer += hp;
        return answer;
    }
}