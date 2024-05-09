package poo2.login.controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import poo2.login.model.Fachada;
import poo2.login.util.Utilidades;

public class HomeController implements Initializable {
	
	private Fachada fachada;
	
	@FXML
	private Text welcomeText; 
	
	
	/**
	 * Importante tener presente que los objetos de la GUI
	 * deben inicializarse sobreescribiendo el método initialize
	 * de la interfaz Initializable.
	 */
	public HomeController() {
		fachada = Fachada.getInstance();
	}

	/**
	 * Este metodo se encarga de enviar a la ventana de inicio de sesión.
	 * Se usa en la vista welcome.fxml.
	 * @param event
	 */
	@FXML
	protected void handleIniciarButtonAction(ActionEvent event) {
		
		Stage stage = Utilidades.obtenerStage(event);
		stage.close();
		
		try {

			FXMLLoader loader = new FXMLLoader(getClass().getResource("/poo2/login/views/LoginView.fxml"));
			Pane root = loader.load();			
			
			Scene scene = new Scene(root);
		    stage.setScene(scene);
		    
		    stage.show();		    		    

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		welcomeText.setText(fachada.getWelcomeText());
		
	}
	
}
