module co.uniquindio.practicapatrones {
    requires javafx.controls;
    requires javafx.fxml;

    opens co.uniquindio.practicapatrones to javafx.fxml;
    exports co.uniquindio.practicapatrones;
}
