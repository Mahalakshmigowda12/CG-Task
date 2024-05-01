package array;

import java.util.Scanner;

public class TwoSum {

    public static int[] findTwoSum(int[] nums, int target) {
        int[] result = new int[2];
        
        
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
               
                if (nums[i] + nums[j] == target) {
                   
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        
      
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        
        int[] nums = new int[n];

       
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

      
        System.out.print("Enter the target sum: ");
        int target = scanner.nextInt();

       
        int[] indices = findTwoSum(nums, target);

 
        if (indices[0] != -1 && indices[1] != -1) {
            System.out.println("Indices of the two numbers that sum up to " + target + " are: [" + indices[0] + ", " + indices[1] + "]");
        } else {
            System.out.println("No two elements in the array sum up to the target " + target);
        }

        scanner.close();
    }
}

