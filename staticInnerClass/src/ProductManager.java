public class ProductManager {
    public  void  Add(Product product){
       // ProductValidator validator = new ProductValidator();
        // bu sekılde newlemek yerine validator operasyonunu staticleştirebiliriz
        if (ProductValidator.isValid(product)){
            System.out.println("eklendi");
        }
        else  {
            System.out.println("ÜRÜN BİLGİLERİ GEÇERSİZDİR");
        }
        //ProductValidator productValidator = new ProductValidator();
        //yapıcı blok çalışması için newlememiz gerekiyor
    }
}
