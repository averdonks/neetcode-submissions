class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> noDupeNums = new HashSet<Integer>();

        for (int num : nums) {
            noDupeNums.add(num);
        }

        if (nums.length > noDupeNums.size()) {
            return true;
        }

        return false;
    }
}