class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] result= new int[2];
        // for(int i=0; i<numbers.length;i++){
        //     int j=i+1;
        //     while(i<j && j<=numbers.length-1){
        //         if(numbers[j]==target-numbers[i]){
        //             result[0]=i+1;
        //             result[1]=j+1;
        //         }
        //         j++;
        //     }
        // }
        // return result;

        int l=0, r=numbers.length-1;

        while (l<r){
            int cur_sum=numbers[l]+numbers[r];

            if(cur_sum > target){
                r--;
            }
            else if(cur_sum < target){
                l++;
            }
            else{
                result[0]=l+1;
                result[1]=r+1;
                return result;
            }
        }

        return new int[0];
    }
}