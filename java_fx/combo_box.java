package java_fx;
import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.image.*;
import javafx.scene.layout.*;
import javafx.scene.text.*;
public class combo_box extends Application{
	public static void main(String[] args) {
		launch();
	}
	public void start(Stage primaryStage) throws Exception {
		ComboBox<String> subjects = new ComboBox<String>();
		subjects.getItems().add("English");
		subjects.getItems().add("Maths");
		subjects.getItems().add("Physics");
		subjects.getItems().add("Chemistry");
		HBox root = new HBox();
		root.getChildren().add(subjects);
		Scene sc = new Scene(root);
		primaryStage.setScene(sc);
		primaryStage.show();
	}
}
