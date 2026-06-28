// After viewing solution
class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Create a hash map to store the previous numbers
        Map<Integer, Integer> prevMap = new HashMap<>();

        // Iterate through nums
        for (int i = 0; i < nums.length; i++) {
            // Declare variables for a number and the difference
            int num = nums[i];
            int diff = target - num;

            // Check if prevMap contains the complement
            if (prevMap.containsKey(diff))
                return new int[] {prevMap.get(diff), i};
            
            // Put current element into prevMap
            prevMap.put(nums[i], i);
        }

        return new int[] {};
    }
}
