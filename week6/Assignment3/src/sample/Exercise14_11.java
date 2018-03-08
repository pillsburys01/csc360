/*
Stephen Pillsbury
CSC 360 Assignment 3 Problem 1

In this program we create and position the features of a rudimentary smiley face
with JavaFX objects.

 */

package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.stage.Stage;

public class Exercise14_11 extends Application {

    @Override
    public void start(Stage primaryStage) {

        Circle circle = new Circle();
        circle.setCenterX(200);
        circle.setCenterY(200);
        circle.setRadius(160);
        circle.setStroke(Color.BLACK);
        circle.setFill(Color.WHITE);

        Polygon nose = new Polygon();
        nose.setStroke(Color.BLACK);
        nose.setFill(Color.WHITE);
        nose.getPoints().addAll(new Double[]{175.0, 225.0, 200.0, 175.0, 225.0, 225.0, 175.0, 225.0 });

        Arc mouth = new Arc();
        mouth.setCenterX(200.0);
        mouth.setCenterY(250.0);
        mouth.setRadiusX(40.0);
        mouth.setRadiusY(40.0);
        mouth.setStartAngle(180.0);
        mouth.setLength(180.0);
        mouth.setType(ArcType.OPEN);
        mouth.setStroke(Color.BLACK);
        mouth.setFill(Color.WHITE);

        //eyes should center at 160, 150 and 240, 150

        Circle lPupil = new Circle();
        lPupil.setCenterX(160.0);
        lPupil.setCenterY(150.0);
        lPupil.setRadius(13.0);
        lPupil.setFill(Color.BLACK);

        Circle rPupil = new Circle();
        rPupil.setCenterX(240.0);
        rPupil.setCenterY(150.0);
        rPupil.setRadius(13.0);
        rPupil.setFill(Color.BLACK);

        Ellipse lEye = new Ellipse(160.0, 150.0, 20, 15);
        lEye.setStroke(Color.BLACK);
        lEye.setFill(Color.WHITE);

        Ellipse rEye = new Ellipse(240.0, 150.0, 20, 15);
        rEye.setStroke(Color.BLACK);
        rEye.setFill(Color.WHITE);


        Pane pane = new Pane();
        pane.getChildren().add(circle);
        pane.getChildren().add(nose);
        pane.getChildren().add(mouth);
        pane.getChildren().add(lEye);
        pane.getChildren().add(rEye);
        pane.getChildren().add(lPupil);
        pane.getChildren().add(rPupil);

        Scene scene = new Scene(pane, 400, 400);
        primaryStage.setTitle("Exercise14_11");
        primaryStage.setScene(scene);
        primaryStage.show();

            }



    }







