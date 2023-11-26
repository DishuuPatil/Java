class Solution {
    public int longestPalindrome(String s) {
        
        int res=0;
        int odd=0, oddCount=0;
        Map<Character,Integer> sMap = new HashMap<>();
        
        for(char ch: s.toCharArray())
        {
            sMap.put(ch, sMap.getOrDefault(ch,0)+1);
        }
        
        for(char key: sMap.keySet())
        {
            if(sMap.get(key)%2==0)
            {
                res = res + (sMap.get(key));
                
            }
            if(sMap.get(key)%2!=0)
            {
                odd = sMap.get(key)/2;
                res = res+ (odd*2);
                oddCount++;
            }
        }
        
        if(oddCount>0)
        {
            res++;
        }
        return res;
    }
}