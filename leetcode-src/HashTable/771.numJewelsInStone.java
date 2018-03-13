class Solution {
    public int numJewelsInStones(String J, String S) {
        int[] f = new int[128];
        for(char c : J.toCharArray())
            f[c] = 1;
        int ans = 0;
        for(char c : S.toCharArray())
            ans = f[c]+ans;
        return ans;
    }
}