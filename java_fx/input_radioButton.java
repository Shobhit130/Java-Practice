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
public class input_radioButton extends Application{
	public static void main(String[] args) {
		launch();
	}
	public void start(Stage primaryStage) throws Exception{
		ToggleGroup toggle = new ToggleGroup();
		RadioButton opt1 = new RadioButton("English");
		RadioButton opt2 = new RadioButton("Maths");
		RadioButton opt3 = new RadioButton("Physics");
		RadioButton opt4 = new RadioButton("Chemistry");
		opt1.setToggleGroup(toggle);
		opt2.setToggleGroup(toggle);
		opt3.setToggleGroup(toggle);
		opt4.setToggleGroup(toggle);
		Label lb1 = new Label();
		Button bt1 = new Button("Submit");
		bt1.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				if(opt1.isSelected()) {
					lb1.setText("Correct Answer: "+opt1.getText());
				}else {
					lb1.setText("Wrong Answer");
				}
			}
		});
		
		VBox root = new VBox();
		root.getChildren().addAll(opt1,opt2,opt3,opt4,bt1,lb1);
		Scene sc = new Scene(root);
		primaryStage.setScene(sc);
		primaryStage.setHeight(500);
		primaryStage.setWidth(500);
		primaryStage.show();
	}
}
