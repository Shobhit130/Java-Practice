package java_fx;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
//class should inherit the Application class
public class intro extends Application{
	public static void main(String[] args) {
		//launch should be called only one time
		launch();
	}
	//overriding the start() method in Application class
	public void start(Stage primaryStage) throws Exception {
		//adding a control - button
		Button b1 = new Button("Click Me");
		//defining the layout
		//if we want the button to be arranged in a row
		HBox root = new HBox();
		//add our control to our layout
		root.getChildren().add(b1);
		//add this layout to a scene
		Scene sc = new Scene(root);
		//add this scene to a stage
		primaryStage.setScene(sc);
		//setting height and width of the stage
		primaryStage.setHeight(300);
		primaryStage.setWidth(300);
		//making the stage to appear in full screen
//		primaryStage.setFullScreen(true);
		//getting the width and height of the stage
		System.out.println(primaryStage.getWidth());
		System.out.println(primaryStage.getHeight());
		//setting title to our stage
		primaryStage.setTitle("Shobhit");
		//getting the title
		System.out.println(primaryStage.getTitle());
		//show the stage
		primaryStage.show();
		//closing the stage
//		primaryStage.close();
	}

}

//controls - set of objects(buttons,text area,labels) - added to the layout
//layout - way in which controls are arranged (horizontal,vertical,grid) - added to a scene
//scene is added to a stage
//stage - entire window - can contain several scenes
//event - activity to be performed when we click something 

