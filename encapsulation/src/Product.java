public class Product {
    // attribute veya field denir bu altta yazan özelliklere
    // tum özelliklerin onunde public var yazmaya gerek yok
    public Product(int id, String name,String description, double price,int stockAmount,String renk){
        //yapıcı metoddur bu kullanımda olur aşağıda metodsuz sekilde de get set edilebilir
        System.out.println("yapıcı blok çalıştı");
        this._id=id;
        this._name=name;
        this._price=price;
        this._description=description;
        this._renk=renk;
        this._stockAmount=stockAmount;
    }
    public Product(){
        // 2 tane constructor koyduk ve buna overloading deniyor.
    }
    private  String _name;
    private String _description;
    private  double _price;
    private  int _stockAmount;
    private  int _id;
    private  String _renk;


    public  int getId(){
        return  _id;
    }
    public void setId(int id){ //kuracak değer vermesine gerek yok
        this._id=id; // bu classtaki _id anlamına gelir
        // productın id si anlamında
        //eşitlediğimiz id ise istenilen parametre
    }

    public String getName() {
        return _name;
    }

    public void setName(String name) {
        this._name = name;
    }

    public String getDescription() {
        return _description;
    }

    public void setDescription(String description) {
        this._description = description;
    }

    public double getPrice() {
        return _price;
    }

    public void setPrice(double price) {
        this._price = price;
    }

    public int getStockAmount() {
        return _stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this._stockAmount = stockAmount;
    }

    public String getRenk() {
        return _renk;
    }

    public void setRenk(String renk) {
        this._renk = renk;
    }
}
