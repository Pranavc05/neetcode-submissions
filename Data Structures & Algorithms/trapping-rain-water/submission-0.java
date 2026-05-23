class Solution {
    public int trap(int[] height) {
        int totalWater = 0;
        int [] leftMax = new int[height.length];
        int [] rightMax = new int[height.length];
        int left = 0;
        for(int i = 0; i<height.length; i++){
            left = Math.max(left, height[i]);
            leftMax[i] = left;
        }
        int right = 0;
        for(int i = height.length - 1; i >= 0;i--){
            right = Math.max(right, height[i]);
            rightMax[i] = right;
        }
        for(int i=0; i< height.length;i++){
            totalWater += Math.min(leftMax[i], rightMax[i]) - height[i];
        }
        return totalWater;
    }
}
