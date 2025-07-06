class Solution {
    public int longestConsecutive(int[] nums) {

        if(nums.length ==0){
            return 0;
        }
        Set<Integer> numset= new HashSet();
        int longest = 1;

        for(int i=0; i<nums.length;i++){
            numset.add(nums[i]);
        }
        for(int iter : numset){
            if(!numset.contains(iter-1)){
               int count=1;
                int x =iter;
                while(numset.contains(x+1)){
                    count=count+1;
                    x=x+1;
                }
                 longest= Math.max(longest, count);
            }

        }

        return longest;
    }
}