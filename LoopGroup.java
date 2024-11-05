import java.util.Scanner; // Huruf "S" besar untuk Scanner

public class LoopGroup {
    
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

        //Do While
        do{
            for(int i=0; i<2; i++){
            System.out.println();
            }
            
            System.out.println("\t BIOSKOP 98 KOMENG");
            System.out.println("----------------------------------");
            System.out.println("| Kode Film |     Nama Film      |");
            System.out.println("----------------------------------");
            System.out.printf("| %9s | %13s |\n", 1, film1);
            System.out.printf("| %9s | %13s |\n", 2, film2);
            System.out.printf("| %9s | %13s |\n", 3, film3);
            System.out.println("----------------------------------");
            System.out.println();

            System.out.println("1. Buy");
            System.out.println("2. View");
            System.out.println("3. Update");
            System.out.println("4. Delete");
            System.out.println("5. Exit");
            System.out.println("Choose: ");

            
            // Exception Handling
            try {
                choose = scan.nextInt();
                scan.nextLine(); 
                System.out.println("Anda Memilih: " + choose);
            } catch (Exception e){
                System.out.println("Harus Angka!!");
                choose = -1;
                scan.nextLine();

            }

            //Switch Statements
            switch (choose) {
                case 1:
                    System.out.println("Masukkan Nama Anda: ");
                    tempName = scan.nextLine();

                    //Variable untuk user bisa input
                    int tempPrice = 0;
                    int tempJumlah = 0;
                    int tempKode = 0;
                    int uang = 0;
                    int kembalian = 0;

                    do{
                        System.out.print("Masukkan Kode Film yang Ingin Anda Pesan:  ");
                        tempKode = scan.nextInt();
                        scan.nextLine();
                    } while (tempKode < 1 || tempKode > 3);

                    do{
                        System.out.print("Masukkan Jumlah Tiket yang Ingin Anda Pesan:  ");
                        tempJumlah = scan.nextInt();
                        scan.nextLine();
                    } while (tempJumlah<=0);

                    if(tempKode == 1){
                        tempPrice = 57500;
                    }else if(tempKode == 2){
                        tempPrice = 78600;
                    }else{
                        tempPrice = 97800;
                    }

                    int totalPrice = tempPrice * tempJumlah;
                    System.out.println("Total Harga Pemesanan Tiket Anda Sebesar " + totalPrice);


                    System.out.println("Masukkan Jumlah Uang Anda: ");
                    uang = scan.nextInt();
                    scan.nextLine();

                    if(uang < totalPrice){
                        System.out.println("Maaf Uang Anda Tidak Cukup");
                    }else{
                        kembalian = (uang - totalPrice);
                        System.out.println("Kembalian Anda Sebesar " + kembalian);
                        System.out.println("Thank You :)");
                    }
                    break;

                case 2:
                    break;

                case 3:
                    break;

                case 4:
                    break;

            }

        }while(choose!=5);

    }
}
