package dad.bindings.hola;

import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HolaApp extends Application {

	
	
	private TextField nombreText; 
	private Label saludoLabel; 

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		
		nombreText = new TextField();
		nombreText.setPromptText("Inroduce un nombre");
		nombreText.setPrefWidth(50); // Tamaño preferido
	
		
		
		
		saludoLabel = new Label("-");
		 
		VBox root = new VBox(5, nombreText, saludoLabel);
		root.setFillWidth(false);
		root.setAlignment(Pos.CENTER);
		
		
		//StringProperty saludo = new SimpleStringProperty("¡Hola ");
		
		
		//Establecemos el bindeo
		
		saludoLabel.textProperty().bind(Bindings.concat("¡Hola, ", nombreText.textProperty(), "!"));
		
		Scene scene = new Scene(root, 320, 200);
		
		primaryStage.setTitle("Hola JavaFX von Bindings");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		
		

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		launch(args);
	}

}
