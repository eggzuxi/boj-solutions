class Solution {
    public String solution(int[] numLog) {
        String answer = "";
        String text = "";
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < numLog.length - 1; i++) {
            
            int num1 = numLog[i];
            int num2 = numLog[i+1];
            
            if (num1 + 1 == num2) {
                text = "w";
            } else if (num1 - 1 == num2) {
                text = "s";
            } else if (num1 + 10 == num2) {
                text = "d";
            } else if (num1 - 10 == num2) {
                text = "a";
            }
            
            sb.append(text);
            
        }
        
        answer = sb.toString();
        
        return answer;
    }
}