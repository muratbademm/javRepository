public class CustomerManager {
    private BaseLogger Logger;
    public  CustomerManager(BaseLogger logger){
        this.Logger=logger;
    }
    public void  Add(){
        System.out.println("Müşteri eklendi");
//        DatabaseLogger logger = new DatabaseLogger();
//        logger.Log("log mesajı");  bu iki satırı yazmak yerine bu sınıf içindeki
        // özelliğimiz olan logger ı kullanmış olucaz
        this.Logger.log("Log mesajı");
    }
}
