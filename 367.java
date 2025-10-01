public class 367 {
    class Solution {
    public boolean isPerfectSquare(int num) {
        if(num < 0){
            return false;
        }
        if(num < 2){
            return true;
        }

        long left = 0;
        long right = num;

        while(left <= right){
            long mid = left + (right - left)/2;
            if(mid*mid == num){
                return true;
            }
            else if(mid > num/mid){
                right = mid - 1;
            }
            else{
                left = mid + 1;
            }
        }
        return false;
    }
}
}
