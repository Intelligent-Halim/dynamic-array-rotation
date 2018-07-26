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
public class RotationEfficientMainpulator {

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
        int[] temp = new int[shifts];
        for (int i = 0; i < shifts; i++) {
            temp[i] = a[i];
        }

        for (int i = shifts, j = 0; i < a.length; i++, j++) {
            a[j] = a[i];
        }

        for (int i = a.length - shifts, j = 0; i < a.length; i++, j++) {
            a[i] = temp[j];
        }
        return a;
    }

}
