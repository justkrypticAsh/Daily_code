class Solution {
    public int minimumDistance(int[] nums) {
       int n = nums.length;
       int ans = Integer.MAX_VALUE;
        for(int i = 0;i < n;i++){
            int j = i + 1;
            int k = i + 2;

            while(j < n-1){
                while(k < n){
                    if(nums[i] == nums[j] && nums[i] == nums[k]){
                        int dist =  Math.abs(i - j) + Math.abs(j - k) + Math.abs(k - i);
                        ans = Math.min(ans,dist);
                    }
                    k++;
                }
                j++;
                k = j + 1;
            }
        }

        return ans == Integer.MAX_VALUE ? -1 : ans;
        
    }
}