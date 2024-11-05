public class ExceptionHandling {

    public static void f() throws NullPointerException, ArrayIndexOutOfBoundsException {
        throw new NullPointerException();
    }


    public static void main(String[] args) {
        //Try Catch
        System.out.println("Try");
        try {
            int a = 28 / 0;
        } catch (Exception e){
            System.out.println("Ada Error Nih");
        }

        //finally
        System.out.println("Finally");
        try {
            //int a = 28 / 0;
        } finally {
            System.out.println("Makasi Y buat smwny");
        }

        // Try Catch Finally
        System.out.println("Try");
        try {
            int a = 28 / 0;
        } catch (Exception e){
            System.out.println("Ada Error Nih");
        } finally {
            System.out.println("Makasi Y buat smwny");
        }

        //throw
        System.out.println("Throw");
        try{
            throw new NullPointerException("Ada yang Salah, Coba Intropeksi Diri") ; 
        } catch (Exception e){
          System.out.println(e);
        }

        //throws
        System.out.println("Throws");
        try{
            f();
        } catch (Exception e){
          System.out.println(e);
        }

    }

}