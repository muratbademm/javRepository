import java.util.ArrayList;

public class Main {
    public static void main(String[] args)
    {
        ArrayList<Customer> sınıf = new ArrayList<Customer>();
        sınıf.add(new Customer(1,"murat","badem"));//nesnenin 101.referans numarası
        sınıf.add(new Customer(1,"İzzet","badem"));//102.referans
        sınıf.add(new Customer(1,"Lütfiye","badem"));//103.referans
        sınıf.remove(new Customer(1,"murat","badem"));//104.referans ve silindi çünkü newleyerek oluşturup sildik
        for(Customer customer:sınıf){
            System.out.println(customer.firstname);
        }


    }
}