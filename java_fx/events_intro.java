package java_fx;
import javafx.application.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
public class events_intro extends Application {

	public static void main(String[] args) {
		launch();
	}
	public void start(Stage primaryStage) throws Exception {
		Button bt1 = new Button("Click Here");
		Label lb1 = new Label();
		bt1.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				lb1.setText("You clicked the button");
			}
		});
		
		VBox root = new VBox();
		root.getChildren().addAll(bt1,lb1);
		Scene sc = new Scene(root);
		primaryStage.setScene(sc);
		primaryStage.setHeight(500);
		primaryStage.setWidth(500);
		primaryStage.show();
		
	}

}
