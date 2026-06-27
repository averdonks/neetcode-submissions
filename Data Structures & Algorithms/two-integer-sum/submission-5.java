class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> differenceMap = new HashMap<>();
        int difference = 0;

        for (int i = 0; i < nums.length; i++) {
            difference = target - nums[i];
            if (differenceMap.containsKey(difference))
                return new int[]{differenceMap.get(difference), i};

            differenceMap.put(nums[i], i);
        }

        return new int[]{};
    }
}
