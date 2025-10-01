public class 50 {
    class Solution {
    public double myPow(double x, int n) {
        double result = 1.0;
        long absN = Math.abs((long)n);

        while(absN > 0){
            if(absN % 2 == 1){
                result *= x;
            }
            x*=x;
            absN/=2;
        }
        return n<0 ? 1/result : result;
    }
}
}
