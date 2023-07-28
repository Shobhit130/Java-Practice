package java_fx;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.application.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.stage.Stage;
public class ceaser_cipher extends Application{
	public static void main(String[] args){
		launch(args);
	}
	public void start(Stage primaryStage){
		Label lb1 = new Label("Enter the text to be encrypted");
		final TextField tf1 = new TextField();
		Label lb2 = new Label("Enter the number of shifts");
		final TextField tf2 = new TextField();
		Button bt1 = new Button("Encrypt");
		Label res11 = new Label("The encrypted text is");
		final Label res1 = new Label();
		Label lb3 = new Label("Enter the text to be decrypted");
		final TextField tf3 = new TextField();
		Button bt2 = new Button("Decrypt");
		Label res12 = new Label("The decrypted text is");
		final Label res2 = new Label();
		GridPane root = new GridPane();
		tf1.setMaxHeight(100);
		tf1.setMaxWidth(100);
		tf3.setMaxHeight(100);
		tf3.setMaxWidth(100);
		root.add(lb1, 0, 0);
		root.add(tf1, 0, 1);
		root.add(lb2, 0, 2);
		root.add(tf2, 1, 2);
		root.add(bt1, 0, 3);
		root.add(res11, 0, 4);
		root.add(res1, 0,5);
		root.add(lb3, 0, 6);
		root.add(tf3, 0, 7);
		root.add(bt2, 0, 8);
		root.add(res12, 0, 9);
		root.add(res2, 0,10);
		root.setHgap(10);
		root.setVgap(10);
		Scene sc = new Scene(root);
		primaryStage.setScene(sc);
		primaryStage.setWidth(700);
		primaryStage.setHeight(700);
		primaryStage.setTitle("Caeser Cipher");
		root.setAlignment(Pos.CENTER);
		primaryStage.show();
		bt1.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent arg0) {
				boolean flag = true;
				if((tf1.getText().isEmpty() || tf2.getText().isEmpty()) && flag == true){
					res1.setText("Please enter some text");
					res1.setTextFill(Color.RED);
				}else{
					String para = tf1.getText();
					String res = "";
					int shifts = Integer.parseInt(tf2.getText());
					for(int i=0;i<para.length();i++){
						if(Character.isUpperCase(para.charAt(i))){
							char ch = (char)(((int)para.charAt(i)+shifts-65)%26+65);
							res += ch;
						}else{
							char ch = (char)(((int)para.charAt(i) + shifts-97)%26+97);
							res += ch;
						}
					}
					res1.setText(res);	
					res1.setTextFill(Color.GREEN);
				}
				
			}
		});
		bt2.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent arg0) {
				boolean flag = true;
				if(tf3.getText().isEmpty() && flag == true){
					res2.setText("Please enter some text");
					res2.setTextFill(Color.RED);
				}else{
					String para = tf3.getText();
					String res = "";
					int shifts = Integer.parseInt(tf2.getText());
					int shifts1 = 26-shifts;
					for(int i=0;i<para.length();i++){
						if(Character.isUpperCase(para.charAt(i))){
							char ch = (char)(((int)para.charAt(i)+shifts1-65)%26+65);
							res += ch;
						}else{
							char ch = (char)(((int)para.charAt(i) + shifts1-97)%26+97);
							res += ch;
						}
					}
					res2.setText(res);
					res2.setTextFill(Color.GREEN);
				}
				
			}
		});
		
	}
}

