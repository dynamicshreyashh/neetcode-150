class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] ans = new int[k];

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<Map.Entry<Integer, Integer>> max =
                new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            max.add(entry);
        }

        for (int i = 0; i < k; i++) {
            ans[i] = max.poll().getKey();
        }

        return ans;
    }
}