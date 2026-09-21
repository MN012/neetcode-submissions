class Solution {
    public int lengthOfLastWord(String s) {
    
        int word = 0; 
        int i = s.length() - 1;
        
        while (s.charAt(i) == ' ') i--;


        for (; i >= 0; i--) {
            if (s.charAt(i) == ' ') return word;
            word++;
        }

        return word;
    }
}