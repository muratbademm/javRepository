import  java.util.Scanner; //kullanıcıdan bilgi almaya yarar
// import matematik.* matematik paketindeki tüm classları import et demek
import matematik.Logaritma;
import  matematik.dortıslem;
public class Main {
    public static void main(String[] args) {

        //javanın içinde tanımlı paketler vardır bunlara built in denir
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Adınızı giriniz:");
//        String  isim = scanner.nextLine();
//        System.out.println("Merhaba"+isim);


        dortıslem dortıslem =new dortıslem();
        System.out.println(dortıslem.bol(5,1));
        Logaritma loghesap = new Logaritma();
        System.out.println(loghesap.log());
    }
}