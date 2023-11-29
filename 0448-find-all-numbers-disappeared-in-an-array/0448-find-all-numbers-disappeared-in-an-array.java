class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        
        List<Integer> result = new ArrayList<>();
        Arrays.sort(nums);
        
        Set<Integer> numToSet = new HashSet<>();
        for(int num:nums)
        {
            numToSet.add(num);
        }
        
        for(int i=1; i<=nums.length; i++)
        {
            if(!numToSet.contains(i))
            {
                result.add(i);
            }
        }
        return result;
    }
}