class Solution {
    public List<String> commonChars(String[] words) {
        
        List<String> result = new ArrayList<>();
        
        if(words.length==0 || words==null)
        {
            return result;
        }
        
        Map<Character,Integer> firstStr = new HashMap<>();
        for(char c: words[0].toCharArray())
        {
            firstStr.put(c, firstStr.getOrDefault(c,0)+1);
        }
        
        for(int i=1; i<words.length; i++)
        {
            Map<Character,Integer> currStr = new HashMap<>();
            for(char c:words[i].toCharArray())
            {
                currStr.put(c,currStr.getOrDefault(c,0)+1);
            }
            
            for(char c : firstStr.keySet())
            {
                firstStr.put(c, Math.min((firstStr.getOrDefault(c,0)) ,(currStr.getOrDefault(c,0))));
            }
            
        }
        
        for(Map.Entry<Character,Integer> entry: firstStr.entrySet())
        {
            char ch = entry.getKey();
            int count = entry.getValue();
            for(int i=0; i<count; i++)
            {
                result.add(String.valueOf(ch));
            }
        }
        
        return result;
    }
}