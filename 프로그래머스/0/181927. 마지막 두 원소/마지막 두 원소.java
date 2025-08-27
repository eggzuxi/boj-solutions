import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] num_list) {
        
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < num_list.length; i++) {
            list.add(num_list[i]);
        }
        
        int last_idx = num_list.length - 1;
        
        if (num_list[last_idx] > num_list[last_idx - 1]) {
            int num = num_list[last_idx] - num_list[last_idx - 1];
            list.add(num);
        } else {
            int num = num_list[last_idx] * 2;
            list.add(num);
        }
        
        answer = new int[list.size()];
        
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
        
    }
}