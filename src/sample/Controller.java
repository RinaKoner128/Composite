package sample;

import javafx.event.ActionEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import sample.Metods.Component;
import sample.Metods.Composite;
import sample.Metods.Element;

public class Controller {
public double x;
public double y;
    public Pane pane;
    public Component component;

    public void ClFin(ActionEvent actionEvent) {
        pane.getChildren().clear();
    }

    public void ClSt(ActionEvent actionEvent) {
        pane.getChildren().clear();
        pane.getChildren().clear();
        component = new Element();
    }

    public void ClTr(ActionEvent actionEvent) {
        pane.getChildren().clear();
    }

    public void Clean(ActionEvent actionEvent) {
        pane.getChildren().clear();
    }

    public void onClick(MouseEvent mouseEvent) {
       x = mouseEvent.getX();
       y = mouseEvent.getY();
       component.draw(pane,x,y);
    }
}
