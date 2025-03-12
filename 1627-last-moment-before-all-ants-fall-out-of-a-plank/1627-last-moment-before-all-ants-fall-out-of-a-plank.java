class Solution {
    public int getLastMoment(int n, int[] left, int[] right) {
        int maxTime = 0;
        
        // Find max in left
        for (int l : left) {
            maxTime = Math.max(maxTime, l);
        }

        // Find max in right (we consider the fall time)
        for (int r : right) {
            maxTime = Math.max(maxTime, n - r);
        }

        return maxTime;
    }
}
