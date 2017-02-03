/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hsansteuerung_ui.Home;

import eu.hansolo.medusa.Clock;
import java.awt.Button;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author sdarwin
 */
public class HomeCanvasController implements Initializable {

     @FXML
    private AnchorPane Home_page;

    @FXML
    private Button info_btn;

    @FXML
    private Clock lcd1Voltage;

    @FXML
    private Clock lcd1Amp;

    @FXML
    private Clock lcd2Voltage;

    @FXML
    private Clock lcd2Amp;

    @FXML
    private Clock lcd3Voltage;

    @FXML
    private Clock lcd3Amp;
    
    /**
     * initialises the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    
    }    
    
}
