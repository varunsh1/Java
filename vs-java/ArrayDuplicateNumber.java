public class ArrayDuplicateNumber {
    public int findDuplicate(int[] nums) {
        if (nums.length == 0 || nums.length == 1) {
            return -1;
        }

        int slow = nums[0];
        System.out.println("natural slow="+slow);
        int fast = nums[nums[0]];
        System.out.println("natural fast="+fast);
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[nums[fast]];
            System.out.println("slow="+slow);
            System.out.println("fast="+fast);
        }
        fast = 0;
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }

        return fast;
    }

    public static void main(String args[]) {
        int[] input = {2,1,3,1,2,5,4};
        ArrayDuplicateNumber dd = new ArrayDuplicateNumber();
        System.out.println(dd.findDuplicate(input));
    }
}