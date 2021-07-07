package sample.Metods;

import javafx.scene.Node;
import javafx.scene.layout.Pane;

import java.util.ArrayList;

public class Composite extends Component {

    ArrayList<Component> array = new ArrayList<>();

    public Composite(ArrayList<Component> array) {// может быть реализован и с другим набором параметров
        this.array = array;
    }

    @Override
    public void add(Component component) throws ComponentException {
        array.add(component);
    }

    @Override
    public void remove(Component component) throws ComponentException {

    }

    @Override
    public Component getChild(int index) throws ComponentException {
        return array.get(index);
    }

    @Override
    public void draw(Pane pane, double x, double y) {
        if (array.isEmpty()) return;
        for (Component comp : array) comp.draw(pane, x, y);
    }

    @Override
    public Node getPicture() {
        return null;
    }

    @Override
    public void setX(double x) {
        if (array.isEmpty()) return;
        for (Component comp : array) comp.setX(x);
    }

    @Override
    public void setY(double y) {

    }

    @Override
    public void setW(double w) {

    }

    @Override
    public void setH(double h) {

    }
}