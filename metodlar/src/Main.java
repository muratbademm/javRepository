public class Main {
    public static void main(String[] args)
    {
     //
        // sayiBulmaca();
        String mesaj= sehir();
        System.out.println(mesaj);
        int sayi = topla(4,5);
        System.out.println(sayi);
        int toplam= topla2(1,3,5);
        System.out.println(toplam);
    }
    /*public static void sayiBulmaca() {
        //bir metodun içinde bir sürü iş yapılabilmeli
        //ve metodla başka fonksıyon içinde çağırabilmeliyiz
        int[] sayilar= new int[]{1,2,3,4,5,6,8,9,7};
        int aranacak=8;
        boolean varmi=false;
        for (int sayi:sayilar){
            if (sayi==aranacak){
                varmi= true;

                break;
            }
        }
        if (varmi==true){ mesajVer(aranacak);}
        else {System.out.println("sayı mevcut değildir"+aranacak);}

    }
    public static void mesajVer(int aranacak){ //int aranacak ile birlikte
        System.out.println("Sayı mevcuttur:"+aranacak);
    }*/
    //---------------------------------
    public  static void ekle() {
        System.out.println("eklendi");
    }
    public static void sil () {
        System.out.println("silindi");
    }
    public static void güncelle () {
        System.out.println("güncellendi");
    }
    public static int topla(int sayı1, int sayı2){
        return sayı1+sayı2;
    }
    public  static String sehir(){
        return "ANKARA";
    }
    public static int topla2(int... sayilar){ // 3 nokta ile istediğimiz kadar sayi yollayabiliriz
        int toplam1 =0;
        for (int sayi:sayilar){
          toplam1+=sayi;
        }
        return toplam1 ;
    }
}