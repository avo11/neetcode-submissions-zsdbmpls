class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> count = new HashMap<>();
        for(int num : nums) {
            count.put(num, count.getOrDefault(num, 0) + 1);
        }

    PriorityQueue<Integer> minHeap = new PriorityQueue<>((a, b) -> count.get(a) - count.get(b));

        for(int freqNum : count.keySet()){
            minHeap.add(freqNum);
            if(minHeap.size() > k){
                minHeap.poll(); 
            }
        }
    int[] res = new int[k];
        for(int i = 0; i < k; i++){
            res[i] = minHeap.poll();

        }
        return res;
    }
}
