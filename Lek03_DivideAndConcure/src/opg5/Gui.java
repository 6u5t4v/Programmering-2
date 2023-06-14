package opg5;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Gui extends Application {

    @Override
    public void start(Stage stage) {
        GridPane root = this.initContent();
        Scene scene = new Scene(root);

        stage.setTitle("Sierpinski Triangle");
        stage.setScene(scene);
        stage.show();
    }

    // -------------------------------------------------------------------------
    private GridPane initContent() {
        GridPane pane = new GridPane();
        Canvas canvas = new Canvas(400, 400);
        pane.add(canvas, 0, 0);
        drawShapes(canvas.getGraphicsContext2D());
        return pane;
    }

    private void drawShapes(GraphicsContext gc) {
//        int orden = 3;

//        gc.strokeLine(200, 25, 25, 350);
//        gc.strokeLine(25, 350, 375, 350);
//        gc.strokeLine(375, 350, 200, 25);
//

//        double x1 = 200, y1 = 25;
//        double x2 = 25, y2 = 350;
//        double x3 = 375, y3 = 350;

        double[] indices = {
                200, 25,
                25, 350,
                375, 350
        };

        drawSierpinskiTriangle(gc, 3);
    }

    private void drawSierpinskiTriangle(GraphicsContext gc, int orden) {

    }

    private void drawTriangle(GraphicsContext gc,
                              double x1, double y1,
                              double x2, double y2,
                              double x3, double y3,
                              int orden) {
        if (orden < 0) return;

        gc.strokeLine(x1 / 2, y1 / 2, x2 , y2);
        gc.strokeLine(x2, y2, x3, y3);
        gc.strokeLine(x3, y3, x1, y1);
    }
}
