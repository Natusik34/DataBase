import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnection {

    public  DBConnection() {
        String jdbcURL = "jdbc:postgresql://46.229.214.241:5432/vasiltsova_awtozaprawka";
        String username = "Vasiltsova";
        String password = "Vasiltsova";
        //DBConnection con1 = new DBConnection("jdbc:postgresql://46.229.214.241:5432/vasiltsova_awtozaprawka", "Vasiltsova","Vasiltsova");


        try{
            Connection connection = DriverManager.getConnection(jdbcURL, username, password);
            System.out.println("Connected");
            //добавление
              Statement statement = connection.createStatement();
              int r = statement.executeUpdate("INSERT INTO izmerenie(naimenovanie)");
              //изменение
int ro = statement.executeUpdate("UPDATE izmerenie SET naimenovanie");
            //удаление
            int row = statement.executeUpdate("DELETE FROM izmerenie WHERE naimenovanie");
            connection.close();
        } catch (SQLException e){
            System.out.println("Error in connection");
            e.printStackTrace();
        }



    }



}
