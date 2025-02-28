class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int [] prefix = new int[n];
        int [] suffix = new int[n];
        int [] ans = new int [n];

        prefix[0] = 1;
        suffix[n-1] = 1;

        //calcualate prefix
        for(int i = 1; i < n; i ++){
            prefix[i] = nums[i-1] * prefix[i-1];
        }

        //calcualte suffix
        for(int i = n-2; i >= 0; i--){
            suffix[i] = nums[i+1] * suffix[i+1];
        }

        //calculate answer
        for(int i = 0; i < n; i++){
            ans[i] = prefix[i] * suffix[i];
        }
        
        return ans;
    }
} 
