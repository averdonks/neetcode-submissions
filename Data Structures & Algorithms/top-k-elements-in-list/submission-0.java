// Used AI hints
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> numFreq = new HashMap<>();
        for (int i = 0; i < nums.length; i++)
            numFreq.put(nums[i], numFreq.getOrDefault(nums[i], 0) + 1);

        PriorityQueue<Integer> topNums = new PriorityQueue<>((a, b) -> numFreq.get(a) - numFreq.get(b));

        for (int num : numFreq.keySet()) {
            topNums.add(num);
            if (topNums.size() > k)
                topNums.poll();
        }

        int[] res = new int[k];
        for (int i = 0; i < k; i++)
            res[i] = topNums.poll();

        return res;
    }
}
