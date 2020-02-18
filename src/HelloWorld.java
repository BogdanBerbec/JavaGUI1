import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HelloWorld extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        VBox nodParinte = new VBox();
        nodParinte.setSpacing(30);

        TextField textField1 = new TextField();
        Button button1 = new Button("Apasa");
        Label label = new Label("");
        button1.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                /*System.out.println("Salut");*/
                String input = textField1.getText();
                label.setText("Ai introdus ->" + input.length());
                /*label.setText(textField1.getText());*/
            }
        });
        nodParinte.getChildren().addAll(textField1, button1, label);



        /*HBox hBox2 = new HBox();
        hBox2.setSpacing(30);
        hBox2.getChildren().add(new Label("Username"));
        hBox2.getChildren().add(new TextField());
        HBox hBox3 = new HBox();
        hBox3.setSpacing(30);
        hBox3.getChildren().add(new Label ("Password"));
        hBox3.getChildren().add(new TextField());


        nodParinte.getChildren().addAll(hBox2, hBox3, new Button("Login"));*/
        Scene scene = new Scene(nodParinte);
        primaryStage.setScene(scene);
        primaryStage.setHeight(600);
        primaryStage.setWidth(600);

        primaryStage.show();




        /*VBox nodParinte = new VBox();
        nodParinte.setSpacing(20);
        Button button1 = new Button("b1");
        Button button2 = new Button("b1");
        Button button3 = new Button("asddsds");
        nodParinte.getChildren().add(button1);
        nodParinte.getChildren().add(button2);
        nodParinte.getChildren().add(button3);
        Label label = new Label("ana are mere");
        nodParinte.getChildren().add(label);
        TextField textField = new TextField();
        nodParinte.getChildren().add(textField);
        Scene scene = new Scene(nodParinte);
        primaryStage.setScene(scene);
        primaryStage.setWidth(600);
        primaryStage.setHeight(600);

        primaryStage.show();*/





        /*        primaryStage.setTitle("Prima mea aplicatie");
        primaryStage.setWidth(600);
        primaryStage.setHeight(600);

        Group group = new Group();
        Button button1 = new Button("APASA1");
        button1.setLayoutX(0);
        button1.setLayoutY(0);
        Button button2 = new Button("APASA2");
        button2.setLayoutX(530);
        button2.setLayoutY(0);
        Button button3 = new Button("APASA3");
        button3.setLayoutX(0);
        button3.setLayoutY(530);
        Button button4 = new Button("APASA4");
        button4.setLayoutX(530);
        button4.setLayoutY(530);

        group.getChildren().add(button1);
        group.getChildren().add(button2);
        group.getChildren().add(button3);
        group.getChildren().add(button4);

        Scene scene = new Scene(group);

        primaryStage.setScene(scene);
        primaryStage.show();*/
    }
}
