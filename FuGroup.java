import java.util.Scanner; 
import java.util.Vector;

public class FuGroup {
    // Membuat Scanner
    static Scanner scan = new Scanner(System.in);

    // Membuat Variabel untuk inputan si user
    static int choose = 0;
    static String tempName = "";

     // Vector
    static Vector<String> nama = new Vector<>();
    static Vector<Integer> kode = new Vector<>();
    static Vector<Integer> jumlah = new Vector<>();
    static Vector<Integer> price = new Vector<>();

    // Variable untuk user bisa input
    static int tempPrice = 0;
    static int tempJumlah = 0;
    static int tempKode = 0;
    static int uang = 0;
    static int kembalian = 0;

    static void buyTicket(){
         String tempEmail = "";
                    do {
                        System.out.print("Masukkan Nama Anda: ");
                        tempName = scan.nextLine();
                    } while (tempName.isEmpty() || tempName.length() < 3);
                    do {
                        System.out.print("Masukkan Alamat Email Anda: ");
                        tempEmail = scan.nextLine();
                    } while (!tempEmail.contains("@") || !tempEmail.contains(".com"));

                    do {
                        System.out.print("Masukkan Kode Film yang Ingin Anda Pesan: ");
                        tempKode = scan.nextInt();
                        scan.nextLine();
                    } while (tempKode < 1 || tempKode > 3);

                    do {
                        System.out.print("Masukkan Jumlah Tiket yang Ingin Anda Pesan: ");
                        tempJumlah = scan.nextInt();
                        scan.nextLine();
                    } while (tempJumlah <= 0);

                    if (tempKode == 1) {
                        tempPrice = 57500;
                    } else if (tempKode == 2) {
                        tempPrice = 78600;
                    } else {
                        tempPrice = 97800;
                    }

                    int totalPrice = tempPrice * tempJumlah;
                    System.out.println("Total Harga Pemesanan Tiket Anda Sebesar " + totalPrice);

                    System.out.print("Masukkan Jumlah Uang Anda: ");
                    uang = scan.nextInt();
                    scan.nextLine();

                    if (uang < totalPrice) {
                        System.out.println("Maaf Uang Anda Tidak Cukup");
                    } else {
                        kembalian = uang - totalPrice;
                        System.out.println("Kembalian Anda Sebesar " + kembalian);
                        System.out.println("Thank You :)");
                        
                        // Add data ke vector
                        price.add(totalPrice);
                        nama.add(tempName);
                        kode.add(tempKode);
                        jumlah.add(tempJumlah);
                    }

    }

    static void viewData(){
        if (nama.size() == 0) {
            System.out.println("Ga ada datanye etdah");
        } else {
            System.out.println("=======================================================");
            System.out.println("| No. |     Nama     | Kode Film | Jumlah |   Harga   |");
            System.out.println("=======================================================");

            for (int i = 0; i < nama.size(); i++) {
                System.out.printf("| %-2s | %-20s | %-9d | %-7d | %-11d |\n", 
                (i + 1), nama.get(i), kode.get(i), jumlah.get(i), price.get(i));
            }
            for (int i = 0; i < 3; i++) {
                System.out.println();
            }
        }
    }


    static void updateData(){
         if (nama.size() == 0) {
            System.out.println("Ga ada datanye etdah");
        } else {
            System.out.println("=======================================================");
            System.out.println("| No. |     Nama     | Kode Film | Jumlah |   Harga   |");
            System.out.println("=======================================================");

            for (int i = 0; i < nama.size(); i++) {
                System.out.printf("| %-2s | %-20s | %-9d | %-7d | %-11d |\n", 
                (i + 1), nama.get(i), kode.get(i), jumlah.get(i), price.get(i));
            }

            do {
            choose = 0;
                System.out.print("Choose >> ");

                try {
                    choose = scan.nextInt();
                    scan.nextLine();
                } catch (Exception e) {
                    scan.nextLine();
                    System.out.println("Harus pake nomor oy");
                    choose = -1;
                }
            } while (choose <= 0 || choose > nama.size());

            do {
                System.out.print("Masukkan Nama Anda: ");
                tempName = scan.nextLine();
            } while (tempName.isEmpty() || tempName.length() < 3);

            // replace data nama pada vektor
            nama.set(choose - 1, tempName);
        }

    }

    static void deleteData(){
        if (nama.size() == 0) {
            System.out.println("Ga ada datanye etdah");
        } else {
            System.out.println("=======================================================");
            System.out.println("| No. |     Nama     | Kode Film | Jumlah |   Harga   |");
            System.out.println("=======================================================");

            for (int i = 0; i < nama.size(); i++) {
                System.out.printf("| %-2s | %-20s | %-9d | %-7d | %-11d |\n", 
                (i + 1), nama.get(i), kode.get(i), jumlah.get(i), price.get(i));
            }

            do {
                choose = 0;
                System.out.print("Choose >> ");

                try {
                    choose = scan.nextInt();
                    scan.nextLine();
                } catch (Exception e) {
                    scan.nextLine();
                    System.out.println("Harus pake nomor oy");
                    choose = -1;
                }
            } while (choose <= 0 || choose > nama.size());

            // diapus nih datanya y
            nama.remove(choose - 1);
            kode.remove(choose - 1);
            jumlah.remove(choose - 1);
            price.remove(choose - 1);
        }
    }
    
    public static void main(String[] args) {
        // Array
        String[] film = {"16 bit sensation", "Teletubis", "Tech Edify"};

        // Do While
        do {
            for (int i = 0; i < 2; i++) {
                System.out.println();
            }
            
            System.out.println("\t BIOSKOP 98 KOMENG");
            System.out.println("----------------------------------");
            System.out.println("| Kode Film |     Nama Film      |");
            System.out.println("----------------------------------");
            for (int i = 0; i < film.length; i++) {
                System.out.printf("| %9s | %18s |\n", (i + 1), film[i]);
            }
            System.out.println("----------------------------------");
            System.out.println();

            System.out.println("1. Buy");
            System.out.println("2. View");
            System.out.println("3. Update");
            System.out.println("4. Delete");
            System.out.println("5. Exit");
            System.out.print("Choose: ");

            // Exception Handling
            try {
                choose = scan.nextInt();
                scan.nextLine(); 
                System.out.println("Anda Memilih: " + choose);
            } catch (Exception e) {
                System.out.println("Harus Angka!!");
                choose = -1;
                scan.nextLine();
            }

            // Switch Statements
            switch (choose) {
                case 1:
                   buyTicket();
                    break;

                case 2:
                   viewData();
                    break;

                case 3:
                   updateData();
                    break;

                case 4:
                  deleteData();
                    break;

                case 5:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
                    break;
            }
        } while (choose != 5);
    }
}

