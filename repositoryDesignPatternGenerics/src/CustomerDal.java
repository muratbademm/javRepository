public class CustomerDal implements IEntityRepository<Customer>{
// veritabanında bulunacak customer veya produckt ları getirebilmeliyiz
 // ıplement ederken dizi türünü yani generic turunu customer veya product tutmak zorundayız
//çünkü t objesi ientity den ınherıt ediliyor ve ientityi iplement eden classlar customer ve product
    @Override
    public void add(Customer entity) {

    }

    @Override
    public void delete(Customer entity) {

    }

    @Override
    public void update(Customer entity) {

    }
}
