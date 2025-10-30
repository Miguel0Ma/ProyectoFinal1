package co.edu.uniquindio.proyectofinalp2.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;

public class LoginController {

    @FXML private VBox panelSeleccion;
    @FXML private VBox panelLogin;
    @FXML private Label labelIconoLogin;
    @FXML private Label labelTipoUsuario;
    @FXML private TextField txtEmail;
    @FXML private PasswordField txtPassword;
    @FXML private HBox contenedorRegistro;

    private String tipoUsuarioSeleccionado;

    @FXML
    public void initialize() {
        // Inicialización si es necesaria
    }

    @FXML
    private void seleccionarCliente() {
        mostrarPanelLogin("Cliente", "👤");
        contenedorRegistro.setVisible(true);
        contenedorRegistro.setManaged(true);
    }

    @FXML
    private void seleccionarRepartidor() {
        mostrarPanelLogin("Repartidor", "🚚");
        contenedorRegistro.setVisible(false);
        contenedorRegistro.setManaged(false);
    }

    @FXML
    private void seleccionarAdministrador() {
        mostrarPanelLogin("Administrador", "🛡️");
        contenedorRegistro.setVisible(false);
        contenedorRegistro.setManaged(false);
    }

    private void mostrarPanelLogin(String tipoUsuario, String icono) {
        tipoUsuarioSeleccionado = tipoUsuario;
        labelTipoUsuario.setText(tipoUsuario);
        labelIconoLogin.setText(icono);

        // Ocultar panel de selección
        panelSeleccion.setVisible(false);
        panelSeleccion.setManaged(false);

        // Mostrar panel de login
        panelLogin.setVisible(true);
        panelLogin.setManaged(true);

        // Limpiar campos
        txtEmail.clear();
        txtPassword.clear();
    }

    @FXML
    private void volverSeleccion() {
        // Mostrar panel de selección
        panelSeleccion.setVisible(true);
        panelSeleccion.setManaged(true);

        // Ocultar panel de login
        panelLogin.setVisible(false);
        panelLogin.setManaged(false);

        // Limpiar campos
        txtEmail.clear();
        txtPassword.clear();
        tipoUsuarioSeleccionado = null;
    }

    @FXML
    private void iniciarSesion() {
        String email = txtEmail.getText().trim();
        String password = txtPassword.getText().trim();

        // Validaciones básicas
        if (email.isEmpty() || password.isEmpty()) {
            mostrarAlerta(Alert.AlertType.WARNING,
                    "Campos vacíos",
                    "Por favor completa todos los campos");
            return;
        }

        if (!validarEmail(email)) {
            mostrarAlerta(Alert.AlertType.WARNING,
                    "Email inválido",
                    "Por favor ingresa un correo electrónico válido");
            return;
        }

        // TODO: Aquí debes implementar la lógica de autenticación real
        // Por ahora, solo simulamos el login
        System.out.println("Iniciando sesión como: " + tipoUsuarioSeleccionado);
        System.out.println("Email: " + email);

        // Simulación de login exitoso
        mostrarAlerta(Alert.AlertType.INFORMATION,
                "Login exitoso",
                "Bienvenido " + tipoUsuarioSeleccionado + ": " + email);

        // TODO: Aquí debes redirigir a la pantalla correspondiente según el tipo de usuario
        // if (tipoUsuarioSeleccionado.equals("Cliente")) {
        //     cargarPantallaCliente();
        // } else if (tipoUsuarioSeleccionado.equals("Repartidor")) {
        //     cargarPantallaRepartidor();
        // } else if (tipoUsuarioSeleccionado.equals("Administrador")) {
        //     cargarPantallaAdministrador();
        // }
    }

    @FXML
    private void olvidarPassword() {
        mostrarAlerta(Alert.AlertType.INFORMATION,
                "Recuperar contraseña",
                "Se enviará un enlace de recuperación a tu correo electrónico");
    }

    @FXML
    private void mostrarRegistro() {
        mostrarAlerta(Alert.AlertType.INFORMATION,
                "Registro",
                "Pantalla de registro en construcción");
        // TODO: Implementar navegación a pantalla de registro
    }

    private boolean validarEmail(String email) {
        // Validación simple de email
        return email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$");
    }

    private void mostrarAlerta(Alert.AlertType tipo, String titulo, String mensaje) {
        Alert alert = new Alert(tipo);
        alert.setTitle(titulo);
        alert.setHeaderText(null);
        alert.setContentText(mensaje);
        alert.showAndWait();
    }

    // Getters para uso externo si es necesario
    public String getTipoUsuarioSeleccionado() {
        return tipoUsuarioSeleccionado;
    }
}