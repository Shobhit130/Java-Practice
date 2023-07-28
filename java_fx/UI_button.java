package java_fx;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.image.*;
import javafx.scene.layout.*;
import javafx.scene.text.*;
public class UI_button extends Application {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		launch();
	}
	public void start(Stage primaryStage) throws FileNotFoundException {
//		Button bt1 = new Button("Click Here");
//		bt1.setText("Again Setting");
//		//wrapping text
//		bt1.setWrapText(true);
//		bt1.setDisable(true);
		//adding an image
		FileInputStream fin = new FileInputStream("D:\\a2\\DCIM\\Camera\\IMG_20200903_200938~2.jpg");
		Image img = new Image(fin);
		ImageView imgview = new ImageView(img);
		Button bt1 = new Button("Click Here",imgview);
		HBox root = new HBox();
		root.getChildren().add(bt1);
		Scene sc = new Scene(root);
		primaryStage.setScene(sc);
		primaryStage.setFullScreen(true);
		primaryStage.show();
	}
}
