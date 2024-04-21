package co.uniquindio.practicapatrones;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

import co.uniquindio.practicapatrones.Model.Cliente;
import co.uniquindio.practicapatrones.Model.Producto;
import co.uniquindio.practicapatrones.Model.ProductoBase;
import co.uniquindio.practicapatrones.Model.ProductoDecorator;
import co.uniquindio.practicapatrones.Model.Tienda;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("primary"), 640, 480);
        stage.setScene(scene);
        stage.show();
    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        Cliente cliente = new Cliente("Juan", "Armenia");

        Producto productobase = new ProductoBase("Guitarra", 180000, 4);
        Producto paquete1 = new ProductoDecorator("Estcuche Guitarra", 70000, 0.5, productobase);
        Producto paquete2 = new ProductoDecorator("Afinador", 40000, 0.1, paquete1);

        cliente.setPaquete(paquete2);

        Tienda tienda = new Tienda();
        
        System.out.println(tienda.generarRecibo(cliente));

    }

}