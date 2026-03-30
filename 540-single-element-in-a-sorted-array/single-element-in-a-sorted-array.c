int singleNonDuplicate(int* nums, int numsSize) {
    int n = numsSize;

    if (n == 1) {
        return nums[0];
    }

    int start = 0;
    int end = n - 1;

    while (start <= end) {
        int mid = start + (end - start) / 2;

        // edge cases
        if (mid == 0 && nums[0] != nums[1]) {
            return nums[0];
        }
        if (mid == n - 1 && nums[n - 1] != nums[n - 2]) {
            return nums[n - 1];
        }

        // single element
        if (nums[mid - 1] != nums[mid] && nums[mid + 1] != nums[mid]) {
            return nums[mid];
        }

        // binary search logic
        if (mid % 2 == 0) {
            if (nums[mid] == nums[mid + 1]) {
                start = mid + 2;
            } else {
                end = mid - 1;
            }
        } else {
            if (nums[mid] == nums[mid - 1]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
    }

    return -1;
}