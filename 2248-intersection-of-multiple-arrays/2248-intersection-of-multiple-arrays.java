/*class Solution {
    public List<Integer> intersection(int[][] nums) {
        
        List<Integer> result = new ArrayList<>();
        
        Map<Integer,Integer> firstMap = new HashMap<>();
        for(int num: nums[0])
        {
            firstMap.put(num, firstMap.getOrDefault(num,0)+1);
        }
        
        for(int i=1; i<nums.length; i++)
        {
            Map<Integer,Integer> currentMap = new HashMap<>();
            for(int num:nums[i])
            {
                currentMap.put(num,currentMap.getOrDefault(num,0)+1);
            }
            
            for(int num:firstMap.keySet())
            {
                firstMap.put(num, Math.min( (firstMap.getOrDefault(num,0)), (currentMap.getOrDefault(num,0))));
            }
        }
        
        for(Map.Entry<Integer,Integer> entry: firstMap.entrySet())
        {
            int num = entry.getKey();
            int count = entry.getValue();
            if(count>0)
            {
                result.add(num);
            }
        }
        Collections.sort(result);
        return result;
    }
}*/

class Solution {
    public List<Integer> intersection(int[][] nums) {
        
        List<Integer> result = new ArrayList<>();
        
        Set<Integer> firstSet = new HashSet<>();
        for(int num: nums[0])
        {
            firstSet.add(num);
        }
        
        for(int i=1; i<nums.length; i++)
        {
            Set<Integer> currentSet = new HashSet<>();
            for(int num:nums[i])
            {
                currentSet.add(num);
            }
            
            //"retainAll" is used to keep only the elements that are common in both sets  
            firstSet.retainAll(currentSet);
        }
        
        result.addAll(firstSet);
        Collections.sort(result);
        return result;
    }
}