public class Main {
    public static void main(String[] args)
    {
       //abstact bir sınıfın abstract olabilmesi için sınıfın başına yazılması lazımdır
        // sadece abstractta olabilir
       // abstract sınıflar asla newlenemez. newlersen fonksiyonunu yazmak durumundasın,
        //GameCalculator [] gameCalculators= new  GameCalculator[]{new KidsGameCalculator(),new MenGameCalculator(),new WomanGameCalculator()};
//        GameCalculator[] gameCalculators=new GameCalculator[]{new WomanGameCalculator()} ;
//        //
//        for (GameCalculator game :gameCalculators){
//            System.out.println(game.hesapla());
//        }
        GameCalculator gameCalculator= new WomanGameCalculator();
        gameCalculator.hesapla();
    }
}