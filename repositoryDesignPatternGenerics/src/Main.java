public class Main {
    public static void main(String[] args)
    {
        // bu uygulamada ıentityrepositoryi iplemente edenler customer dal ve product dal
        // ı entityi iplemente edenler customer ve product
        //ientityrepository de kullandığımız generic dizinin objesi(T=türü)
        // customer veya product olarak gırılebilmesi için dal adlı sınıflarda
        // t yi ientity interfaceden  kalıtım sağladık
        // bu şekilde t objesinin türünü zorunlu oplarak ya customer ya da product
        // girilme şartı oldu dal sınıflarında
        Validator validator= new Validator();
        Product product = new Product();
        validator.validate(product);
    }
}