class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        
        int n = nums.length;
        int[] result = new int[n];
        
        int sum = 0;
        for(int i:nums)
        {
            sum = sum + i;
        }
        
        int leftSum=0,rightSum=0,Lnum=0;
        for(int i=0; i<n; i++)
        {
            int Rnum = n-Lnum-1;
            rightSum = sum - leftSum - nums[i];
            
            result[i] = (Lnum*nums[i] - leftSum) + (rightSum - Rnum*nums[i]);
            
            Lnum++;
            leftSum = leftSum + nums[i];
        }
                
        return result;
    }
}