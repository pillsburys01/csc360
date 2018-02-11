package sample;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;

public class Smiley extends Application {
//for a smiley, we need a circle for the exterior, elipses for the eyes, circles for the pupils,
    // a triangle for the nose, and an arc for the mouth.
    @Override
    public void start(Stage primaryStage) {

        Pane pane = new Pane();

        Circle circle = new Circle();
        circle.centerXProperty().bind(pane.widthProperty().divide(2));
        circle.centerYProperty().bind(pane.heightProperty().divide(2));
        circle.setRadius(180);
        circle.setStroke(Color.BLACK);
        circle.setFill(Color.WHITE);
        pane.getChildren().add(circle);

        Polygon triangle = new Polygon();
        triangle.setFill(Color.WHITE);
        triangle.setStroke(Color.BLACK);
        ObservableList<Integer> triPoints = triangle.getPoints();

        Scene scene = new Scene(pane, 400, 400);
        primaryStage.setTitle("Smiley");
        primaryStage.setScene(scene);
        primaryStage.show();









    }




}
