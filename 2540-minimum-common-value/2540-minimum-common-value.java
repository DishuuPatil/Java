class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        
        //int res=0;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i=0,j=0;
        while(i<nums1.length && j<nums2.length)
        {
            if(nums1[i]<nums2[j])
            {
                i++;
            }
            else if(nums1[i]>nums2[j])
            {
                j++;
            }
            else if(nums1[i]==nums2[j])
            {
                return nums1[i];
            }
        }
        return -1;
    }
}