class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {

        List<Integer> result = new ArrayList<Integer>();
        int i=num.length-1;

        while(k>0 || i>=0)
        {
            if(i>=0)
            {
                k= k+num[i];
            }
            result.add(k%10);
            k = k/10;
            i--;

        }
        Collections.reverse(result);
        return result;
    }
}