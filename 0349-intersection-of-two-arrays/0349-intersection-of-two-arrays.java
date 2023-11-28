/**********Two pointer and HashSet**********/
/*class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        Set<Integer> res = new HashSet<>();
        
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
            else
            {
                res.add(nums1[i]);
                i++;
                j++;
            }
        }
        
        int[] result = new int[res.size()];
        int index=0;
        for(int num:res)
        {
            result[index++] = num;
        }
        return result;
    }
}*/


/****************HashSet*********/
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        
        Set<Integer> num1 = new HashSet<>();
        Set<Integer> result = new HashSet<>();
        
        for(int nums:nums1)
        {
            num1.add(nums);
        }
        
        for(int nums:nums2)
        {
            if(num1.contains(nums))
            {
                result.add(nums);
            }
        }
        
        int[] resArray = new int[result.size()];
        int index=0;
        for(int num:result)
        {
            resArray[index++] = num;
        }
        
        return resArray;
    }
}




















