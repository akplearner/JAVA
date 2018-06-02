package graphics;
import javafx.application.Application;
import javafx.scene.canvas.Canvas;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.stage.Stage;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.shape.ArcType;

public class CrescentMoon extends Application{
	public static void main(String[] args){
		launch(args);
	}
	
	public void start(Stage primaryStage) throws Exception{
		Group root = new Group();
		Scene scene = new Scene(root);
		Canvas canvas = new Canvas(400, 300);
		GraphicsContext gc = canvas.getGraphicsContext2D();
		gc.strokeArc(100,  50,  150, 140, 94.5, 170, ArcType.OPEN);
		gc.strokeArc(109, 50, 150, 140, 100, 160, ArcType.OPEN);
		
		root.getChildren().add(canvas);
		primaryStage.setTitle("HappyFace in JavaFX");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}



