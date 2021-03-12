package com.luxgrey.tomokidb_app;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class JFXApplication extends Application {
  private static final String PATH_TO_FXML = "/fxml/";
  private static Scene scene;

  @Override
  public void start(Stage stage) throws IOException {
    scene = new Scene(loadFXML("Start"), 640, 480);
    stage.setScene(scene);
    stage.show();
  }

  public static void setRoot(String fxml) throws IOException {
    scene.setRoot(loadFXML(fxml));
  }

  private static Parent loadFXML(String fxml) throws IOException {
    FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource(PATH_TO_FXML + fxml + ".fxml"));
    return fxmlLoader.load();
  }

  /**
   * Do not run program with this main-function as entry point, but use the one
   * contained in the Main class instead.
   */
  public static void main(String[] args) {
    launch();
  }
}
