/*   Created by IntelliJ IDEA.
 *   Author: Gautam Sethi (GAUTAMSETHI123)
 *   Date: 24-03-2022
 *   Time: 23:35
 *   File: GeekonacciNumber.java
 */

package Recursion;

import java.util.Scanner;

public class GeekonacciNumber {
    public static int geekNumber(int a, int b, int c, int n) {
        if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 2;
        } else if (n == 3) {
            return 3;
        } else {
            return geekNumber(a,b,c,n-1) + geekNumber(a,b,c,n- 2) + geekNumber(a,b,c, n-3);
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = 1;
        int b = 2;
        int c = 3;
        int n;
        n = scn.nextInt();
        int result = geekNumber(a,b,c,n);
        System.out.println(result);
    }
}
