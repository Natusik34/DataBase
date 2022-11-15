import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnection {

    public static Connection DBConnection (String username, String password, String jdbcURL) {
       // String jdbcURL = "jdbc:postgresql://46.229.214.241:5432/vasiltsova_awtozaprawka";
       // String username = "Vasiltsova";
       // String password = "Vasiltsova";
        //DBConnection con1 = new DBConnection("jdbc:postgresql://46.229.214.241:5432/vasiltsova_awtozaprawka", "Vasiltsova","Vasiltsova");

        try{
            Connection connection = DriverManager.getConnection(jdbcURL, username, password);
            System.out.println("Connected");
            return connection;

        } catch (SQLException e){
            System.out.println("Error in connection");
            e.printStackTrace();
            return null;
        }
    }
    //добавление
    public static void Insert() {
        //добавление строки в таблицу измерение
        try {
            Statement statement = DBConnection("Vasiltsova", "Vasiltsova", "jdbc:postgresql://46.229.214.241:5432/vasiltsova_awtozaprawka").createStatement();
            int insertIzmenenie = statement.executeUpdate("INSERT INTO public.izmerenie(naimenovanie) VALUES ('кг')");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        //добавление строки в таблицу склад
        try {
            Statement statement = DBConnection("Vasiltsova", "Vasiltsova", "jdbc:postgresql://46.229.214.241:5432/vasiltsova_awtozaprawka").createStatement();
            int insertCklad = statement.executeUpdate("INSERT INTO public.cklad(naimenovanie) VALUES ('ДТ')");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        //добавление строки в таблицу номенклатура
        try {
            Statement statement = DBConnection("Vasiltsova", "Vasiltsova", "jdbc:postgresql://46.229.214.241:5432/vasiltsova_awtozaprawka").createStatement();
            int insertNomenklatyra = statement.executeUpdate("INSERT INTO public.nomenklatyra(naimenovanie) VALUES ('Пропан') + ADD FOREIGN KEY(id_izmerenie) REFERENCES public.izmerenie('кг')");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        //добавление строки в таблицу поставщик
        try {
            Statement statement = DBConnection("Vasiltsova", "Vasiltsova", "jdbc:postgresql://46.229.214.241:5432/vasiltsova_awtozaprawka").createStatement();
            int insertPostavchik = statement.executeUpdate("INSERT INTO public.postavchik(naimenovanie, nomer_telefona, \"INN\", \"KPP\") VALUES ('Ромашка', '89100932155', '123456789', '123456789')");
        } catch (SQLException e) {
            e.printStackTrace();
        }



        //изменение
//int ro = statement.executeUpdate("UPDATE izmerenie SET naimenovanie");
        //удаление
        //  int row = statement.executeUpdate("DELETE FROM izmerenie WHERE naimenovanie");
        //  connection.close();
    }
}