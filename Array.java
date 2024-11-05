import java.util.ArrayList;

public class Array {
    public static void main(String[] args) {
        
        // Array
        String[] buah = {"Apel", "Jeruk", "Mangga", "Nanas"};
        String buah1[] = {"Manggis", "Kelengkeng", "Anggur", "Naga"};
        String[] buah2 = new String[2];
        buah2[0]="Pepaya";
        buah2[1]="Semangka";

        for(int i=0; i<buah2.length; i++){
            System.out.println(buah2[i]);
        }

        buah2[0] = "Jeruk";


        // Array List
        ArrayList sayuran = new ArrayList<>();
        
        //function add untuk masukin data
        sayuran.add("Tomat");
        sayuran.add("Timun");
        sayuran.add("Selada");

        //function remove
        sayuran.remove("Timun");
        sayuran.remove(0);

        // Set - ubah data
        sayuran.set(1, "lokong");
    }
}
