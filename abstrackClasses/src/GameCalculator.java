public abstract class GameCalculator {
    public abstract void hesapla(); //hesaplayı her sınıf kendisi override etmek zorundadır
//        System.out.println("Puanınız :100");

    public final void gameOver(){ // bu fonksiyon final olduğu için override edilemez diğer sınıflarda üstüne yazılamaz
        System.out.println("Oyun bitti");
    }
}
