
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jay Speights
 */
public class GraphicsEngine extends Application {
    
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("FLATLAND");
        Group root = new Group();
        Canvas canvas = new Canvas(400, 400);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        render(gc);
        root.getChildren().add(canvas);
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }
    
    public void render(GraphicsContext gc) {
        gc.translate(200, 200);
        gc.moveTo(0, -200);
        for (int i = 1; i <= 400; i++) {
            gc.rotate(360/7);
            gc.lineTo(0, -200 + i);
        } 
        gc.stroke();
        
    }
    
}
