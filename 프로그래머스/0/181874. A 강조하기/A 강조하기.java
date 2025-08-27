class Solution {
    public String solution(String myString) {
        String answer = "";
        String[] text = myString.split("");
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < text.length; i++) {
            
            if (text[i].equals("a")) {
                text[i] = "A";
            } else if (text[i].equals("A")) {
                text[i] = "A";
            } else if (text[i].equals(" ")) {
                text[i] = " ";
            } else {
                text[i] = text[i].toLowerCase();
            }
            
        }
        
        for (int i = 0; i < text.length; i++) {
            
            sb.append(text[i]);
            
        }
        
        answer = sb.toString();
        
        return answer;
    }
}