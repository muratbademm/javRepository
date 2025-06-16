public class Main {
    public static void main(String[] args)
    {
        KrediUI krediUI = new KrediUI();
        OgretmenKrediManager ogretmenler= new OgretmenKrediManager();
        krediUI.KrediHesapla(new AskerKrediManager()); // bu satırda ogretmenler yerıne dırek newleyip nesne oluşturabilirdik istersek tarım istersek asker vs newleyip parametreyi yollayabiliriz

        TarimKrediManager ciftciler = new TarimKrediManager();
        //ogretmenler.Hesapla();
        //ciftciler.Hesapla();
    }
}