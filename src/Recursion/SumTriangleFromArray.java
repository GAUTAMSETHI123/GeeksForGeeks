/*   Created by IntelliJ IDEA.
 *   Author: Gautam Sethi (GAUTAMSETHI123)
 *   Date: 24-03-2022
 *   Time: 11:19
 *   File: SumTriangleFromArray.java
 */

package Recursion;

import java.util.Arrays;

public class SumTriangleFromArray {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        sumTriangle(arr);
    }

    public static void sumTriangle(int [] arr){

        if(arr.length < 1)
            return;

        int[] arr2 = new int[arr.length-1];
        for(int i=0; i<arr.length-1; i++){
            int x = arr[i] + arr[i+1];
            arr2[i] = x;
        }

        sumTriangle(arr2);

        System.out.println(Arrays.toString(arr));
    }
}
