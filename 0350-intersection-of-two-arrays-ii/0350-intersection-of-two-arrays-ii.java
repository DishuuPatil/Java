
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        
        int n,m;
        if(nums1.length > nums2.length)
        {
            n = nums2.length;
            m=nums1.length;
        }
        else
        {
            n = nums1.length;
            m = nums2.length;
        }
        
        List<Integer> result=new ArrayList<Integer>();  
          
        //int[] result = new int[n];
        int first=0, second=0;
        int i=0;
        
        while(first!=nums1.length && second!=nums2.length)
        {
            if(nums1[first]==nums2[second])
            {
                result.add(nums1[first]);
                first++;
                second++;
                i++;
            }
            else if(nums1[first]<nums2[second])
            {
                first++;
            }
            else if(nums2[second]<nums1[first])
            {
                second++;
            }
            
        }
       int[] res = result.stream().mapToInt(Integer::intValue).toArray();
        return res;
    }
}