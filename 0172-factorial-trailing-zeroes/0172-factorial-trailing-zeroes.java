class Solution {
    public int trailingZeroes(int n) {
        return n>4? n/5+trailingZeroes(n/5):0;
    }
}