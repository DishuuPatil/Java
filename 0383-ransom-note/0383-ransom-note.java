class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        
        Map<Character, Integer> ransomMap = new HashMap<>();
        
        Map<Character, Integer> magazineMap = new HashMap<>();
        
        // Count occurrences of each character in ransomNote
        for(char ch: ransomNote.toCharArray())
        {
            ransomMap.put(ch, ransomMap.getOrDefault(ch,0)+1);
        }
        
        // Count occurrences of each character in magazine
        for(char ch: magazine.toCharArray())
        {
            magazineMap.put(ch, magazineMap.getOrDefault(ch,0)+1);
        }
            
        // Check if ransomNote can be constructed from magazine
        for(Map.Entry<Character,Integer> entry: ransomMap.entrySet())
        {
            char ch = entry.getKey();
            int count = entry.getValue();
            int magazineCount = magazineMap.getOrDefault(ch,0);
            if(magazineCount<count)
            {
                return false;
            }
        }
        
        return true;
    }
}