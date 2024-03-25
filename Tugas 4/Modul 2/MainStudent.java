package modul2;

import java.util.Scanner;

public class MainStudent {
    public static void main(String[] args) {
    //no.4 
    Scanner scanner = new Scanner(System.in);
    System.out.print("Jumlah siswa adalah : ");
    int jumlahSiswa = scanner.nextInt();
    Student[] students = new Student[jumlahSiswa];
    for (int i = 0; i < students.length; i++) {
        students[i] = new Student();
    }

    Student Nayla = new Student();
    Nayla.setName("Nayla");
    Nayla.setAddress("Madiun");
    Nayla.setAge(18);
    Nayla.setMath(98);
    Nayla.setScience(90);
    Nayla.setEnglish(89);
    Nayla.displayMessage();
    
    //menggunakan constructor lain
    System.out.println("==================================");
    Student Dani = new Student("Dani", "Ngawi", 17);
    Dani.setMath(75);
    Dani.setScience(65);
    Dani.setEnglish(88);
    Dani.displayMessage();
    //siswa dengan nama Nayla dirubah informasi alamat dan umurnya melalui constructor
    System.out.println("==================================");
    //no.1 student jadi Student
    Nayla = new Student("Silvi", "Ponorogo", 18);
    Nayla.displayMessage();

    //siswa denagan nama Dani dirubah informasi alamat dan umurnya melalui method
    System.out.println("==================================");
    Dani.setAddress("Malang");
    Dani.setAge(18);
    Dani.displayMessage();

    // No. 5
    Student.jumlahObjek(); 

    scanner.close();
    }
}
