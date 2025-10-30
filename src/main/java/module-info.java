module co.edu.uniquindio.proyectofinalp2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens co.edu.uniquindio.proyectofinalp2 to javafx.fxml;
    exports co.edu.uniquindio.proyectofinalp2;
    exports co.edu.uniquindio.proyectofinalp2.controller;
    opens co.edu.uniquindio.proyectofinalp2.controller to javafx.fxml;
}