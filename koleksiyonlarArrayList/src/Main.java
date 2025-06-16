import java.util.ArrayList;
import java.util.Objects;

public class Main {
    public static void main(String[] args)
    {
        ArrayList sayilar = new ArrayList();
        sayilar.add(4);
        sayilar.add(5);
        sayilar.add("ankara");
//        System.out.println(sayilar.size());
//        System.out.println(sayilar.get(2));
//        sayilar.set(1,100);
//        System.out.println(sayilar.get(1));
//        sayilar.remove(0);
//        System.out.println(sayilar.get(1));
//        sayilar.clear();
        for ( Object sayilarigez:sayilar){
           System.out.println(sayilarigez);
        }


    }
}