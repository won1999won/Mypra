package org.test;
import java.util.Random;


public class test3 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] nramdom = new int[6];

        for (int i = 0; i < nramdom.length; i++) {
            nramdom[i] = random.nextInt(45) + 1;
            for (int j = i; j > 0; j--) {
                if (nramdom[j] < nramdom[j - 1]) {
                    int temp = nramdom[j];
                    nramdom[j] = nramdom[j - 1];
                    nramdom[j - 1] = temp;
                } else {
                    break;
                }

            }

        }
        for (int i = 0; i < nramdom.length; i++) {
            System.out.printf(nramdom[i] + " ");
        }
    }
}
