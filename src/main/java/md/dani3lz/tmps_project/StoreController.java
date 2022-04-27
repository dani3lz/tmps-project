package md.dani3lz.tmps_project;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;
import md.dani3lz.tmps_project.Model.Component;
import md.dani3lz.tmps_project.Model.MyListener;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class StoreController implements Initializable {
    @FXML
    private ImageView componentImg;

    @FXML
    private Label componentName;

    @FXML
    private Label componentPrice;

    @FXML
    private GridPane grid;
    @FXML
    private VBox pickComponentCard;

    //-------------------------------------------
    @FXML
    private Button componentSubmit;

    //-------------------------------------------

    @FXML
    private Button allBtn;

    @FXML
    private Button cpuBtn;

    @FXML
    private Button gpuBtn;

    @FXML
    private Button headphoneBtn;

    @FXML
    private Button keyboardBtn;

    @FXML
    private Button mouseBtn;

    @FXML
    private Button ramBtn;

    @FXML
    private Button speakerBtn;
    //-------------------------------------------

    private List<Component> components = new ArrayList<>();
    private MyListener myListener;

    private List<Component> getData(){
        List<Component> listComponents = new ArrayList<>();
        Component component;

        for(int i = 0; i < 5; i++){
            component = new Component();
            component.setName("NVIDIA GTX 1050TI");
            component.setPrice(4500);
            component.setImgSrc("img/nvidia/msi-geforce-gtx-1050-ti-gaming-4g.png");
            component.setColor("2a2a2b");
            listComponents.add(component);
        }

        component = new Component();
        component.setName("AMD Radeon RX5700XT");
        component.setPrice(25500);
        component.setImgSrc("img/amd/gpu/237107-rx5700xt-gpu-gallery2-1260x709.png");
        component.setColor("450303");
        listComponents.add(component);


        return listComponents;
    }

    private void setCard(Component component){
        componentName.setText(component.getName());
        componentPrice.setText(component.getPrice() + " MDL");
        Image image = new Image(getClass().getResourceAsStream(component.getImgSrc()));
        componentImg.setImage(image);
        pickComponentCard.setStyle( "-fx-background-color: #"+component.getColor()+";\n" +
                                    "    -fx-background-radius: 30;");
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        components.addAll(getData());
        if(components.size() > 0){
            setCard(components.get(0));
            myListener = new MyListener() {
                @Override
                public void onClickListener(Component component) {
                    setCard(component);
                }
            };
        }
        int column = 0;
        int row = 1;
        try {
            for (int i = 0; i < components.size(); i++) {
                FXMLLoader fxmlLoader = new FXMLLoader();
                fxmlLoader.setLocation(getClass().getResource("component.fxml"));
                AnchorPane anchorPane = fxmlLoader.load();

                ComponentController componentController = fxmlLoader.getController();
                componentController.setData(components.get(i), myListener);

                if (column == 3){
                    column = 0;
                    row++;
                }

                grid.add(anchorPane, column++, row);

                grid.setMinWidth(Region.USE_COMPUTED_SIZE);
                grid.setPrefWidth(Region.USE_COMPUTED_SIZE);
                grid.setMaxWidth(Region.USE_PREF_SIZE);

                grid.setMinHeight(Region.USE_COMPUTED_SIZE);
                grid.setPrefHeight(Region.USE_COMPUTED_SIZE);
                grid.setMinHeight(Region.USE_PREF_SIZE);

                GridPane.setMargin(anchorPane, new Insets(10));


            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}