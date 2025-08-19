package BuAull;

import java.util.Scanner;

public class kategoriUsia {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Masukkan USia Anda : ");
        int Usia = input.nextInt();

    if(Usia >= 5 && Usia <= 9){
        System.out.println("Anda Anak Anak");
    }else if(Usia >=10 && Usia <=18){
        System.out.println("Anda Remaja");
    }
    else if(Usia >=19 && Usia <=59){
        System.out.println("Anda Dewasa");
    }
    else if(Usia >=60){
        System.out.println("Anda Sudah Lansia");
    }
    else {
        System.out.println("Usia Tidak Valid");
    }
    }
}
    

    

    
