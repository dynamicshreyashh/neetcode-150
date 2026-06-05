class Solution {



    public int longestConsecutive(int[] nums) {

        Set<Integer> map  = new HashSet<>();
        for(int n:nums){
            map.add(n);
        }

        
        int maxCons =0;
        for(int num : map){

            if(!map.contains(num-1)){
                int curr = num+1;
                int cons = 1;
                while(map.contains(curr)) {
                    cons++;
                    curr++;
                }

                maxCons = Math.max(cons, maxCons);
            }
            
        }
        return maxCons;
    }
}