public class CustomerManager {
    private ICustomerDal customerDal; // Bu şekilde yazmak yerine const ıcınde de tanımlayıp isteyebiliriz.
   // IRepository repository;
    public CustomerManager (ICustomerDal customerDal){
        this.customerDal= customerDal; // ben bu constructorda
        // Icustomerdal istiyorum ve bunu iplemente eden 2 tane database var
    }
    public  void add(){
        //iş kodları yazmak için yaptık
        customerDal.Add();
    }
    /*public void Cikar(){
        repository.cikar();
    }*/
}
