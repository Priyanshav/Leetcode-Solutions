public class 392 {
    class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.isEmpty()) return true;

        int i = 0;
        int j = 0;

        while(j < t.length()){
            if(s.charAt(i) == t.charAt(j)){
                i++;
            }
            j++;
            if(i == s.length()){
                return true;
            }
        }
        return false;
    }
}
}
