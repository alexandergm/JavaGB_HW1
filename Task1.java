class Solution {
    public String mergeAlternately(String word1, String word2) {        
        StringBuilder s = new StringBuilder();
        int index = word1.length() < word2.length() ? word1.length() : word2.length();
        for (int i = 0; i < index; i++) {
            s.append(word1.charAt(i)).append(word2.charAt(i));
        }
        if (word1.length() > word2.length()) s.append(word1.substring(index));
        else s.append(word2.substring(index));
        return s.toString();
    }
}
