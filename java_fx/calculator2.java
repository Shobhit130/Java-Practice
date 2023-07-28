package java_fx;
import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.event.*;
import javafx.geometry.Pos;
public class calculator2 extends Application {
	public static void main(String[] args) {
		launch();
	}
	public void start(Stage primaryStage) {
		MenuBar main_menu = new MenuBar();
		Menu Calculator = new Menu("Calculator");
		Menu Converter = new Menu("Converter");
		Menu Percentage = new Menu("Percentage");
		main_menu.getMenus().add(Calculator);
		main_menu.getMenus().add(Converter);
		main_menu.getMenus().add(Percentage);
		MenuItem PercentageCalculator = new MenuItem("Percentage Calculator");
		MenuItem Normal = new MenuItem("Normal");
		MenuItem Scientific = new MenuItem("Scientific");
		Calculator.getItems().add(Normal);
		Calculator.getItems().add(Scientific);
		Percentage.getItems().add(PercentageCalculator);
		MenuItem mtokm = new MenuItem("Metre to Kilometre");
		MenuItem ctof = new MenuItem("Celsius to Fahrenheit");
		Converter.getItems().add(mtokm);
		Converter.getItems().add(ctof);
		Normal.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				Label num1 = new Label("Enter the first number");
				Label num2 = new Label("Enter the second number");
				TextField tf1 = new TextField();
				TextField tf2 = new TextField();
				Label optn = new Label("Choose any operation");
				ToggleGroup group = new ToggleGroup();
				RadioButton Addition = new RadioButton("Addition");
				RadioButton Subtraction = new RadioButton("Subtraction");
				RadioButton Multiplication = new RadioButton("Multiplication");
				RadioButton Division = new RadioButton("Division");
				Addition.setToggleGroup(group);
				Subtraction.setToggleGroup(group);
				Multiplication.setToggleGroup(group);
				Division.setToggleGroup(group);
				Label res = new Label("The result is");
				TextField result = new TextField();
				result.setDisable(true);
				Button submit = new Button("Submit");
				Button close = new Button("Close");
				Stage innerStage = new Stage();
				GridPane root1 = new GridPane();
				root1.add(num1, 0, 0);
				root1.add(tf1, 1, 0);
				root1.add(num2, 0, 1);
				root1.add(tf2, 1, 1);
				root1.add(optn, 0, 2);
				root1.add(Addition, 0, 3);
				root1.add(Subtraction, 1, 3);
				root1.add(Multiplication, 0, 4);
				root1.add(Division, 1, 4);
				root1.add(submit, 0, 5);
				root1.add(res, 0, 6);
				root1.add(result, 1, 6);
				root1.add(close, 0, 7);
				root1.setHgap(20);
				root1.setVgap(20);
				root1.setAlignment(Pos.CENTER);
				Scene sc1 = new Scene(root1);
				innerStage.setTitle("Normal Calculator");
				innerStage.setScene(sc1);
				innerStage.setHeight(500);
				innerStage.setWidth(500);
				innerStage.show();
				submit.setOnAction(new EventHandler<ActionEvent>() {
					public void handle(ActionEvent event) {
						boolean flag = true;
						int answer = 0;
						double answer1 = 0.0;
						String value = "";
						if(tf1.getText().isEmpty() && flag == true) {
							flag = false;
							result.setText("Enter First Number");
						}
						if(tf2.getText().isEmpty() && flag == true) {
							flag = false;
							result.setText("Enter Second Number");
						}
						if(flag) {
							if(Addition.isSelected()) {
								answer = Integer.parseInt(tf1.getText()) + Integer.parseInt(tf2.getText());
								value = Integer.toString(answer);
								result.setText(value);
							}else if(Multiplication.isSelected()) {
								answer = Integer.parseInt(tf1.getText()) * Integer.parseInt(tf2.getText());
								value = Integer.toString(answer);
								result.setText(value);
							}else if(Division.isSelected()) {
								answer1 = (double)((double)Integer.parseInt(tf1.getText()) / (double)Integer.parseInt(tf2.getText()));
								value = Double.toString(answer1);
								result.setText(value);
							}else if(Subtraction.isSelected()) {
								answer = Integer.parseInt(tf1.getText()) - Integer.parseInt(tf2.getText());
								value = Integer.toString(answer);
								result.setText(value);
							}else {
								result.setText("Select an operation");
							}
						}
					}
				});
				close.setOnAction(new EventHandler<ActionEvent>() {
					public void handle(ActionEvent event) {
						innerStage.close();
					}
				});
			}
		});
		PercentageCalculator.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				Label lb1 = new Label("What is");
				TextField tf1 = new TextField();
				Label lb2 = new Label("% of");
				TextField tf2 = new TextField();
				Button calculate1 = new Button("Calculate");
				Label res1 = new Label();
				TextField tf3 = new TextField();
				Label lb3 = new Label("is what % of");
				TextField tf4 = new TextField();
				Button calculate2 = new Button("Calculate");
				Button exit = new Button("Close");
				tf1.setMaxWidth(100);
				tf2.setMaxWidth(100);
				tf3.setMaxWidth(100);
				tf4.setMaxWidth(100);
				Label res2 = new Label();
				GridPane root2 = new GridPane();
				root2.add(lb1, 0, 0);
				root2.add(tf1, 1, 0);
				root2.add(lb2, 2, 0);
				root2.add(tf2, 3, 0);
				root2.add(calculate1, 4, 0);
				root2.add(res1, 0, 1);
				root2.add(tf3, 0, 2);
				root2.add(lb3, 1, 2);
				root2.add(tf4, 2, 2);
				root2.add(calculate2, 3, 2);
				root2.add(res2, 0, 3);
				root2.add(exit, 0, 4);
				calculate1.setOnAction(new EventHandler<ActionEvent>() {
					public void handle(ActionEvent event) {
						double val1;
						double val2;
						boolean flag = true;
						if((tf1.getText().isEmpty() || tf2.getText().isEmpty()) && flag == true) {
							flag = false;
							res1.setText("Please enter some value");
							res1.setTextFill(Color.RED);
						}
						if(flag) {
							val1 = Double.parseDouble(tf1.getText());
							val2 = Double.parseDouble(tf2.getText());
							double result = (val1*val2)/100.0;
							res1.setText("The output is "+Double.toString(result));
							res1.setTextFill(Color.GREEN);
						}
					}
				});
				Stage innerStage2 = new Stage();
				Scene s2 = new Scene(root2);
				innerStage2.setScene(s2);
				innerStage2.setHeight(800);
				innerStage2.setWidth(800);
				innerStage2.setTitle("Percentage Calculator");
				root2.setHgap(10);
				root2.setVgap(10);
				root2.setAlignment(Pos.CENTER);
				innerStage2.show();
				calculate2.setOnAction(new EventHandler<ActionEvent>() {
					public void handle(ActionEvent event) {
						double val1;
						double val2;
						boolean flag = true;
						if((tf3.getText().isEmpty() || tf4.getText().isEmpty()) && flag == true) {
							flag = false;
							res2.setText("Please enter some value");
							res2.setTextFill(Color.RED);
						}
						if(flag) {
							val1 = Double.parseDouble(tf3.getText());
							val2 = Double.parseDouble(tf4.getText());
							double result = (val1*100.0)/val2;
							res2.setText("The output is "+Double.toString(result) + "%");
							res2.setTextFill(Color.GREEN);
						}
					}
				});
				exit.setOnAction(new EventHandler<ActionEvent>() {
					public void handle(ActionEvent event) {
						innerStage2.close();
					}
				});
			}
		});
		BorderPane root = new BorderPane();
		root.setTop(main_menu);
		Label lb1 = new Label("Welcome to my first JAVA FX Application!");
		Scene sc = new Scene(root);
		lb1.setFont(new Font("Times New Roman",30));
		root.setCenter(lb1);
		primaryStage.setTitle("My Application");
		primaryStage.setScene(sc);
		primaryStage.setHeight(700);
		primaryStage.setWidth(700);
		primaryStage.show();
	}
}
