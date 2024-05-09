package poo2.login.controllers;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import poo2.login.model.Fachada;
import poo2.login.util.DataTransfer;
import poo2.login.util.Utilidades;

public class LoginController {

    private Fachada fachada;

    @FXML
    private TextField userField;
    @FXML
    private TextField passwordField;
    @FXML
    private TextField hourField;
    @FXML
    private Text mensajeText;

    public LoginController() {
        fachada = Fachada.getInstance();
    }

    @FXML
    protected void handleStartButtonAction(ActionEvent event) {
        try {
            String nombreCompleto = fachada.validarCredenciales(userField.getText(), passwordField.getText());

            String tiempo = hourField.getText();
            String[] partes = tiempo.split(":");
            int hora = Integer.parseInt(partes[0]);
            int minuto = Integer.parseInt(partes[1]);

            boolean esValido = fachada.validarHora(hora, minuto);

            // Verificar si la hora ingresada es válida
            if (esValido) {
                Stage stage = Utilidades.obtenerStage(event);
                stage.close();

                try {
                    DataTransfer d = DataTransfer.getInstance();
                    d.setNombreCompleto(nombreCompleto);
                    d.setHora(hora);
                    d.setMinuto(minuto);

                    FXMLLoader loader = new FXMLLoader(getClass().getResource("/poo2/login/views/WelcomeScreenView.fxml"));
                    Pane root = loader.load();

                    // Actualizar el campo hourField
                    hourField.setText(d.getHora() + ":" + d.getMinuto());

                    Scene scene = new Scene(root);
                    stage.setScene(scene);

                    stage.show();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else {
                // Mostrar mensaje si la hora ingresada no es válida
                mensajeText.setText("La hora ingresada no coincide con la hora actual");
            }
        } catch (Exception e) {
            mensajeText.setText(e.getMessage());
        }
    }

    @FXML
    protected void handleCleanButtonAction(ActionEvent event) {
        userField.setText("");
        passwordField.setText("");
        mensajeText.setText("");
        hourField.setText("");
    }
}
