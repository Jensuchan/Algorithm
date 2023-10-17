class Solution {
    public int solution(String binomial) {
        long answer = 0;
        String[] tmp = binomial.split(" ");
        int a = Integer.parseInt(tmp[0]);
        int b = Integer.parseInt(tmp[2]);
        switch(tmp[1]) {
        case "+": answer = a+b;
        	break;
        case "-": answer = a-b;
        	break;
        case "*": answer = a*b;
        	break;
        }
        return (int)answer;
    }
}