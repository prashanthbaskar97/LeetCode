class Solution {
    public int[] twoSum(int[] nums, int target) {
    //     int[] result= new int[2];
    //     int i=0;
    //     int j=i+1;
        
    //     while(i<j){
    //        int sum=nums[i]+nums[j];
    //         if(sum==target){
    //             result[0]=i;
    //             result[1]=j;
    //             break;
    //         }else if(j==nums.length-1){
    //        // sum-=nums[i];
    //         i++;
    //         j=i+1;
    //         }
    //         else{
    //             //sum=sum-nums[j];
    //             j++;
                
    //         }
            
    //     }
    // return result;
    // }
     HashMap<Integer, Integer> prevMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int diff = target - num;

            if (prevMap.containsKey(diff)) {
                return new int[] { prevMap.get(diff), i };
            }

            prevMap.put(num, i);
        }

        return new int[] {};
    }
}