public class 4 {
    class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i = nums1.length - 1;
        int j = nums2.length - 1;
        int k = nums1.length + nums2.length - 1;
        int[] nums3 = new int[nums1.length + nums2.length];

        while(i>=0 && j>=0){
            if(nums1[i] > nums2[j]){
                nums3[k--] = nums1[i--]; 
            }
            else{
                nums3[k--] = nums2[j--];
            }
        }

        while(j >= 0){
            nums3[k--] = nums2[j--];
        }
        while(i >= 0){
            nums3[k--] = nums1[i--];
        }

        int size = nums3.length;
        double median;
        if(size % 2 != 0){
            median = nums3[size/2];
        }
        else{
            median = (nums3[(size/2) - 1] + nums3[size/2]) / 2.0;
        }
        return median;
    }
}
}
