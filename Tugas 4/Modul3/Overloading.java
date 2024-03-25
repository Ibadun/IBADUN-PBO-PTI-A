package modul3;

import java.util.Scanner;

public class Overloading {
    //No 3
    static double hasil;
    public static void HitungLuas(int a,int b){
        int nilai = a*b;
        System.out.println("Hasil luas : "+ nilai);
    }
    // No. 3 (before)
    // public static double HitungLuas(double value, double value2){
    //     double nilai = value* value2;
    //     return nilai;
    // }
    // No. 3 (after)
    public static void HitungLuas(double value, double value2) {
        hasil = value*value2;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan nilai integer 1  : ");
        int integer1 = in.nextInt();
        System.out.print("Masukkan nilai integer 2  : ");
        int integer2 = in.nextInt();
        HitungLuas(integer1, integer2);
        System.out.print("Masukkan nilai double 1   : ");
        double double1 = in.nextDouble();
        System.out.print("Masukkan nilai double 2   : ");
        double double2 = in.nextDouble();
        // No 3
        HitungLuas(double1,double2);
        System.out.println("Hasil Luas :"+ hasil);
    }
}
    
