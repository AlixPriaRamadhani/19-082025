package BuAull;

import java.util.Scanner;

public class kategoriUsia {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Masukkan Nilai Anda : ");
        int Nilai = input.nextInt();

    if(Nilai >=96 && Nilai <=100){
        System.out.println("A Sangat Baik");
    }else if(Nilai >=91 && Nilai <=95){
        System.out.println("A- Sangat Baik");
    }
    else if(Nilai  >=86 && Nilai <=90){
        System.out.println("B+ Baik");
    }
    else if(Nilai >=81 && Nilai <=85){
        System.out.println("B Baik");
    }
     else if(Nilai >=75 && Nilai <=80){
        System.out.println("B- Baik");
     }
      else if(Nilai >=70 && Nilai <=74){
        System.out.println("C+ Cukup");
      }
       else if(Nilai >=65 && Nilai <=69){
        System.out.println("C Cukup");
       }
       else if(Nilai >=60 && Nilai <=64){
        System.out.println("C- Cukup");
       }
       else if(Nilai >=55 && Nilai <=59){
        System.out.println("D+ Kurang");
       }
       else if(Nilai >=0 && Nilai <=54){
        System.out.println("D Kurang");
       }
    else {
        System.out.println("Nilai Tidak Valid");
    }
    }
}
    

    

    
