/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hsansteuerung_ui.Home;

import eu.hansolo.medusa.Gauge;
import hsansteuerung_ui.HSAnsteuerung_UI;
import hsansteuerung_ui.ServerDetails.DetailsCanvasController;
import java.io.BufferedReader;
import javafx.event.ActionEvent;
import java.io.IOException;
import java.io.InputStreamReader;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

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
    private Gauge gauge1Voltage;

    @FXML
    private Gauge gauge1Amp;

    @FXML
    private Gauge gauge2Voltage;

    @FXML
    private Gauge gauge2Amp;

    @FXML
    private Gauge gauge3Voltage;

    @FXML
    private Gauge gauge3Amp;
    
    @FXML
    private CheckBox connection_status;
    
    
    @FXML
    void openDetailView(ActionEvent event) throws IOException {
        
 
            FXMLLoader loader = new FXMLLoader(HSAnsteuerung_UI.class.getResource("ServerDetails/DetailsCanvas.fxml"));
            Parent rootParent = (Parent) loader.load();
            Stage stage = new Stage();
            stage.setTitle("Mqtt Broker Info");
            stage.setScene(new Scene(rootParent));
            stage.show();
       

    }
    
    private void setGaugeValue(Gauge gauge, double value){
        gauge.setValue(value);
    }
    
    
    //This method is called to make changes to the gui 
    //to indicate all the connection is in order and running perfectly.
    //More advance indication can be added to this method.
    //For this early development phase no editing is done in GUI thus, 
    //The implementation of this method is not required bt in future this 
    //Method can be futher be used to enable editing for Broker properties.
    private void connectionStatus(boolean isConnected){
        if(isConnected){
            
        }
        connection_status.setSelected(isConnected);
    }
     
    
    /**
     * initialises the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
     
        
        connectionStatus(true);
        startBroker();
    }    
    
    
    private void startBroker(){
        StringBuffer output = new StringBuffer();
        
        Process process;
        
        try {
            process = Runtime.getRuntime().exec("mosquitto -v");
            process.waitFor();
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            
            String line = "";
            while ((line = reader.readLine())!= null){
                output.append(line + "\n");
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        System.out.println(output);
    }    
}
