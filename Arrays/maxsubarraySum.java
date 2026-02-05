  // Maximum subarray --> it is also the qie of dynamic programing concept

public class Que2_maxSubArray {

    public static int maxSubarry(int arr[]) {

    int maxi =Integer.MIN_VALUE; // maximum sum
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {

            sum += arr[i];

            if (sum > maxi) {
                maxi = sum;
            }

            // If sum < 0: discard the sum calculated
            if (sum < 0) {
                sum = 0;
            }
        }

        // To consider the sum of the empty subarray
        // uncomment the following check:

        //if (maxi < 0) maxi = 0;

        return maxi;
    }

    public static void main(String args[]) {
        int arr[] = {2,3,-8,7,-1,2,3};
        System.out.println(maxSubarry(arr));
    }

    
}
// output: 11

    

