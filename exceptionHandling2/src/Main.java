import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        int total=0;
        BufferedReader reader=null;
        try {
            reader=new BufferedReader(new FileReader("C:\\Users\\user\\IdeaProjects\\exceptionHandling2\\src\\sayilar.txt"));
            String line = null;
            while((line=reader.readLine())!=null){
                total+=Integer.valueOf(line);//stringten ıntegera dönüştürür
            }
            System.out.println(total
            );
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        finally {
            reader.close();
        }
    }
}