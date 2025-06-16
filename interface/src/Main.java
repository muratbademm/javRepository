public class Main {
    public static void main(String[] args)
    {
        // bir class birden fazla interface iplemente edebilir
        //newlenmezler ve imza taşırlar içinde bulunun override edilmesi zorunlu fonkyion yani

      CustomerManager customerManager= new CustomerManager(new MysqlCustomerDal());
    //  customerManager.customerDal =new OracleCustomerDal(); //bu satır sayesinde hangi veritabanını referans alacağını soyledik
        // bir üst satırda ise referansı fonksiyonun içine gonderdik
      customerManager.add();
//
//      customerManager.repository= new OracleCustomerDal();
//      customerManager.Cikar();
       // ICustomerDal customerDal = new OracleCustomerDal();
        //interface onu iplemente eden classın  referansını tutabilir
//        IRepository repositoryDal=new OracleCustomerDal();
//        // repositorye ait cıkar fonksıyonunu yazdırabilmek için
//        // bu interface iplemente eden oracle classını referansını tutması için newledik
//        customerDal.Add();
//        repositoryDal.cikar();
//        // üstteki iki işi tek sınıfı ve özelliğini çağırarak çözdük
//        OracleCustomerDal oracleCustomerDal = new OracleCustomerDal();
//        oracleCustomerDal.Add();
//        oracleCustomerDal.cikar();

    }
}