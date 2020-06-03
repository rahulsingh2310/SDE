import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
class Q1_Solution {
    public static int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> seen = new HashMap<>();

        for (int i = 0; i < nums.length; ++i) {
            if (seen.containsKey(target - nums[i]))
                return new int[] {seen.get(target - nums[i]), i};
            seen.put(nums[i], i);
        }
        return new int[] {};
    }

    public static void main(String[] args) {

       int target;

       Scanner sc = new Scanner(System.in);
       System.out.print("Please enter length of the array : ");
       int l = sc.nextInt();

       if(l > 1 ){


       int[] nums = new int[l];
       System.out.println("Please enter values of the array : ");

       for (int j = 0; j < l; j++) {
         int value = sc.nextInt();
         nums[j] = value;
       }

       System.out.print("Please enter target value : ");
       target = sc.nextInt();

       sc.close();


       int[] results = twoSum(nums,target);

       if(results.length == 0){
         System.out.println("Sorry, Target value is not found ! ");
       }

      else {
         System.out.print("Results : ");

         for(int i=0;i<results.length;i++){
            System.out.print(results[i] + " ");
        }
      }

     }

     else{

        System.out.println("Sorry, minimum length of the array is two. ");

     }

   }


}
