package md.dani3lz.tmps_project;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import md.dani3lz.tmps_project.Assets.Component;
import md.dani3lz.tmps_project.Assets.MyListener;

public class ComponentController {

    @FXML
    private ImageView img;

    @FXML
    private Label nameLabel;

    @FXML
    private Label priceLabel;
    private Component component;
    private MyListener myListener;

    public void setData(Component component, MyListener myListener){
        this.myListener = myListener;
        this.component = component;
        nameLabel.setText(component.getName());
        priceLabel.setText(component.getPrice() + " MDL");
        Image image = new Image(getClass().getResourceAsStream(component.getImgSrc()));
        img.setImage(image);


    }

    public void click(javafx.scene.input.MouseEvent mouseEvent) {
        myListener.onClickListener(component);
    }
}
