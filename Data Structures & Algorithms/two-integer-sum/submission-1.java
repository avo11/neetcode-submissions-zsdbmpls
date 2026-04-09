class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        int first = 0;
        int second = 0;

        mp.put(nums[0], 0);

        for(int i = 1; i < nums.length; i++){
            first = nums[i];
            second = target - first;
            if(mp.containsKey(second)){
                return new int[]{mp.get(second), i};
            }
            else{
                mp.put(first, i);
            }
        } 
        return new int[]{};
    }
}
