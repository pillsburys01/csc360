import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;



public class ModernArtV2 extends Application{

    private static final int PANE_PREF_WIDTH = 800;
    private static final int PANE_PREF_HEIGHT = 600;
    private static final int INITIAL_OBJECT_COUNT = 50;
    private static final int INITIAL_OBJECT_SIZE = 100;
    private static final String INITIAL_SHAPE = "Circle";

    public static void main(String[] args){
        Application.launch(args);
    }

    @Override
    public void start(Stage stage){

        BorderPane root = new BorderPane();

        bottomBox bBox = new bottomBox();

        Pane bottomPane = new Pane(bBox);

        root.setBottom(bottomPane);

        artPane initialArtPane = new artPane();
        root.setCenter(initialArtPane);

        root.setPrefSize(PANE_PREF_WIDTH, PANE_PREF_HEIGHT);

        Scene scene = new Scene(root);

        stage.setScene(scene);

        stage.setTitle("Modern Art (V2)");

        stage.show();

        EventHandler<MouseEvent> drawHandler = new EventHandler<MouseEvent>() {

            @Override
            public void handle(MouseEvent e) {
                System.out.println("Button clicked");


            }
        };

    }

    EventHandler<MouseEvent> drawHandler = new EventHandler<MouseEvent>(){

       @Override
       public void handle(MouseEvent e){
           System.out.println("Button clicked");


       }
    };

    public class bottomBox extends HBox{

       bottomBox() {
           ObservableList<String> shapes = FXCollections.observableArrayList(

                   "Circle",
                   "Rectangle"
           );

           ComboBox shapeSelect = new ComboBox(shapes);

           shapeSelect.setValue(INITIAL_SHAPE);

           Label objectLabel = new Label("Object Count: ");

           TextField objectField = new TextField();
           objectField.setText(Integer.toString(INITIAL_OBJECT_COUNT));

           Label sizeLabel = new Label("Max Size: ");

           TextField sizeField = new TextField(Integer.toString(INITIAL_OBJECT_SIZE));

           Button drawButton = new Button("Draw");

           drawButton.addEventFilter(MouseEvent.MOUSE_CLICKED, drawHandler);

           this.getChildren().addAll(shapeSelect, objectLabel, objectField, sizeLabel, sizeField, drawButton);

           this.setPadding(new Insets(10, 15, 10, 15));

           this.setSpacing(15);

       }

    }

    public class artPane extends StackPane {

        artPane() {

              this(INITIAL_SHAPE, INITIAL_OBJECT_COUNT,INITIAL_OBJECT_SIZE,PANE_PREF_WIDTH,(PANE_PREF_HEIGHT-200));

        }

        artPane(String shapeName, int objectCount, double maxSize, int paneWidth, int paneHeight) {

            Group group = new Group();

            if (shapeName.equals("Circle")) {

                Circle[] circles = RandomCircles(objectCount, maxSize, paneWidth, paneHeight);

                for (Circle c : circles){
                    group.getChildren().add(c);
                }
            }


            else if (shapeName.equals("Rectangle")) {

                Rectangle[] rectangles = RandomRectangles(objectCount, maxSize, paneWidth, paneHeight);

                for (Rectangle r : rectangles) {
                    group.getChildren().add(r);
                }

            }

            else {}

            this.getChildren().add(group);



        }


    }

    private  Rectangle[] RandomRectangles(int rectangleCount, double rectangleMaxSize, int paneWidth, int paneHeight){

        Rectangle[] randomTangles = new Rectangle[rectangleCount];
        for(int i = 0; i < rectangleCount; i++){

            int width = (int) (Math.random() * rectangleMaxSize) ;
            int height = (int) (Math.random() * rectangleMaxSize);
            int x = (int) (Math.random() * paneWidth) - (width / 2);
            int y = (int) (Math.random() * paneHeight) - (height / 2);

            randomTangles[i] = new Rectangle(x, y, width, height);
            randomTangles[i].setFill(Color.color(Math.random(), Math.random(), Math.random()));
            randomTangles[i].setOpacity(Math.random());

        }

        return randomTangles;

    }

    private Circle[] RandomCircles(int circleCount, double circleMaxSize, int paneWidth, int paneHeight){

       double maxRadius = circleMaxSize / 2;

       Circle[] randomCircs = new Circle[circleCount];

       for(int i = 0; i < circleCount; i++) {

           int radius = (int) (Math.random() * maxRadius) ;
           int x = (int) (Math.random() * paneWidth) - radius;
           int y = (int) (Math.random() * paneHeight) - radius;

           randomCircs[i] = new Circle(x, y, radius);
           randomCircs[i].setFill(Color.color(Math.random(), Math.random(), Math.random()));
           randomCircs[i].setOpacity(Math.random());
       }

       return randomCircs;
    }


}
