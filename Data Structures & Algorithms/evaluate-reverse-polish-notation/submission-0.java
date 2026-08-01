class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> result = new Stack<>();
        for(String t : tokens ){
            if(!"*/+-".contains(t)){
                result.push(Integer.valueOf(t));
                continue;
            }
            int num2 = result.pop();
            int num1 = result.pop();
            result.push(evaluator(t, num1, num2));
        }
        return result.pop();
    }
    private int evaluator( String t, int num1, int num2){
        int result = 0;

        switch(t){
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2;
                break;
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            }
            return result;
        }
    }

