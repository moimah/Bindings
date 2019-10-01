package dad.bindings.dimensiones;

import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.beans.binding.DoubleBinding;
import javafx.beans.property.ReadOnlyDoubleProperty;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class Dimensiones extends Application {
	
	private Label ancho;
	private Label alto;
	private Label area;
	

	@Override
	public void start(Stage primaryStage) throws Exception {
		//
		
		
		ancho = new Label();
		alto = new Label();
		area = new Label();
		
		
		
		VBox root = new VBox(ancho, alto, area);
		root.setFillWidth(false);
		root.setAlignment(Pos.CENTER);
		
		Scene scene = new Scene(root, 320, 200);
		
		ReadOnlyDoubleProperty width  = primaryStage.widthProperty();
		ReadOnlyDoubleProperty height =  primaryStage.heightProperty();		
		DoubleBinding ar = height.multiply(width);
	
		alto.textProperty().bind(Bindings.concat("Alto: ", height));
		ancho.textProperty().bind(Bindings.concat("Ancho: ", width));
		area.textProperty().bind(Bindings.concat("Area: ", ar));
		
		
		
		
		
		
		Double numero = primaryStage.getOutputScaleX();
				
		System.out.println(numero);
		
		primaryStage.setTitle("Bindeo de tamaño de Ventana");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		
		
		

	}
	
	
	public static void main(String[] args) {
		
		launch(args);

	}


}
