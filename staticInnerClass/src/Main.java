public class Main {
    public static void main(String[] args)
    {
        //static yapılar
        ProductManager manager = new ProductManager();
        Product product = new Product();
        product.name="mouse";
        product.price=10;
        product.id=23423;
        manager.Add(product);
        DatabaseHelper.Crudclass.Update();
        DatabaseHelper.Connection.createConnection();
    }
}