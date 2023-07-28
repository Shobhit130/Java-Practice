package java_fx;
import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
public class date_picker extends Application {
	public static void main(String[] args) {
		launch();
	}
	public void start(Stage primaryStage) throws Exception {
		Label lb1 = new Label("Select your birth date");
		DatePicker d = new DatePicker();
		HBox root = new HBox();
		root.getChildren().addAll(lb1,d);
		Scene sc = new Scene(root);
		primaryStage.setScene(sc);
		primaryStage.setHeight(400);
		primaryStage.setWidth(400);
		primaryStage.show();
	}

}
