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
public class input_checkBox extends Application{
	public static void main(String[] args) {
		launch();
	}
	public void start(Stage primaryStage) throws Exception{
		CheckBox opt1 = new CheckBox("English");
		CheckBox opt2 = new CheckBox("Maths");
		CheckBox opt3 = new CheckBox("Physics");
		CheckBox opt4 = new CheckBox("Chemistry");
		Button bt1 = new Button("Submit");
		Label lb1 = new Label();
		bt1.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				String str = "";
				if(opt1.isSelected()) {
					str += opt1.getText();
					str += " ";
				}
				if(opt2.isSelected()) {
					str += opt2.getText();
					str += " ";
				}
				if(opt3.isSelected()) {
					str += opt3.getText();
					str += " ";
				}
				if(opt4.isSelected()) {
					str += opt4.getText();
					str += " ";
				}
				if(str.isEmpty()) {
					lb1.setText("Please select before submit");
				}else {
					lb1.setText("Subjects Chosen: "+str);
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
