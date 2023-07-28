package java_fx;
import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
public class menus extends Application {
	public static void main(String[] args) {
		launch();
	}
	public void start(Stage primaryStage) throws Exception {
		//creating a menu bar
		MenuBar main_menu = new MenuBar();
		Menu File = new Menu("File");
		Menu Edit = new Menu("Edit");
		Menu Source = new Menu("Source");
		Menu Refactor = new Menu("Refactor");
		main_menu.getMenus().add(File);
		main_menu.getMenus().add(Edit);
		main_menu.getMenus().add(Source);
		main_menu.getMenus().add(Refactor);
		
		//adding menu items to the menu File
//		MenuItem New = new MenuItem("New");
		//creating a submenu for New
		//we create New to be a Menu
		Menu New = new Menu("New");
		MenuItem JavaProject = new MenuItem("JavaProject");
		MenuItem Project = new MenuItem("Project");
		MenuItem Package = new MenuItem("Package");
		MenuItem OpenFile = new MenuItem("OpenFile");
		MenuItem OpenProjects = new MenuItem("OpenProjects");
		//map the menu items to the file menu
		File.getItems().addAll(New,OpenFile,OpenProjects);
		New.getItems().addAll(JavaProject,Project,Package);
		BorderPane root = new BorderPane();
		root.setTop(main_menu);
		Scene sc = new Scene(root);
		primaryStage.setScene(sc);
		primaryStage.setHeight(500);
		primaryStage.setWidth(500);
		primaryStage.show();
	}

}
