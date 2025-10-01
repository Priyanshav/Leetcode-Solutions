public class 202 {
    class Solution {
    public boolean isHappy(int n) {
        while(n != 1 && n != 4){
            int rem;
            int res = 0;
            while(n != 0){
                rem = n % 10;
                res = res + (rem * rem);
                n = n/10;
            }
            n = res;
        }
        if ( n == 1){
            return true;
        }
        else{
            return false;
        }
    }
}
}
