package Tar_Gergo_orai_03_06;

import java.util.Random;

public class Feladat {

    static Random rnd = new Random();

    public static void main(String[] args) {
        int sorDb = 7;
        int oszlopDb = 7;
        System.out.println("tabla");
        int[][] kocskaTabla = new int[sorDb][oszlopDb];
        for (int sor = 0; sor < sorDb; sor++) {
            for (int oszlop = 0; oszlop < oszlopDb; oszlop++) {
                int szam = rnd.nextInt(1, 100);
                if (oszlop > 0 && sor > 0) {
                    kocskaTabla[sor][oszlop] = szam;
                }
                System.out.printf("%3d", kocskaTabla[sor][oszlop]);
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("szorzotábla:");
        sorDb = 6;
        oszlopDb = 6;
        int[][] szorzoTabla = new int[sorDb][oszlopDb];
        for (int sor = 1; sor < sorDb; sor++) {
            for (int oszl = 1; oszl < oszlopDb; oszl++) {
                szorzoTabla[sor][oszl] = sor * oszl;
                System.out.printf("%4d",szorzoTabla[sor][oszl]);
            }
            System.out.println("");
        }
    }
}
