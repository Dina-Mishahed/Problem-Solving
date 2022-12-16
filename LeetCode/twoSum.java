class Solution {
    public static int linearSearch(int[] arr, int key, int ind){    
        for(int i=0;i<arr.length;i++){    
            if(arr[i] == key){    
                if(ind == 1)return i;    
                else {ind --;}
            }    
        }    
        return -1;    
    }   
    public int[] twoSum(int[] nums, int target) {
       int[] result = {0,0};
        for(int i = 0; i< nums.length - 1; i++){
                int index;
               if(target - nums[i] == nums[i]){
                    index = linearSearch(nums, target - nums[i],2);
               }
               else{
                     index = linearSearch(nums, target - nums[i],1);
               }
               if(index != -1  && index != i){
                    result[0] = i;
                    result[1] = index;
                    break;
               }
        } 
        return result;
    }
}