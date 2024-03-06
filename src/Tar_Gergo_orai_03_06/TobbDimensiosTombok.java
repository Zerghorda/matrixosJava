package Tar_Gergo_orai_03_06;

public class TobbDimensiosTombok {

    public static void main(String[] args) {
        final int sorDb = 3;
        final int oszlopDb = 5;
        int[][] negyzet = new int[sorDb][oszlopDb];
        negyzet[1][2] = 1;
        for (int sor = 0; sor < sorDb; sor++) {
            for (int oszlop = 0; oszlop < oszlopDb; oszlop++) {
                System.out.print(negyzet[sor][oszlop] + " ");
            }
            System.out.println("");
        }
        System.out.println("");
        int[][] fureszes = new int[5][];
        for (int sor = 0; sor < 5; sor++) {
//            System.out.println(fureszes[i]);
            for (int oszlop = 0; oszlop < 3; oszlop++) {
                int db = (int) (Math.random() * 5) + 2;
                fureszes[sor] = new int[db];
            }
        }
        fureszes[1][2] = 1;
        fureszes[2][1] = 1;
        int sorDB = fureszes.length;
        for (int sor = 0; sor < sorDB; sor++) {
            int oszlDb = fureszes[sor].length;
            for (int oszlop = 0; oszlop < oszlDb; oszlop++) {
                System.out.print(fureszes[sor][oszlop] + " ");
            }
            System.out.println("");
        }
    }
}
