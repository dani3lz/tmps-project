module md.dani3lz.tmps_project {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;
    requires java.json;

    exports md.dani3lz.tmps_project;
    opens md.dani3lz.tmps_project to javafx.fxml;
    exports md.dani3lz.tmps_project.Assets;
    opens md.dani3lz.tmps_project.Assets to javafx.fxml;
    exports md.dani3lz.tmps_project.Assets.Options;
    opens md.dani3lz.tmps_project.Assets.Options to javafx.fxml;
}