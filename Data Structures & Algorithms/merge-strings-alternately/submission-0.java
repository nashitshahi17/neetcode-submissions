class Solution {
    public String mergeAlternately(String word1, String word2) {
        int i = 0;
        int j = 0;
        char[] w1 = word1.toCharArray();
        char[] w2 = word2.toCharArray();
        char[] s = new char[word1.length()+word2.length()];
        int k = 0;
        while(i<word1.length()&& j<word2.length()){
            s[k] = w1[i];
            k++;
            s[k] = w2[j];
            i++;
            j++;
            k++;
        }
        while(i<word1.length()){
            s[k] = w1[i];
            k++;
            i++;
        }
        while(j<word2.length()){
            s[k] = w2[j];
            k++;
            j++;
        }
        String res = new String(s);
        return res;
    }
}