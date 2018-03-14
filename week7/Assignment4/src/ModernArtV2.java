import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class ModernArtV2 extends Application{

    public static void main(String[] args){
        Application.launch(args);
    }

    @Override
    public void start(Stage stage){

        Text centerText = new Text("Center");

        Text bottomText = new Text("Bottom");

        ObservableList<String> shapes = FXCollections.observableArrayList(

                "Circle",
                    "Rectangle"
        );

        ComboBox shapeSelect = new ComboBox(shapes);

        shapeSelect.setValue("Circle");


        HBox hbox = new HBox();

        hbox.getChildren().add(bottomText);

        hbox.getChildren().add(shapeSelect);

        BorderPane root = new BorderPane(centerText,null,null,hbox,null);

        BorderPane.setAlignment(bottomText,Pos.BOTTOM_CENTER);

        root.setPrefSize(400, 400);

        Scene scene = new Scene(root);

        stage.setScene(scene);

        stage.setTitle("Modern Art (V2)");

        stage.show();

    }



}
