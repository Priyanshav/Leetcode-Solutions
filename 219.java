public class 219 {
    class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> elements = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(!elements.containsKey(nums[i])){
                elements.put(nums[i], i);
            }
            else{
                int pastInd = elements.get(nums[i]);
                if(Math.abs(pastInd - i) <= k){
                    return true;
                }
                else{
                    elements.put(nums[i], i);
                }
            }
        }
        return false;
    }
}
}
