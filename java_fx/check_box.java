package java_fx;
import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.image.*;
import javafx.scene.layout.*;
import javafx.scene.text.*;
public class check_box extends Application{
	public static void main(String[] args) {
		launch();
	}
	public void start(Stage primaryStage) throws Exception {
		CheckBox opt1 = new CheckBox("English");
		CheckBox opt2 = new CheckBox("Maths");
		CheckBox opt3 = new CheckBox("Chemistry");
		CheckBox opt4 = new CheckBox("Physics");
		
		//Hyperlink
		Hyperlink link = new Hyperlink("https://www.google.com/");
		
		VBox root = new VBox(link);
//		root.getChildren().addAll(opt1,opt2,opt3,opt4);
		Scene sc = new Scene(root);
		primaryStage.setScene(sc);
		primaryStage.setFullScreen(true);
		primaryStage.show();
	}

}
