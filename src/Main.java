
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.Statement;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import static java.sql.DriverManager.getConnection;
import javafx.application.Application;
import  java.lang.ClassNotFoundException;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("resources/authorization.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1206, 704);
        stage.setTitle("Автозаправочная станция");
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) {

      //  DBConnection connect = new DBConnection();
      //  Scanner scanner = new Scanner(System.in);
      //  System.out.println("Enter login");
      //  String username = scanner.nextLine();
      //  System.out.println("Enter password");
      //  String password = scanner.nextLine();
        //DBConnection.Insert();
        //DBConnection.Update();
        //DBConnection.Delete();
        launch();

    }
}