class Solution {
    public boolean isValid(String s) {
        Stack stk = new Stack();
        char[] arr = s.toCharArray();

        if(arr.length <= 1) {
            return false;
        }
        
        for(int i = 0; i < arr.length; i++) {
            if (stk.length() >= 1 && stk.isClosing(stk.getTop(), arr[i])) {
                    stk.pop();
                } else {
                    stk.push(arr[i]);
                }
            }

        return stk.isEmpty();
    }
    class Stack {
        private ArrayList<Character> stk = new ArrayList<>();

        public boolean isEmpty() {
            return stk.isEmpty();
        }

        public void push(char c) {
            stk.add(c);
            System.out.println("Pushed " + c);
        }
        
        public char pop() {
            char c = stk.get(stk.size() - 1);
            stk.remove(stk.size() - 1);
            System.out.println("Popped " + c);
            return c;
        }

        public char getTop() {
            if(stk.size() >= 1) {
                char c = stk.get(stk.size() - 1);
                return c;
            }
            return '0';
        }

        public boolean isClosing(char top, char incoming) {
            if((top == '[' && incoming == ']') || (top == '{' && incoming == '}') || (top == '(' && incoming == ')')) {
                return true;
            } else {
                return false;
            }
        }

        public int length() {
            return stk.size();
        }
    }
}
