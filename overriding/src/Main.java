public class Main {
    public static void main(String[] args)
    {
        BaseKrediManager []  KrediManagers = new BaseKrediManager[]{new OgretmenKrediManager(),new TarimKrediManager(),new OgrenciKrediManager()};
        for (BaseKrediManager managers:KrediManagers){
            System.out.println(managers.hesapla(1000));
        }
//        OgretmenKrediManager ogretmenKrediManager = new OgretmenKrediManager();
//        System.out.println(ogretmenKrediManager.hesapla(5));
    }
}