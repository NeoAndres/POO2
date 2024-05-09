package poo2.login.views;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class MainArquitecturaTrabajo extends Application {
	
	public static void main(String[] args) {
        Application.launch(MainArquitecturaTrabajo.class, args);
    }
    
    @Override
    public void start(Stage stage) throws Exception {
        
    	FXMLLoader loader = new FXMLLoader(getClass().getResource("HomeView.fxml"));
    	
        stage.setTitle("Bienvenido");
        stage.setScene(new Scene(loader.load(), 300, 110));
        stage.show();
    }
}
