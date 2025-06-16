public class Main {
    public static void main(String[] args)
    {
        //classların tuttukları özellikler field veya attribute olarak isimlendirilirler
        // encapsulation bır sınıfın ıcınde kı ozellıklerın ancak o sınıfa ait metotlar tarafından değiştirilebilmesi
        //dışarıdan başka sınıfın değiştirip okuyamamamssı yanı sarmallama ilkesidir.
        Product urun = new Product(1,"laptop","asus laptop",10,15,"siyah");

        //Product urun = new Product();
//        urun.setName("laptop");
//        urun.setId(10);
//        urun.setDescription("asus laptop");
//        urun.setPrice(5000.0);
//        urun.setStockAmount(3);
//        urun.setRenk("mavi");
//        System.out.println(urun);
        ProductManager productManager =new ProductManager();
        productManager.Add(urun);
        productManager.Add2(1,"","",6,6);
        productManager.Add2(1,"","",6,6);
        productManager.Add2(1,"","",6,6);
        productManager.Add2(1,"","",6,6);
        productManager.Add2(1,"","",6,6);
        // YENİ BİR ÖZELLİK EKLERSEK TEK TEK HEPSİNE EKLEMEK DURUMUNDA KALICAZ

    }
}