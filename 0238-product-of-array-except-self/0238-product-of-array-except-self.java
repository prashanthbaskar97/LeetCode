class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n= nums.length;
        int[] res= new int[n];

//Creates prefix array of multiplier for each postion of index and stores it .
        res[0]=1;
        for(int i=1 ;i<n;i++){
            res[i]=res[i-1]*nums[i-1];
        }

   //the array will be for case1 post prefix [1,1,2,6]
int postfix=1;
for(int i = n-1;i>=0;i--){
    res[i]*=postfix;
    postfix *=nums[i];

} 

//i=3 ,postfix=1 ,[1,1,2,6]
//i=2 ,postfix=4, [1,1,8,6]
//i=1, postfix=12, [1,12,8,6]
//i=0 postfix=24, [24,12,8,6]

return res;
    }


}