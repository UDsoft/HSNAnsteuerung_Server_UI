/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hsansteuerung_ui.ServerDetails;

import hsansteuerung_ui.HSAnsteuerung_UI;
import java.io.IOException;
import javafx.event.ActionEvent;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author sdarwin
 */
public class DetailsCanvasController implements Initializable {

    @FXML
    private AnchorPane details_pane;

    @FXML
    private Label ipaddress_label;

    @FXML
    private Label port_label;

    @FXML
    private Button ok_btn;

    @FXML
    void closeDetailView(ActionEvent event) throws IOException {
   
            //FXMLLoader loader = new FXMLLoader(HSAnsteuerung_UI.class.getResource("Home/HomeCanvas.fxml"));
            //Parent rootParent = (Parent) loader.load();
            //Stage stage = new Stage();
            //stage.setTitle("Mqtt Broker Info");
            //stage.setScene(new Scene(rootParent));
            //stage.show();
            Stage stage = (Stage) ok_btn.getScene().getWindow();
            stage.close();
    
    }
    /**
     * initialises the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
     
        
    }

    
    
}
