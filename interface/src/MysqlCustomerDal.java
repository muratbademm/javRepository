public class MysqlCustomerDal implements  ICustomerDal,IRepository{

    @Override
    public void Add() {
        System.out.println("Mysql eklendi");
    }

    @Override
    public void cikar() {

    }
}
