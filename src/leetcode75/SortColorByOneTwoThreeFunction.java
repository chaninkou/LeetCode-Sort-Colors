package leetcode75;

public class SortColorByOneTwoThreeFunction {
	// One pass only, perfect solution, super unique
    public void sortColors(int[] nums) {
        int num0 = -1;
        int num1 = -1;
        int num2 = -1;
        
        for(int i = 0; i < nums.length; i++){
        	// Update the necessary pointers
            if(nums[i] == 0){
                nums[++num2] = 2;
                nums[++num1] = 1;
                nums[++num0] = 0;
            } else if (nums[i] == 1){
                nums[++num2] = 2;
                nums[++num1] = 1;
            } else if (nums[i] == 2){
                nums[++num2] = 2;
            }
        }
        
    }
    
    // Similar to counting sort
    public void sortColors1(int[] nums) {
        int num0 = 0;
        int num1 = 0;
        int num2 = 0;
        
        // Count the numbers of 1,2,3 first
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                num0++;
            } else if(nums[i] == 1){
                num1++;
            } else if(nums[i] == 2){
                num2++;
            }
        }
        
        // Replace the array with 0, then 1, then 2
        for(int i = 0; i < num0; i++){
            nums[i] = 0;
        }
        
        for(int i = 0; i < num1; i++){
            nums[i + num0] = 1;
        }
        
        for(int i = 0; i < num2; i++){
            nums[i + num0 + num1] = 2;
        }
    }
}
