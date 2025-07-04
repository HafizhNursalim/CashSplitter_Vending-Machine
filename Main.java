import java.util.Scanner;
public class Main {
    public static Scanner input = new Scanner(System.in); //Input nilai saat running
    public static int banyak_tipe_pecahan_uang, total_uang, total_belanja, total_kembalian;

    public static void main(String[] args) {
        System.out.println("~ ' ~ . ~ ' ~ . ~ ' ~ . ~ ' ~ . ~ ' Hafizh Nursalim (Grevent) ' ~ . ~ ' ~ . ~ ' ~ . ~ ' ~ . ~ ' ~ \n");

        // Pembacaan uang yang tersedia pada Vending Machine ===========================================================
        System.out.print("Baca banyak tipe pecahan uang yang tersedia dalam Vending Machine:");
        banyak_tipe_pecahan_uang = input.nextInt();
        // :::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
        System.out.println("Note: Baca nilai tipe pecahan uang dalam Vending Machine dari yang terbesar hingga terkecil");
        int[] nilai_tipe_pecahan_uang = new int[banyak_tipe_pecahan_uang];
        for (int i = 0; i < banyak_tipe_pecahan_uang; i++) {
            System.out.print("Baca nilai tipe pecahan uang ke [" +(i)+ "] dalam Machine :");
            nilai_tipe_pecahan_uang[i] = input.nextInt();
        }
        System.out.println("~ ' ~ . ~ ' ~ . ~ ' ~ . ~ ' ~ . ~ ' ~ . ~ ' ~ . ~ ' ~ . ~ ' ~ . ~ ' ~ . ~ ' ~ ' ~ . ~ ' ~ . \n");
        // =============================================================================================================

        // =============================================================================================================
        System.out.print("Baca nilai total uang yang dimasukkan ke dalam Machine : ");
        total_uang = input.nextInt();
        System.out.print("Baca nilai harga total belanja produk dari Machine : ");
        total_belanja = input.nextInt();
        total_kembalian = total_uang - total_belanja;
        System.out.print("Total kembalian uang anda adalah : " +total_kembalian);
        // =============================================================================================================

        // Program memproses banyak kepingan kembalian pecahan uang ====================================================
        System.out.println("\n ~ ' ~ . ~ ' ~ . ~ ' ~ . ~ ' ~ . ~ ' ~ . ~ ' ~ . ~ ' ~ . ~ ' ~ . ~ ' ~ . ~ ' ~ ' ~ . ~ ' ~ . ");
        int [] banyak_keping_kembalian_pecahan_uang = new int[banyak_tipe_pecahan_uang];
        for (int i = 0; i < banyak_tipe_pecahan_uang; i++) {
            banyak_keping_kembalian_pecahan_uang[i] = 0;
            while (total_kembalian >= nilai_tipe_pecahan_uang[i]) {
                total_kembalian = total_kembalian - nilai_tipe_pecahan_uang[i];
                banyak_keping_kembalian_pecahan_uang[i] = banyak_keping_kembalian_pecahan_uang[i] + 1;
            }
            System.out.println("Banyak keping kembalian pecahan uang ke " +(i)+ " atau kepingan " +nilai_tipe_pecahan_uang[i]+ " yaitu : " +banyak_keping_kembalian_pecahan_uang[i]);
            System.out.println("Dari " +banyak_keping_kembalian_pecahan_uang[i]+ " keping uang " +nilai_tipe_pecahan_uang[i]+ ", sisa kembaliannya menjadi " + total_kembalian);
        }
        System.out.println("~ ' ~ . ~ ' ~ . ~ ' ~ . ~ ' ~ . ~ ' ~ . ~ ' ~ . ~ ' ~ . ~ ' ~ . ~ ' ~ . ~ ' ~ ' ~ . ~ ' ~ . \n");
        // =============================================================================================================
    }
}