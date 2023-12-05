class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] leftSum = new int[nums.length];
        int[] rightSum = new int[nums.length];
        
        leftSum[0] = 0;
        rightSum[nums.length-1] =0;
        int end = nums.length-2;
        for(int i=1; i<nums.length; i++)
        {
            leftSum[i] = leftSum[i-1] + nums[i-1];
            
            rightSum[end] = rightSum[end+1] + nums[end+1];
            end--;
        }
        
        for(int i=0; i<nums.length; i++)
        {
            leftSum[i] = Math.abs(leftSum[i] - rightSum[i]);
        }
        
        return leftSum;
    }
}