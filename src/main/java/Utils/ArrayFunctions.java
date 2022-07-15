package Utils;

import java.util.Arrays;

public class ArrayFunctions {

  public static int sum3(int[] nums){

        int sum = nums[0] + nums[1] + nums[2];

        return sum;

  }

  public static int[] rotateLeft3(int[] nums){
        int first = nums[0];
        for(int j=1; j<nums.length; j++){
            nums[j-1] = nums[j];
            System.out.println(Arrays.toString(nums));
        }
        nums[nums.length -1] = first;
        return nums;
  }

  public static int[] reverse3(int [] nums){
      int[] newArray = new int[3];

      newArray[0] = nums[nums.length-1];
      newArray[1] = nums[1];
      newArray[2] = nums[0];

      return newArray;
  }

    public static int[] fix23(int[] nums) {
      //Given an int array length 3, if there is a 2 in the array immediately followed by a 3, set the 3 element to 0. Return the changed array.

        for(int j = 0; j < nums.length-1; j++){
            if(nums[j] == 2 && nums[j+1] == 3){
                nums[j+1] = 0;
            }
        }
        return nums;
    }

    public static int start1(int[] a, int []b){
        int count1 = 0;
        if(a.length > 0 && a[0]==1){
            count1 +=1;
        }
        if(b.length > 0 && b[0]==1){
            count1+=1;
        }
        return count1;
    }
    public int[] biggerTwo(int[] a, int[] b) {
        int sumA = 0;
        int sumB = 0;

       for(int j = 0; j < a.length; j++){
           sumA += a[j];
       }
       for(int i = 0; i < a.length; i++){
            sumB += b[i];
       }
       if (sumA >= sumB){
           return a;
       }else{
           return b;
       }

    }

    public static int[] makeMiddle(int[] nums) {
        int[] newArray = new int[2];
        int startPos = (nums.length / 2) - 1;
        newArray[0] = nums[startPos];
        newArray[1] = nums[startPos + 1];
        return newArray;

    }

}
