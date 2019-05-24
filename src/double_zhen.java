import java.util.Arrays;

public class double_zhen {
    public static void main(String[] args) {
        int [] nums ={1,2,3,4,5};
        int result=findPairs(nums,1);
        System.out.println(result);
    }
    static public int findPairs(int[] nums, int k) {
        Arrays.sort(nums);//对数组进行排序
        int left=0;//左指针
        int right=1;//右指针
        int count=0;//计数
        int length=nums.length;
        while(left<length&&right<length){
            int le=nums[left];
            int rt=nums[right];
            if(rt-le<k){
                right++;//如果两个数之差小于k,right就后移
            }
            else if(rt-le>k){
                left++;
            }
            else{
                count++;
                while(left<length&&nums[left]==le){//如果这个数字在k-diff对中，那么它不可能再作为小的那个出现，所以要往后移
                    left++;
                }
                while(right<length&&nums[right]==rt){
                    right++;
                }//过滤掉相同的数字
            }
            if(left==right){
                right++;
            }
        }
        return count;
        System.out.println("length = " + length);
    }
}

