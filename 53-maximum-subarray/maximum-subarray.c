#include <stdio.h>

int maxSubArray(int* nums, int numsSize) {
    
    int currentSum = nums[0];
    int maxSum = nums[0];

    for(int i = 1; i < numsSize; i++) {

        // Either start new subarray or continue old one
        if(currentSum + nums[i] > nums[i]) {
            currentSum = currentSum + nums[i];
        } else {
            currentSum = nums[i];
        }

        // Update maximum sum
        if(currentSum > maxSum) {
            maxSum = currentSum;
        }
    }

    return maxSum;
}