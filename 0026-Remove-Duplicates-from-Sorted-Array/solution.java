class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] res=new int[nums.length];
        int left=0;
        int right=nums.length-1;
        int pos=nums.length-1;
        while(left<=right){
            int leftsq=nums[left]*nums[left];
            int rightsq=nums[right]*nums[right];
            if(leftsq>rightsq){
                res[pos]=leftsq;
                left++;
            }
            else{
                res[pos]=rightsq;
                right--;
            }
            pos--;
        }
        return res;
    }

}














        //    for(int i=0;i<nums.length;i++){
        //     nums[i]=nums[i]*nums[i];
        //    }
        //    Arrays.sort(nums);
        //    return nums;