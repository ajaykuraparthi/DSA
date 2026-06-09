class bookAlocation {

    private static boolean possible(int arr[], int m, int val) {

        int stdCnt = 1;
        int sum = 0;

        for (int pages : arr) {

            // ✅ single book bigger than val → impossible
            if (pages > val) return false;

            sum += pages;

            if (sum > val) {
                stdCnt++;
                sum = pages;
            }

            // ✅ early exit
            if (stdCnt > m) return false;
        }

        return true;
    }

    public int findPages(int[] nums, int m) {

        if (m > nums.length) return -1;

        int low = Integer.MIN_VALUE;
        int high = 0;

        for (int pages : nums) {
            low = Math.max(low, pages);
            high += pages;
        }

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (possible(nums, m, mid)) {
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }

        return low;
    }
}
