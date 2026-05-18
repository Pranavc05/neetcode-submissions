class Solution{
// Use a hashset to filter out duplicates 
// We need to return true if any values appears more than once in the arraay
// We should iterate through nums. The first time we see a value we add it 
// Given that we probably need a counter to keep track of if we have alredy seen a number 
// We use the hashset in the sense that we keep adding numbers that we havent seen before, and 
// if we add a duplicate number in the hashset we return true immediately
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> result = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(!result.contains(nums[i])){
                result.add(nums[i]);
            } else{
                return true;
            }
        }
        return false;
    }
}