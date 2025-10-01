public class 263 {
    class Solution {
    public boolean isUgly(int n) {
        while(n <= 0) return false;
        int num = n;
        int[] factors = new int[]{2,3,5};
        for(int factor: factors){
            while(n % factor == 0){
                n = n / factor;
            }
        }
        return n == 1;
    }
}
}
