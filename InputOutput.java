import java.util.Scanner; // Huruf "S" besar untuk Scanner

public class InputOutput {
    
    public static void main(String[] args) {
        // Membuat Scanner
        Scanner scan = new Scanner(System.in);

        // Membuat Variabel
        int choose = 0;
        String tempName = "";

        System.out.println("\t\t BIOSKOP 98 KOMENG");
        System.out.println("---------------------------------------");
        System.out.println("|  Kode Film  |  Nama Film  |  Marga  |");
        System.out.println("---------------------------------------");
        System.out.println("---------------------------------------");
        System.out.println();

        System.out.println("1. Buy");
        System.out.println("2. Pay");
        System.out.println("3. View");
        System.out.println("4. Update");
        System.out.println("5. Delete");
        System.out.println("Choose: ");
        choose = scan.nextInt();
        scan.nextLine(); // Membuang newline setelah nextInt()
        System.out.println("Anda Memilih: " + choose);

        System.out.println("Masukkan Nama Anda: ");
        tempName = scan.nextLine();
        System.out.println("Anda Memesan Tiket Atas Nama: " + tempName);
    }
}
