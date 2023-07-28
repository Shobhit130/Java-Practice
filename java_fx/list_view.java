package java_fx;
import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
public class list_view extends Application {

	public static void main(String[] args) {
		launch();
	}
	public void start(Stage primaryStage) throws Exception {
		ListView<String> subjects = new ListView<String>();
		subjects.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
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
