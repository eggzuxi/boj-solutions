class Solution {
    public String solution(String my_string, String alp) {
        String answer = "";
        String[] arr = my_string.split("");
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < arr.length; i++) {
            
            if (arr[i].equals(alp)) {
                arr[i] = arr[i].toUpperCase();
            } else {
                arr[i] = arr[i];
            }
            
        }
        
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
        }
        
        answer = sb.toString();
        
        return answer;
    }
}