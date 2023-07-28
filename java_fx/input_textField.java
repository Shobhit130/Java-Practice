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
import java.util.*;
public class input_textField extends Application{
	public static void main(String[] args) {
		launch();
	}
	public void start(Stage primaryStage) throws Exception{
		TextField tf = new TextField();
		tf.setMaxWidth(300);
		Button bt1 = new Button("Click Here");
		Label lb1 = new Label();
		bt1.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				lb1.setText("Welcome Mr."+tf.getText());
				lb1.setFont(new Font("Times New Roman",32));
				lb1.setTextFill(Color.RED);
			}
		});
		VBox root = new VBox();
		root.getChildren().addAll(tf,bt1,lb1);
		Scene sc = new Scene(root);
		primaryStage.setScene(sc);
		primaryStage.setHeight(500);
		primaryStage.setWidth(500);
		primaryStage.show();
	}
}
