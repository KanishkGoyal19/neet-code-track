class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> table = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int difference = target - nums[i];
            if (table.containsKey(difference)) {
                return new int[] {table.get(difference), i};
            }
            table.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}

