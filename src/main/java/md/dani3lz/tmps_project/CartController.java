package md.dani3lz.tmps_project;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import md.dani3lz.tmps_project.Assets.Component;

import java.net.URL;
import java.util.ResourceBundle;

public class CartController implements Initializable {

    @FXML
    private ImageView cartImg;

    @FXML
    private Label cartName;

    @FXML
    private Label cartPrice;
    @FXML
    private Spinner<Integer> cartNumber;
    SpinnerValueFactory<Integer> spinnerValueFactory;

    Component component;

    public void setData(Component component){
        this.component = component;
        cartName.setText(component.getName());
        cartPrice.setText(component.getPrice() + " MDL");
        Image image = new Image(getClass().getResourceAsStream(component.getImgSrc()));
        cartImg.setImage(image);
        spinnerValueFactory.setValue(component.getNrInCart());
        cartNumber.setValueFactory(spinnerValueFactory);
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        spinnerValueFactory = new SpinnerValueFactory.IntegerSpinnerValueFactory(1,100);
        spinnerValueFactory.setValue(1);
        cartNumber.setValueFactory(spinnerValueFactory);
    }
}
