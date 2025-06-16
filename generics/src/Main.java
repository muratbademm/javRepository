import java.util.ArrayList;

public class Main {
    public static void main(String[] args)
    {
        ArrayList<Integer> list = new ArrayList();//farklı tiplerle çalışmamızı sağlayan generic bir classtır
        list.add(15);
        list.add(23);
        System.out.println(list.get(0));
        MyList<String> sehirler= new MyList<>();
        sehirler.add("Ankara");
        
    }
}