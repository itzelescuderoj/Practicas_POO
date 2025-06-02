module mx.edu.utez.u2_ti_01_figuras {
    requires javafx.controls;
    requires javafx.fxml;


    opens mx.edu.utez.u2_ti_01_figuras to javafx.fxml;
    exports mx.edu.utez.u2_ti_01_figuras;
}