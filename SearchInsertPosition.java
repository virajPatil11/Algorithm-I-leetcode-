package Again;

public class SearchInsertPosition {
	public static void main(String[] args) {
		int nums[] = {1,3,4,5};
		int target = 2;
		System.out.println(search(nums,target));
	}
	
	public static int search(int[] nums, int target) {
		int l = 0;
        int r = nums.length -1;
        
        while(l <= r){
            int m = (l + r)/2;
            
            if(nums[m] == target)
                return m;
            if(nums[m] < target)
                l = m + 1;
            else
                r = m - 1;
        }
        return l;
        
        
    }
}
