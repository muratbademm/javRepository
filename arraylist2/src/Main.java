import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args)
    {
        ArrayList<String> metinler= new ArrayList<String>();
        metinler.add("murat");
        metinler.add("turan");
        metinler.add("ankara");
        //sadece string ifade ekleyebiliriz
        Collections.sort(metinler);
        for (String metin:metinler){
            System.out.println(metin);
        }

        ArrayList<Integer> sayilar=new ArrayList<>();
        sayilar.add(5);
        sayilar.add(10);
        System.out.println(sayilar.get(1));
    }
}