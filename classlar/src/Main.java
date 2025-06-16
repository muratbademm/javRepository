public class Main {
    public static void main(String[] args)
    {
    CustomerManager customerManager = new CustomerManager(); //küçük harfle yazdığım nesne istediğimi yazabilirdim
     CustomerManager customerManager2 =new CustomerManager();
     customerManager2=customerManager;
        customerManager.add(); // classlar reference type dir.
       customerManager.remove(); // CustomerManager sınıfında istediğim metodu çağırdım
       customerManager.update();
       int sayi=10;
       int sayi2=20;
       sayi2=sayi;
       sayi=30;
       System.out.println(sayi2);
       System.out.println("------------------");
       int [] sayilar1= new int[]{1,2,3};
       int [] sayilar2= new int[]{4,5,6};
       sayilar2=sayilar1;
       sayilar1[0]=10;
       sayilar2[1]=56;
       System.out.println(sayilar1[1]);
       System.out.println(sayilar2[0]); // diziler aynı sınıflar gibi referans tiptir ve bu yuzden
        // custom1 ve custom2 nesnelerini birbirine eşitleyince stacta  heapte aynı noktayı işaret ederler aynı yerde tutulurlar birinde
        // bir değişiklik olunca diğerinde de aynı değişiklik olur  dizilerde aynı şekilde çalıştığı için
        // sayılar2 nın değeri artık birin değeriyle aynı olsun dedik
        // bu sebeple sayılar 1 veya 2 de yapılacak değişiklik otomatik olarak diğeride aynı yere işaret ettiği için heapte
        //2 dizide de aynı indeks değişir 2 değişkende aynı nesneyi tutmuş olur
        System.out.println("-------------------------");
        dortIslem dort =new dortIslem(); // sınıfıma nesne turettım ve nesne ile fonksiyonlarımı çağırabiliyorum
        System.out.println(dort.topla(5,6,7,8,9));
        System.out.println(dort.böl(4,2));
        System.out.println(dort.çarp(3,6));
        System.out.println(dort.cıkar(10,5));


    }

}