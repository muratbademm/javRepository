public class Main {
    public static void main(String[] args) {
        //asal sayı bulma
     /*   int number=11;
        boolean asalmi=true;
        for (int i =2;i<number;i++){
            if (number%i==0){
                asalmi=false;
            }
        }
        if (asalmi==true){
            System.out.println("sayı asaldır");
        }
        else {System.out.println("sayı asal değildir");}*/
        //-------------------------------------------------
      /*  char harf = 'a';
        switch (harf) {
            case 'A':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("kalın sesli harf");
                break;
            default:
                System.out.println("ince sesli harf");

        }*/
        //-------------------------------------------------
       /* int sayi=29;
        int toplam=0;
        for (int i=1; i< sayi;i++){
            if (sayi % i ==0){
                toplam=toplam+i;
            }
        }
        if (toplam==sayi){System.out.println("Sayı mükemmel sayıdır");}
        else {System.out.println("sayı normal sayıdır.");}*/
        //------------------------------------------
        //220 ve 284 arkadaş sayıdır kendileri hariç bölenleri toplamı 284 dur
        /* int a=220;
        int b=284;
        int bölentoplami =0;
        int bölentoplami1=0;
        for (int i =1 ;i<a;i++){
            if (a%i==0){
                bölentoplami=bölentoplami+i;
            }
        }
        for (int i =1 ;i<b;i++){
            if (b%i==0){
                bölentoplami1=bölentoplami1+i;
            }
        }
        if (bölentoplami==b && bölentoplami1==a){
            System.out.println("bu iki sayı arkadaşşaktır");
        }
        else {System.out.println("sayılar arkadaş değildir");}*/
        //--------------------------------
        //sayı bulma
        int[] sayilar= new int[]{1,2,3,4,5,6,8,9,7};
        int aranacak=6;
        boolean varmi=false;
        for (int sayi:sayilar){
            if (sayi==aranacak){
                System.out.println("Sayı mevcuttur.");
                break;
            }
        }
        System.out.println("sayı mevcut değildir");
    }

}