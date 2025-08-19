package BuAull;

import java.util.Scanner;

public class jamMasuk {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Masukkan Jam Masuk: " );
        int jamMasuk = input.nextInt();

        if(jamMasuk > 6){
            System.out.println("Anda Terlambat Masuk Kerja.");
        }else{

            System.out.println("Anda Masuk Tepat Waktu");

        }
        System.out.println("Terima Kasih");
    }
    
}
