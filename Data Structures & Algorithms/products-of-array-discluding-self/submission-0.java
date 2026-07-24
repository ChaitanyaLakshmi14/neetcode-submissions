class Solution {
    public int[] productExceptSelf(int[] nums) {
        int leftproduct[] = new int[nums.length];
        leftproduct[0] = 1;
        for(int i=1;i<nums.length;i++){
            leftproduct[i] = leftproduct[i-1] * nums[i-1];
        }
        int curr = 1;
        for(int i = nums.length-2;i >= 0;i--){
            curr = curr * nums[i+1];
            leftproduct[i] = curr * leftproduct[i];
        }
        return leftproduct;
    }
}  
