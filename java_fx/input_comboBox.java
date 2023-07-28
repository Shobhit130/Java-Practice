package java_fx;
import javafx.application.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.*;
public class input_comboBox extends Application{
	public static void main(String[] args) {
		launch();
	}
	public void start(Stage primaryStage) throws Exception{
		ComboBox<String> subjects = new ComboBox<String>();
		subjects.getItems().add("English");
		subjects.getItems().add("Maths");
		subjects.getItems().add("Physics");
		subjects.getItems().add("Chemistry");
		Button bt1 = new Button("Submit");
		Label lb1 = new Label();
		bt1.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				if(subjects.getValue()==null) {
					lb1.setText("Please select before submit");
				}else {
					lb1.setText("Selected subject: "+subjects.getValue());
				}
			}
		});
		VBox root = new VBox();
		root.getChildren().addAll(subjects,bt1,lb1);
		Scene sc = new Scene(root);
		primaryStage.setScene(sc);
		primaryStage.setHeight(500);
		primaryStage.setWidth(500);
		primaryStage.show();
	}
}
