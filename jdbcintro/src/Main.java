import java.sql.*;
import java.util.ArrayList;

public class Main {
    //jdbc paketi ile uygulamamız veritabanıyla iletişime geçer


    public static void main(String[] args) throws SQLException {
        DbHelper dbHelper = new DbHelper();
        Connection connection = null;
        PreparedStatement statement = null; //cümle anlamına gelir sql cümleciği
        ResultSet resultSet; //sql sonucu
        try {
            connection = dbHelper.getConnection();
            System.out.println("bağlantı kuruldu");
            String sqlSorgusu="delete from film_actor where film_id=? ";
            statement = connection.prepareStatement(sqlSorgusu); // ekleme işlemlerinde prepareStatement kullanılır.
            //sonuç getirmeyceğimiz için resultSete ihtiyacımız yok
            statement.setInt(1,3); // 1in anlamı 1.soru işaretinin değeri 202 dir anlamına geliyor
            statement.executeUpdate();
            System.out.println("Kayıt Silindi");
        } catch (SQLException exception) {
            dbHelper.showErrorMessage(exception);
        } finally {
            statement.close();
            connection.close();
        }
    }
    public  static void  Guncelleme() throws SQLException {
        DbHelper dbHelper = new DbHelper();
        Connection connection = null;
        PreparedStatement statement = null; //cümle anlamına gelir sql cümleciği
        ResultSet resultSet; //sql sonucu
        try {
            connection = dbHelper.getConnection();
            System.out.println("bağlantı kuruldu");
            String sqlSorgusu="update actor set first_name = 'LÜTFİYEE ', last_name='BADEMM' where actor_id=? ";
            statement = connection.prepareStatement(sqlSorgusu); // ekleme işlemlerinde prepareStatement kullanılır.
            //sonuç getirmeyceğimiz için resultSete ihtiyacımız yok
            statement.setInt(1,202); // 1in anlamı 1.soru işaretinin değeri 202 dir anlamına geliyor
            statement.executeUpdate();
            System.out.println("Kayıt Güncellendi");
        } catch (SQLException exception) {
            dbHelper.showErrorMessage(exception);
        } finally {
            statement.close();
            connection.close();
        }
    }
    public  static  void kayitEkleme() throws SQLException {
        DbHelper dbHelper = new DbHelper();
        Connection connection = null;
        PreparedStatement statement = null; //cümle anlamına gelir sql cümleciği
        ResultSet resultSet; //sql sonucu
        try {
            connection = dbHelper.getConnection();
            System.out.println("bağlantı kuruldu");
            statement = connection.prepareStatement("insert into actor (first_name,last_name) values('İZZET','BADEM');"); // ekleme işlemlerinde prepareStatement kullanılır.
            //sonuç getirmeyceğimiz için resultSete ihtiyacımız yok
            statement.executeUpdate();
            System.out.println("Kayıt Eklendi");
        } catch (SQLException exception) {
            dbHelper.showErrorMessage(exception);
        } finally {
            statement.close();
            connection.close();
        }
    }


    public  static  void  selectDemo() throws SQLException {
        DbHelper dbHelper = new DbHelper();
        Connection connection = null;
        Statement statement = null; //cümle anlamına gelir sql cümleciği
        ResultSet resultSet; //sql sonucu
        try {
            connection = dbHelper.getConnection();
            System.out.println("bağlantı kuruldu");
            statement = connection.createStatement();//bu bağlantı için sorguyu oluştur
            resultSet =statement.executeQuery("select * from film");
            ArrayList<Film> filmFıeld= new ArrayList<Film>();
            while (resultSet.next()){
                filmFıeld.add(new Film(
                        resultSet.getInt("length"),
                        resultSet.getString("special_features"),
                        resultSet.getString("rating"),
                        resultSet.getInt("rental_duration")));
            }
            System.out.println(filmFıeld.size());
        } catch (SQLException exception) {
            dbHelper.showErrorMessage(exception);
        } finally {
            connection.close();
        }
    }
}