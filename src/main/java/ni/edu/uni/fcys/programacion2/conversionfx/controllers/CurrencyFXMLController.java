/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ni.edu.uni.fcys.programacion2.conversionfx.controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Sistemas-05
 */
public class CurrencyFXMLController implements Initializable {
    @FXML
    public ComboBox cmbFrom;
    @FXML
    public ComboBox cmbTo;
    @FXML
    public TextField txtFrom;
    @FXML
    public TextField txtResult;
    @FXML
    public Button btnCompute;
    private ObservableList<String> items;
    @FXML
    public void btnComputeAction(){
        float from,result;
        if(cmbFrom.getValue().equals("Cordobas")){
            if(cmbTo.getValue().equals("Dolares"))
            from = Float.parseFloat(txtFrom.getText());
            
        }
        
    }
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        items = FXCollections.observableArrayList("Cordobas","Dolar","Euro");
        cmbFrom.setItems(items);
        cmbTo.setItems(items);
    }    
    
}
