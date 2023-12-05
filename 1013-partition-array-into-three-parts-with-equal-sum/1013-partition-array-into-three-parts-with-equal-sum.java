class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
        
        int sum=0;
        for(int num:arr)
        {
            sum = sum+num;
        }
        if(sum%3!=0)
        {
            return false;
        }
        int target = sum/3;
        int temp=0;
        int count=0;
        for(int i=0; i<arr.length; i++)
        {
            temp = temp + arr[i];
            if(temp==target)
            {
                count++;
                temp=0;
            }
        }
        if(count>=3)
        {
            return true;
        }
        
        return false;
    }
    
    
}