// LeetCode 1701: Average Waiting Time
class Solution {
    public double averageWaitingTime(int[][] customers) {
        long currentTime = 0;
        long totalWaiting = 0;

        for (int[] customer : customers) {
            int arrival = customer[0];
            int prep = customer[1];

            currentTime = Math.max(currentTime, arrival);
            currentTime += prep;
            totalWaiting += currentTime - arrival;
        }

        return (double) totalWaiting / customers.length;
    }
}
