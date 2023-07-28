package java_fx;
import javafx.application.Application;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;
import javafx.scene.control.*;
import javafx.scene.*;
public class UI_Controls extends Application {

	public static void main(String[] args) throws Exception{
		launch();
	}
	public void start(Stage primaryStage) {
		//Label - put some non editable text content
		//creating labels
		Label lb1 = new Label("Enter your name");
		//give some other text
		lb1.setText("Enter your first name");
		lb1.setTextFill(Color.RED);
		lb1.setFont(new Font("Times New Roman",32));
		lb1.setTextAlignment(TextAlignment.CENTER);
		//when we have large text
		lb1.setText("Hello I am a large large large large large large textttttt");
		lb1.setWrapText(true);
		//add this control to the layout
		HBox root = new HBox();
		//add this label to layout
		root.getChildren().add(lb1);
		//add this layout to scene
		Scene sc = new Scene(root);
		primaryStage.setScene(sc);
		primaryStage.setHeight(500);
		primaryStage.setWidth(500);
		primaryStage.show();
	}
}
