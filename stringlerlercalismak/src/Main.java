public class Main {
    public static void main(String[] args) {
        String mesaj = "Bugün Hava Çok Güzel";
        /*System.out.println("eleman sayısı" + mesaj.length());
        System.out.println("5.eleman:" + mesaj.charAt(4));
        System.out.println(mesaj.concat("  yaşasın "));
        System.out.println(mesaj.startsWith("b"));
        System.out.println(mesaj.endsWith("l"));
        char[] karakterler= new char[5];
        mesaj.getChars(0,5,karakterler,0);
        System.out.println(karakterler);
        System.out.println(mesaj.indexOf("a"));// a kaçıncı karakter
        System.out.println(mesaj.lastIndexOf("a"));//sonuncu karakteri verir
        */
        System.out.println(mesaj.replace(' ', '-'));
        System.out.println(mesaj.substring(2)); //,5 ekleyebilirsin
        for (String kelime : mesaj.split(" ")) {
            System.out.println(kelime);
        }
        System.out.println(mesaj.toLowerCase()); //tum cümleyi küçüldü
        System.out.println(mesaj.toUpperCase());

    }

}