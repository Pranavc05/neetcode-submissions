class Solution {
    public boolean isValid(String s) {
        Stack<Character> store = new Stack<>();
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i) == '[' || s.charAt(i) == '{' || s.charAt(i) == '('){
                store.push(s.charAt(i));
            } else if(s.charAt(i) == ']' || s.charAt(i) == '}' || s.charAt(i) == ')'){
                if(store.isEmpty()){
                    return false;
                }
                if(s.charAt(i) == ']' && store.peek() == '['){
                    store.pop();
                } else if(s.charAt(i) == '}' && store.peek() == '{'){
                    store.pop();
                } else if(s.charAt(i) == ')' && store.peek() == '('){
                    store.pop();
                } else{
                    return false;
                }
            }
        }
        return store.isEmpty();
    }
}

//   if(s.charAt(i) == ']' && store.peek(i) != '[' s.charAt(i) == '}' || s.charAt(i) == ')'){
         //       store.peek(i) == '[' ||  store.peek(i) == '{' ||  store.peek(i) == '(';
          //  }
          //  if(s.charAt(i) == ']' && store.peek() == '['){
         //       store.pop();
        //    } else if(s.charAt(i) == '}' && store.peek() == '{'){
       //         store.pop();
        //    } else if(s.charAt(i) == ')' && store.peek() == '('){
           //     store.pop();
     //       }
   //     }
  //      return true;
  //  }
