/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.halim.arrays.rotation;

import java.util.Scanner;

/**
 *
 * @author ABDELHALIM
 */
public class RotationMainpulator {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] nd = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nd[0]);

        int d = Integer.parseInt(nd[1]);

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        //scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

        scanner.close();

        a = rotateArrayBy(a, d);
        for (int value : a) {
            System.out.print(value + " ");
        }
    }

    private static int[] rotateArrayBy(int[] a, int shifts) {
        int temp = 0;
        for (int shift = 1; shift <= shifts; shift++) {
            temp = a[0];
            for (int i = 1; i < a.length; i++) {
                a[i - 1] = a[i];
                if (i == a.length - 1) {
                    a[i] = temp;
                }
            }
        }
        return a;
    }

}
