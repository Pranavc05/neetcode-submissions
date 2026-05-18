class Solution {
    // The key is the index and the value is the current element
    // 
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> indices = new HashMap();
        for(int i =0;i<nums.length;i++){
            int x = nums[i];
            int difference = target - x;
            if(indices.containsKey(difference)){
                return new int[]{indices.get(difference), i}; 
            }
            indices.put(x,i);
        }
        return new int[0];
    }

}
