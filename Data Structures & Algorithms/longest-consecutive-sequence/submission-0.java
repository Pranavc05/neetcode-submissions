class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> sequence = new HashSet<>();
        int longest = 0;
        for(int num:nums){
            sequence.add(num);
        }
        for(int num: nums){
            if(!sequence.contains(num - 1)){
                int length = 0;
                while(sequence.contains(num + length)){
                    length+=1;
                    longest = Math.max(length, longest);
                }
            }
        }
        return longest;
    }
}
