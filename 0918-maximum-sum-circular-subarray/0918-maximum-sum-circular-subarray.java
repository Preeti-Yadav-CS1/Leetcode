class Solution {
    public int maxSubarraySumCircular(int[] a) {
        int n= a.length;
        if (n == 1)
              return a[0];

        // Initialize sum variable which store total sum of
        // the array.
        int sum = 0;
        for (int i = 0; i < n; i++) {
          sum += a[i];
        }

        // Initialize every variable with first value of
        // array.
        int curr_max = a[0], maxSum = a[0],
        curr_min = a[0], minSum = a[0];

        // Concept of Kadane's Algorithm
        for (int i = 1; i < n; i++)
        {

          // Kadane's Algorithm to find Maximum subarray
          // sum.
          curr_max = Math.max(curr_max + a[i], a[i]);
          maxSum = Math.max(maxSum, curr_max);

          // Kadane's Algorithm to find Minimum subarray
          // sum.
          curr_min = Math.min(curr_min + a[i], a[i]);
          minSum = Math.min(minSum, curr_min);
        }
        if (minSum == sum) {
          return maxSum;
        }

        // returning the maximum value
        return Math.max(maxSum, sum - minSum);
  }
}