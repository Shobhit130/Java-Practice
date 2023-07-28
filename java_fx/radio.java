package java_fx;
import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.image.*;
import javafx.scene.layout.*;
import javafx.scene.text.*;
public class radio extends Application{

	public static void main(String[] args) {
		launch();
	}
	public void start(Stage primaryStage) throws Exception {
		ToggleGroup group = new ToggleGroup();
		RadioButton opt1 = new RadioButton("English");
		RadioButton opt2 = new RadioButton("Maths");
		RadioButton opt3 = new RadioButton("Chemistry");
		RadioButton opt4 = new RadioButton("Physics");
		opt1.setToggleGroup(group);
		opt2.setToggleGroup(group);
		opt3.setToggleGroup(group);
		opt4.setToggleGroup(group);
		VBox root = new VBox();
		root.getChildren().add(opt1);
		root.getChildren().add(opt2);
		root.getChildren().add(opt3);
		root.getChildren().add(opt4);
		//or
//		root.getChildren().addAll(opt1,opt2,opt3,opt4);
		Scene sc = new Scene(root);
		primaryStage.setScene(sc);
		primaryStage.setFullScreen(true);
		primaryStage.show();
	}

}
