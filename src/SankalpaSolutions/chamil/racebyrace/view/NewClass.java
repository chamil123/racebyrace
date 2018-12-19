/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SankalpaSolutions.chamil.racebyrace.view;


/**
 *
 * @author Win 8
 */
public class NewClass {

    public static void main(String[] args) {
        int x = 4;
        int j = 0;
        int ar[] = {1, 0, 0, 4};
        int tot = 0;
        int max = 7;
        for (int i = 0; i < ar.length; i++) {
            for (j = i + 1; j < ar.length; j++) {
                System.out.println("  jj : " + ar[i] * ar[j]);
                if (max < ar[i] * ar[j]) {
                    tot += max;
                } else {
                    tot += ar[i] * ar[j];
                }
            }
        }
        System.out.println("total : " + tot);
    }

}
