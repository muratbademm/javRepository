import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //getFileInfo();
        readFile();
        writeFile();
        readFile();
    }
    public  static void  creatFile(){
        File file = new File("C:\\Users\\user\\IdeaProjects\\files\\students.txt");
        try {
            if (file.createNewFile()){
                System.out.println("dosya oluşturuldu");
            }
            else {
                System.out.println("dosya zaten mevcut");
            }// dosya oluştuma kodu
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void getFileInfo(){
        File file = new File("C:\\Users\\user\\IdeaProjects\\files\\students.txt");
        if (file.exists()){
            System.out.println("Dosya adı: " + file.getName());
            System.out.println("Dosya yolu: " + file.getAbsolutePath());
            System.out.println("Dosya yazılabilir mi: " + file.canWrite());
            System.out.println("Dosya okunabilir mi: " + file.canRead());
            System.out.println("Dosya yolu: " + file.toURI());
            System.out.println("Dosya boyutu: " + file.length());

        }
    }
    public  static  void readFile (){
        File file = new File("C:\\Users\\user\\IdeaProjects\\files\\students.txt");
        try {
            Scanner scanner = new Scanner(file); // try içine alma sebebimiz dosya yoksa hata fırlat
            while (scanner.hasNextLine()){
                //okunacak satır var ise
                String line=scanner.nextLine();
                System.out.println(line);
            }
            scanner.close(); // while işlemi bittiği için kapatmamız gerekiyor
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    public  static  void  writeFile(){
        try {
            BufferedWriter writer=new BufferedWriter(new FileWriter("C:\\Users\\user\\IdeaProjects\\files\\students.txt",true));
            writer.newLine(); // yeni satır oluştur

            writer.write("dosya içine bu yazdığım yazıyı ekle"); // onceki yazdıklarımızı sildi
           // writer.append("yazıyı ekle");//bu sekilde eklersekte ustune yazar
            System.out.println("dosyaya yazıldı");
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}