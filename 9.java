public class 9 {
    class Solution {
    public boolean isPalindrome(int x) {
        int res = 0;
        int val = 0;
        int input = x;
        if (x > 9) {
            while (input > 0) {
                val = input % 10;
                input = input / 10;
                res = res * 10 + val;
            }
            if (res == x) {
                return true;
            }
            else{
                return false;
            }
        } else if (x < 0) {
            return false;
        } else if (x < 10) {
            return true;
        }
        else{
            return false;
        }
    }
}
}
