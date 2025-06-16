public class Main {
    public static void main(String[] args)
    {
        for (int i=1;i<20;i+=2){
            System.out.println(i);
        }
        System.out.println("DÖNGÜ BİTTİ");

        int j=3;
        while (j<25){
            j++;
            System.out.println(j);
        }
        System.out.println("while döngüsü bitti");

        do {
           System.out.println(j);
            j++;
        } while (j<30);

    }
}