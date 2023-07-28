package java_fx;
import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
public class text_filed extends Application {

	public static void main(String[] args) {
		launch();
	}
	public void start(Stage primaryStage) throws Exception {
		TextField tf = new TextField();
		PasswordField pass = new PasswordField();
		tf.setMaxWidth(300);
		tf.setDisable(true);
		pass.setMaxWidth(300);
		VBox root = new VBox();
		root.getChildren().addAll(tf,pass);
		Scene sc = new Scene(root);
		primaryStage.setScene(sc);
		primaryStage.setHeight(500);
		primaryStage.setWidth(500);
		primaryStage.show();
	}

}
