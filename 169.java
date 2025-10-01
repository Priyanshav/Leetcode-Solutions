public class 169 {
    class Solution {
    public int majorityElement(int[] nums) {
        int size = nums.length/2;
        int count = 0;
        int countEle = 0;
        int ele = nums[0];
        for(int i = 0; i < nums.length; i++){
            if(count == 0){
                count = 1;
                ele = nums[i];
            }
            else if(ele == nums[i]){
                count++;
            }
            else{
                count--;
            }
        }

        for(int i = 0; i < nums.length; i++){
            if(ele == nums[i]){
                countEle++;
            }
        }
        if(countEle > size){
            return ele;
        }
        return -1;
    }
}
}
