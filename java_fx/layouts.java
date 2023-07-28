package java_fx;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
public class layouts extends Application{

	public static void main(String[] args) throws Exception{
		launch();
	}
	public void start(Stage primaryStage) {
		Button b1 = new Button("Click Me");
		Button b2 = new Button("Click Me");
		Button b3 = new Button("Click Me");
//		Button b4 = new Button("Click Me");
//		Button b5 = new Button("Click Me");
//		Button b6 = new Button("Click Me");
//		Button b7 = new Button("Click Me");
//		Button b8 = new Button("Click Me");
//		Button b9 = new Button("Click Me");
//		Button b10 = new Button("Click Me");
//		Button b11 = new Button("Click Me");
//		Button b12 = new Button("Click Me");
//		Button b13 = new Button("Click Me");
//		Button b14 = new Button("Click Me");
		
		//horizontal box
//		HBox root = new HBox();
		
		//vertical box
//		VBox root = new VBox();
//		root.setSpacing(20);
		
		//flow pane
//		FlowPane root = new FlowPane();
		
		//grid pane
//		GridPane root = new GridPane();
//		//adding the controls is different
//		root.add(b1, 0, 0);
//		root.add(b2, 1, 1);
//		root.add(b3, 2, 2);
//		root.setGridLinesVisible(true);
//		root.setHgap(20);
//		root.setVgap(30);
		
		//border pane
		BorderPane root = new BorderPane();
		//adding node to the bottom
		root.setBottom(b1);
		root.setCenter(b2);
		root.setRight(b3);
		
//		root.getChildren().add(b1);
//		root.getChildren().add(b2);
//		root.getChildren().add(b3);
//		root.getChildren().add(b4);
//		root.getChildren().add(b5);
//		root.getChildren().add(b6);
//		root.getChildren().add(b7);
//		root.getChildren().add(b8);
//		root.getChildren().add(b9);
//		root.getChildren().add(b10);
//		root.getChildren().add(b11);
//		root.getChildren().add(b12);
//		root.getChildren().add(b13);
//		root.getChildren().add(b14);
		
		Scene sc = new Scene(root);
		primaryStage.setScene(sc);
		primaryStage.setHeight(500);
		primaryStage.setWidth(500);
		primaryStage.show();

	}

}

//layouts
//HBox - everything in a row (Horizontal Box)
//VBox - everything in a column (Vertical Box)
//StackPane - put one control over the other
//FlowPane - flexible - it wraps around
//GridPane - put controls in rows and columns - Hgap - Horizontal gap between controls
											//Vgap - Vertical gap between controls
//BorderPane - assigning the elements at the top left, top right...