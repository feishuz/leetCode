import java.util.Arrays;

public class Test1 {

    public static void main(String[] args) {
        int[] nums1=new int[]{1,2};
        int[] nums2=new int[]{3,4};

        System.out.println(findMedianSortedArrays(nums1,nums2));
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] sum=new int[nums1.length+nums2.length];
        System.arraycopy(nums1, 0, sum, 0, nums1.length);
        System.arraycopy(nums2, 0, sum, nums1.length, nums2.length);
        Arrays.sort(sum);
        if(sum.length%2==1){
            return sum[(sum.length+1)/2-1];
        }else{
            double b=((float)sum[sum.length/2-1]+(float)sum[sum.length/2])/2;
            System.out.println(Arrays.toString(sum));
            System.out.println(sum[sum.length/2-1]+sum[sum.length/2]);
            System.out.println(b);
            return (sum[sum.length/2-1]+sum[sum.length/2])/2;
        }
    }
}
