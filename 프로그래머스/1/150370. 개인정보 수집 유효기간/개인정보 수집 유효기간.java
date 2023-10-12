import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) throws ParseException{
        List<Integer> answerList = new ArrayList<Integer>();
        
        HashMap<String, Integer> termMap = new HashMap<>();
        for(String tmp: terms) {
            String[] a = tmp.split(" ");
            termMap.put(a[0], Integer.parseInt(a[1]));
        }
        
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
        Date today1 = sdf.parse(today); 
        int cnt = 0;
        
        for (String tmp : privacies) {
            cnt++;
            String[] b = tmp.split(" ");
            Date startDate = sdf.parse(b[0]);
            int month = termMap.get(b[1]);
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(startDate);
            calendar.add(Calendar.MONTH, month);
            calendar.add(Calendar.DAY_OF_MONTH, -1);

            Date expiredDate = calendar.getTime();

            if (today1.after(expiredDate)) {
                answerList.add(cnt);
            } 
        }
        
        int[] answer = new int[answerList.size()];
        for(int i=0; i<answerList.size(); i++) {
            answer[i] = answerList.get(i);
        }

        return answer;
    }
}

