package ir.ac.kntu;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.StrokeType;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane root = new Pane();
        Scene scene = new Scene(root, 800, 800);

        drawMap(root,Map.readMap());

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void drawMap(Pane root, char[][] colors) {
        for (int i = 0; i < 800; i += 40) {
            for (int j = 0; j < 800; j += 40) {
                Rectangle rectangle = new Rectangle(i, j, 40, 40);
                setColor(rectangle, colors, i, j);
                rectangle.setStroke(Color.BLACK);
                root.getChildren().add(rectangle);
            }
        }
    }

    private void setColor(Rectangle rectangle, char[][] colors, int i, int j) {
        char color = colors[i / 40][j / 40];
        switch (color) {
            case 'r':
                rectangle.setFill(Color.RED);
                break;
            case 'g':
                rectangle.setFill(Color.GREEN);
                break;
            case 'b':
                rectangle.setFill(Color.BLUE);
                break;
            case 'y':
                rectangle.setFill(Color.YELLOW);
                break;
            default:
                rectangle.setFill(Color.BLACK);
        }
    }

    public static void main(String[] args) {
        Map.printMap();
    }
}
