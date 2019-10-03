/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxinchtocenti;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author jasonbakker
 */
public class FXMLDocumentController implements Initializable {
    private Converter converter;
    
    @FXML
    private Label label;
    
    @FXML
    private TextField inputInches, outPutCenti;
    private double inches, centimeter, result;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {

    try{
//      this.centimeter = Double.parseDouble(this.inputInches.getText());
      this.inches = Double.parseDouble(this.inputInches.getText());
      this.centimeter = Double.parseDouble(this.outPutCenti.getText());
      this.converter = new Converter(this.inches, this.centimeter, this.result);
      this.label.setText(this.converter.convert());
    
        
    }
    catch (Exception e) {
        this.outPutCenti.setText("U dient een getal in te vullen!");
    }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
