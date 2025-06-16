public class Main {
    public static void main(String[] args) {
       /* String [] ogrencıler = new String[6];
        ogrencıler[0]="murat";
        ogrencıler[1]="izzet";
        ogrencıler[2]="lütfiye";
        ogrencıler[3]="cemre";
        ogrencıler[4]="engin";
        ogrencıler[5]="ferhat";
        for (int i=0;i<ogrencıler.length;i++){
            System.out.println(i+"."+ogrencıler[i]);
        }
        for (String ogrencı:ogrencıler){
            System.out.println(ogrencı); //ogrencıler dizisini orencı adlı değişkene at ve bas
        }*/

        //--------------------------------------
       /* double[] listem = {1.2, 1.3, 1.4, 6, 3.4};
        double toplam = 0;
        double enbuyuk = 0;
        for (double list : listem) {
            System.out.println(list);
            toplam = toplam + list;
            if (enbuyuk < list) {
                enbuyuk = list;
            }
        }
        System.out.println(toplam);
        System.out.println("------------------------");
        System.out.println(enbuyuk);
        */
        //---------------------------
        //cok boyutlu diziler
        String[] [] sehirler = new  String[3][3];
        sehirler[0][0]="ANKARA";
        sehirler[0][1]="KONYA";
        sehirler[0][2]="KIRIKKALE";
        // 3 BÖLGE ŞEKLİNDE AYIRDIK.
        sehirler[1][0]="AYDIN";
        sehirler[1][1]="MUĞLA";
        sehirler[1][2]="İZMİR";

        sehirler[2][0]="İSTANBUL";
        sehirler[2][1]="TEKİRDAĞ";
        sehirler[2][2]="EDİRNE";
        for (int i=0;i<=2;i++){
            for (int j=0;j<=2;j++){
                System.out.println(sehirler[i][j]);
            }
        }

    }
}