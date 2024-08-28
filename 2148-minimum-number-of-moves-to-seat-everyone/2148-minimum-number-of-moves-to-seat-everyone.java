class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        Arrays.sort(seats);
        Arrays.sort(students);
        int c=0;
        for(int i=0;i<seats.length;i++)
        {
           int n=Math.abs(seats[i]-students[i]);
           for(int j=0;j<n;j++)
           {
            c=c+1;
           }
        }
        return c;
    }
}