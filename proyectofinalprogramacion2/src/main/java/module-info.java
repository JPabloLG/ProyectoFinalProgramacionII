module co.edu.uniquindio.proyectofinalp2 {
    requires javafx.controls;
    requires javafx.fxml;

    opens co.edu.uniquindio to javafx.fxml;
    exports co.edu.uniquindio;

    opens co.edu.uniquindio.model;
    exports co.edu.uniquindio.model;
}
