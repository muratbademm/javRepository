public class Main {
    public static void main(String[] args)
    {
        String sehir="ankara";
        try {
            int [] array= new int[]{1,2,3};
            System.out.println(array[15]); // bu bir hatadır
            // fakat yazarken altını çizmez
            //bu bloğu dene hata varsa catche parametre olarak verir
        }
        catch (StringIndexOutOfBoundsException exception){
            System.out.println("hata oluştuu: "+exception);
        }
        catch (ArrayIndexOutOfBoundsException exception){
            System.out.println("hata oluştuu: "+exception);
        }
        catch (Exception exception){
            System.out.println("loglandı: "+exception);
        }
        finally {
            System.out.println("bu blok her türlü çalışır");
        }



    }
}