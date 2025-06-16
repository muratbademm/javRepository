public class dortIslem {
    public int topla(int... sayilar) {
        int toplam = 0;
        for (int toplamlar : sayilar) {
            toplam = toplamlar + toplam;
        }
        return toplam;
    }

    public int cıkar(int sayi1,int sayi2) {
        return sayi1-sayi2;
    }

    public int çarp(int sayi1,int sayi2) {
        return sayi1*sayi2;
    }

    public int böl(int sayi1,int sayi2) {
        return sayi1/sayi2 ;
    }

}
