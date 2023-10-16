class Solution {
    public int solution(String dartResult) {
    	//점수세개를 담을 배열
        int[] score = new int[3];
        //번지수 설정
        int index = -1;
        
        for(int i=0; i<dartResult.length(); i++) {
        	char c = dartResult.charAt(i); //한문자 뽑기
        	if(Character.isDigit(c)) { //숫자일 때
        		index++;
        		if(c=='1' && dartResult.charAt(i+1) == '0') {
        			score[index] = 10;
        			i++; //두자리수 처리
        		}else {
        			score[index] = c - '0'; //아스키코드로 점수 저장
        		}
        	}else { //문자일 때
        		switch(c) {
        		case 'S': score[index] = (int)(Math.pow(score[index], 1));
        			break;
        		case 'D': score[index] = (int)(Math.pow(score[index], 2));
        			break;
        		case 'T': score[index] = (int)(Math.pow(score[index], 3)); 
        			break;
        		case '*': score[index] *= 2;
        					if(index>0) {
        						score[index-1] *=2;
        					}
        			break;
        		case '#':
        			score[index] *= -1;
        			break;
        		}
        	}
        }
        int sum = 0;
        for(int tmp : score) {
        	sum += tmp;
        }
        return sum;
    }
}