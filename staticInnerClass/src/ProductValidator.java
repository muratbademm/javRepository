public class ProductValidator
{
    public static boolean isValid(Product product){
        if (product.price>0 && !product.name.isEmpty()){
            return true;
        }
        else {
            return  false;
        }
    }
    public  void bisey(){

    }
    public ProductValidator(){
        //constructor
        System.out.println("Yapıcı blok çalıştı");
    }
    static {System.out.println("static yapıcı blok çalıştı");}

}
