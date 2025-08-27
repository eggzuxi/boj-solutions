class Solution {
    public String solution(String my_string, int[] index_list) {
        String answer = "";
        int idx = 0;
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < index_list.length; i++) {
            
            idx = index_list[i];
            sb.append(my_string.charAt(idx));
            
        }
        
        answer = sb.toString();
        
        return answer;
    }
}