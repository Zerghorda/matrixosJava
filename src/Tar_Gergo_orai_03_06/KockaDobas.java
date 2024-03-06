//Tar Gergő
package Tar_Gergo_orai_03_06;

import java.util.Random;

public class KockaDobas {

    static Random rnd = new Random();

    public static void main(String[] args) {
        int MAX_CSILLAG = 40;
        String csillagok = "****************************************";
        String csillag = "*****";

        int[] tomb = new int[13];
        int max = 0;
        for (int i = 1; i < tomb.length; i++) {
            tomb[i] = rnd.nextInt(0, tomb.length);
            if (tomb[i] > tomb[max]) {
                max = i;
            }
        }

        for (int i = 1; i < tomb.length; i++) {
            double csillagDb = (double) tomb[i] / tomb[max] * MAX_CSILLAG;
            if (tomb[i] == tomb[max]) {
                System.out.printf("%d %s (%d db)\n", i, csillagok, tomb[i]);
            } else {
                System.out.printf("%d %s (%d db)\n", i, csillag.repeat(3), tomb[i]);
            }

        }
    }

}
