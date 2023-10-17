import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {

        //stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("view/login_form.fxml"))));
        //stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("view/registration_form.fxml"))));
        //stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("view/clothify_form.fxml"))));
        //stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("view/otp_form.fxml"))));
       // stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("view/saleschart_form.fxml"))));
        //stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("view/supplies_form.fxml"))));
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("view/itemreturn_form.fxml"))));

        stage.show();

    }
}