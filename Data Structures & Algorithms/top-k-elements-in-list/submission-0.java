class Solution {
    // If k is equal to 2 then we return the 2 most freq elements
    //
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();
        for(int n: nums){
            freq.put(n,freq.getOrDefault(n,0)+1);
        }


        PriorityQueue<Map.Entry<Integer,Integer>> minheap =  
        new PriorityQueue<>((a, b) -> a.getValue() - b.getValue());

        for(Map.Entry<Integer,Integer> entry : freq.entrySet()){
            minheap.add(entry);
            if(minheap.size()>k){
                minheap.poll();
            }
        }


        int []results = new int[k];
        int i =0;
        while(!minheap.isEmpty()){
            results[i] = minheap.poll().getKey();
            i++;
        }
        return results;
    }
}
