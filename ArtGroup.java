import java.util.Scanner; // Huruf "S" besar untuk Scanner

public class ArtGroup {
    
    public static void main(String[] args) {
        // Membuat Scanner
        Scanner scan = new Scanner(System.in);

        //Membuat Variable untuk film
        String film1 = " 16 Bit Sensation ";
        String film2 = " Good Night World ";
        String film3 = "Ghost in the Shell";

        // Membuat Variabel untuk inputtan si user
        int choose = 0;
        String tempName = "";

        System.out.println("\t\t BIOSKOP 98 KOMENG");
        System.out.println("----------------------");
        System.out.println("|     Nama Film      |");
        System.out.println("----------------------");
        System.out.printf("| %13s |\n", film1);
        System.out.printf("| %13s |\n", film2);
        System.out.printf("| %13s |\n", film3);
        System.out.println("----------------------");
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

        //Variable untuk user bisa input
        int tempPrice = 0;
        int tempJumlah = 0;
        int uang = 0;
        int kembalian = 0;

        //Operasi Aritmatika
        System.out.println("Masukkan Jumlah Tiket yang Ingin Anda Pesan:  ");
        tempJumlah = scan.nextInt();
        scan.nextLine();
        System.out.println("Anda Memesan Tiket dengan Jumlah " + tempJumlah);

        tempPrice = 85000;

        int totalPrice = tempPrice * tempJumlah;
        System.out.println("Total Harga Pemesanan Tiket Anda Sebesar " + totalPrice);

        System.out.println("Masukkan Jumlah Uang Anda: ");
        uang = scan.nextInt();
        scan.nextLine();

        kembalian = (uang - totalPrice);
        System.out.println("Kembalian Anda Sebesar " + kembalian);
        System.out.println("Thank You :)");





    }
}
