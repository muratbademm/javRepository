import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        //sözlüklere benzer
        HashMap<String,String> sozluk = new HashMap<String,String>();
        sozluk.put("book","kitap");
        sozluk.put("table","masa");
        sozluk.put("computer","bilgisyar");
        System.out.println(sozluk.size());
        for (String item: sozluk.keySet()){
            System.out.println("Eleman-"+item+" değer-"+sozluk.get(item));
        }

        System.out.println(sozluk.get("table"));
        sozluk.remove("table");
        System.out.println(sozluk.get("table"));
    }
}