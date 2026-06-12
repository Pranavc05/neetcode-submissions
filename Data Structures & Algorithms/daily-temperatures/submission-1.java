class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int [] result = new int [temperatures.length];
        Stack<Integer> temps = new Stack<>();
        for(int i = temperatures.length - 1;i>=0;i--){
            while(!temps.isEmpty() && temperatures[i] >= temperatures[temps.peek()]){
                temps.pop();
            }
            if(!temps.isEmpty()){
                result[i] = temps.peek() - i;
            }
            temps.push(i);
        }
        return result;
    }
}
