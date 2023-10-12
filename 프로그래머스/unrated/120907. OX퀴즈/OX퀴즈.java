class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        //0   1   2   3   4
        //수  기호  수  등호  수
        for(int i=0; i<quiz.length; i++) {
        	String[] tmp = quiz[i].split(" ");
        	int num1 = Integer.parseInt(tmp[0]);
        	int num2 = Integer.parseInt(tmp[2]);
        	int result = Integer.parseInt(tmp[4]);
        	switch(tmp[1]) {
        	case "+":
        		if(num1+num2==result) {
        			answer[i] = "O";
        		}else {
        			answer[i] = "X";
        		}
        		break;
        	case "-":
        		if(num1-num2==result) {
        			answer[i] = "O";
        		}else {
        			answer[i] = "X";
        		}
        		break;
        	}
        }
        return answer;
    }
}