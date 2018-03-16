import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;


public class ModernArtV2 extends Application{

    private static final int PANE_PREF_WIDTH = 1000;
    private static final int PANE_PREF_HEIGHT = 1000;
    private static final String INITIAL_SHAPE = "Rectangle";

    public static void main(String[] args){
        Application.launch(args);
    }

    @Override
    public void start(Stage stage){

        artShapes initialShapes= new artShapes();

        Pane centerPane = new Pane(initialShapes);

        bottomBox bBox = new bottomBox();

        Pane bottomPane = new Pane(bBox);

        BorderPane root = new BorderPane(centerPane,null,null,bottomPane,null);

        root.setPrefSize(1000, 1000);

        Scene scene = new Scene(root);

        stage.setScene(scene);

        stage.setTitle("Modern Art (V2)");

        stage.show();

    }

    public class bottomBox extends HBox{

       bottomBox() {
           ObservableList<String> shapes = FXCollections.observableArrayList(

                   "Circle",
                   "Rectangle"
           );

           ComboBox shapeSelect = new ComboBox(shapes);

           shapeSelect.setValue(INITIAL_SHAPE);

           Label objectLabel = new Label("Object Count: ");

           TextField objectField = new TextField("50");

           Label sizeLabel = new Label("Max Size: ");

           TextField sizeField = new TextField("100");

           this.getChildren().addAll(shapeSelect, objectLabel, objectField, sizeLabel, sizeField);

           this.setPadding(new Insets(10, 15, 10, 15));

           this.setSpacing(15);

       }

    }

    public class artShapes extends Group {

        artShapes(){

            new artShapes(50,100, INITIAL_SHAPE, PANE_PREF_WIDTH, PANE_PREF_HEIGHT);

        }

        artShapes(int objectCount, int maxSize, String shapeName, int paneWidth, int paneHeight){

            if(shapeName.equals("Circle")){}
            
            else if(shapeName.equals("Rectangle")){

                Rectangle[] rectangles = RandomRectangles(objectCount, maxSize, paneWidth, paneHeight);

                for(Rectangle r : rectangles){
                    this.getChildren().add(r);
                }

            }
            
            else{}


        }



    }
    private Rectangle[] RandomRectangles(int rectangleCount, double rectangleMaxSize, int paneWidth, int paneHeight){

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


}
