public class Function {

    // fungsi static
    static void makan(){
        // task
        System.out.println("saya makan mie kari");
    }

    // fungsi dengan parameter
    static void minum(String minuman){
        System.out.println("saya minum " + minuman);
    }

    // fungso dgn return-value
    static int luasPersegiPanjang(int panjang, int lebar){
        int luasPersegiPanjang = panjang * lebar;
        return luasPersegiPanjang;
    }

    // fungsi non-static
    void tidur(String waktu){
        System.out.println("saya sedang tidur " + waktu);

    }

    public static void main(String[] args){

        // cara manggil fungsi static
        makan();

        // cara manggil funsi parameter
        minum("kopi");

        // cara mangi return-value
        int panjang = 4;
        int lebar = 7;
        System.out.println("Luas persegi panjang adalah " + luasPersegiPanjang(panjang, lebar));


        // cara manggil non-static
        Function saya = new Function();
        saya.tidur("malam");

    }
}