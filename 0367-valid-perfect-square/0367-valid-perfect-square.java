class Solution {
    public boolean isPerfectSquare(int num) {
        double n = Math.sqrt(num);
        int z = (int) n;
        
        if((z*z)==num) return true;
        
        return false;
    }
}