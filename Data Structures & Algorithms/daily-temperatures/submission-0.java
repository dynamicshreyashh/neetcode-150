class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n  = temperatures.length;
        Deque<Integer> stk = new ArrayDeque<>();

        int[] res = new int[n];

        for(int i=n-1; i >= 0; i--){
            while(!stk.isEmpty() && temperatures[stk.peek()] <= temperatures[i]){
                stk.pop();
            }

            if(!stk.isEmpty()){
                res[i] = stk.peek()- i;
            }

            stk.push(i);
        }

        return res;


    }
}