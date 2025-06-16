public class OracleCustomerDal implements ICustomerDal,IRepository{
    @Override
    public void Add() {
        System.out.println("Oracle eklendi");
    }

    @Override
    public void cikar() {
        System.out.println("cıkarıldı");
    }
}
