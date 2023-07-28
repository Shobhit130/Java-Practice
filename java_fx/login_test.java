package java_fx;
import javafx.application.*;
import javafx.event.*;
import javafx.geometry.Pos;
import javafx.stage.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.*;
import javafx.scene.*;
public class login_test extends Application{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch();
	}
	public void start(Stage primaryStage) throws Exception{
		Label lb1 = new Label("Email");
		Label lb2 = new Label("Password");
		Label lb3 = new Label();
		TextField tf1 = new TextField();
		TextField tf2 = new TextField();
		Button bt1 = new Button("Submit");
		Button bt2 = new Button("Clear");
		GridPane root = new GridPane();
		root.add(lb1,2,2);
		root.add(lb2, 2, 3);
		root.add(tf1, 3, 2);
		root.add(tf2, 3, 3);
		root.add(bt1, 2, 4);
		root.add(bt2, 3, 4);
		root.add(lb3, 2, 5);
		root.setVgap(10);
		root.setHgap(10);
		root.setAlignment(Pos.CENTER);
		root.setGridLinesVisible(true);
		bt1.setStyle("-fx-background-color:red; -fx-text-fill:white; -fx-border-color:black");
		lb1.setTextFill(Color.CADETBLUE);
		lb2.setTextFill(Color.CADETBLUE);
		bt1.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				bt1.setStyle("-fx-background-color:black;-fx-text-fill:yellow");
			}
		});
		lb1.setStyle("-fx-font: bold 20px 'serif'");
		lb2.setStyle("-fx-font: bold 20px 'serif'");
		Scene sc = new Scene(root);
		primaryStage.setScene(sc);
		primaryStage.setHeight(400);
		primaryStage.setWidth(400);
		primaryStage.show();
	}
}
