/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ni.edu.uni.fcys.programacion2.conversionfx.controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Sistemas-05
 */
public class TemperatureFXMLController implements Initializable {
    //botones
    @FXML
    public Button btnCompute; 
    @FXML
    public Button btnClean;
    
    //text fields
    @FXML
    public TextField txtCelcius;
    @FXML 
    public TextField txtFah;
    @FXML
    public TextField txtResult;
    
    //rbtn
    @FXML
    public RadioButton rbtnCelcius;
    @FXML
    public RadioButton rbtnFah;
    
    //actions
    @FXML
    public void btnComputeAction(){
        float c, f=0;
        if(rbtnCelcius.isSelected()){
            c =Float.parseFloat(txtCelcius.getText());
            f =  ((float)9/5)*c + 32;
            
        }
        else if(rbtnFah.isSelected()){
            c = Float.parseFloat(txtFah.getText());
            f = (c-32)*((float)5/9);
            
        }
        else {
//            JOptionPane.showMessageDialog(null,"Selecciona un radio button");
//            return;
        }
        txtResult.setText(String.valueOf(f));
    }
    @FXML
    public void btnCleanAction(){
        
    }
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
