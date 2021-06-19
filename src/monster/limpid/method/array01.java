package monster.limpid.method;

/**
 * @author zhenghaochen
 * @date 2021-06-19 14:50
 */
public class array01 {
    public static void main(String[] args) {
        int[] nums = new int[10];
        for (int i = 0; i < nums.length; i++) {
            nums[i]= i+1;
            System.out.print(nums[i]);
        }
        int[] numb = {0,1,2};
        System.out.println();
        System.out.println(numb[2]);
        for (int num : nums) {
            System.out.println(num);

        }


    }
}