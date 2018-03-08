/*
Stephen Pillsbury
CSC 360 Assignment 3 Problem 2

In this program we create an array of JavaFX Rectangle objects
with random positions, widths, heights, colors, and opacities.

*/


package sample;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.shape.Rectangle;

public class ModernArt extends Application {

    private static final int NUM_RECTANGLES = 50;
    private static final int PANE_WIDTH = 600;
    private static final int PANE_HEIGHT = 300;
    private static final int MAX_SIDE_LENGTH = 100;

    public void start(Stage primaryStage){

        Group group = new Group();

        Rectangle[] rectangles = RandomRectangles();

        for(Rectangle r : rectangles) {

            group.getChildren().add(r);

        }

        Scene scene = new Scene(new StackPane(group), PANE_WIDTH, PANE_HEIGHT);
        primaryStage.setTitle("Modern Art");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    private Rectangle[] RandomRectangles(){

        Rectangle[] randomTangles = new Rectangle[NUM_RECTANGLES];
        for(int i = 0; i < NUM_RECTANGLES; i++){

            int width = (int) (Math.random() * MAX_SIDE_LENGTH) ;
            int height = (int) (Math.random() * MAX_SIDE_LENGTH);
            int x = (int) (Math.random() * PANE_WIDTH) - (width / 2);
            int y = (int) (Math.random() * PANE_HEIGHT) - (height / 2);

            randomTangles[i] = new Rectangle(x, y, width, height);
            randomTangles[i].setFill(Color.color(Math.random(), Math.random(), Math.random()));
            randomTangles[i].setOpacity(Math.random());

        }

        return randomTangles;

    }

}
