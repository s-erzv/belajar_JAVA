import java.util.Scanner;

public class ConditionalStatements {
  
   public static void main(String[] args){
    // Membuat Scanner
        Scanner scan = new Scanner(System.in);

    int nilai = 0;

    System.out.println("Masukkan Nilai Anda: ");
    nilai = scan.nextInt();
    scan.nextLine();
    
    if(nilai<=75){
        System.out.println("ANDA DINYATAKAN TIDAK LULUS SELEKSI SNBP 2024");
        System.out.println("Masih ada kesempatan mendaftar dan mengikuti SNBT 2024 atau seleksi mandiri PTN");
    }else{
        System.out.println("SELAMAT! ANDA DINYATAKAN LULUS SELEKSI SNBP 2024");
    }
  }
}
