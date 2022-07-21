module abno.abnochess {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.ikonli.javafx;

    opens abno to javafx.fxml;
    exports abno;
    exports abno.gui;
    opens abno.gui to javafx.fxml;
}