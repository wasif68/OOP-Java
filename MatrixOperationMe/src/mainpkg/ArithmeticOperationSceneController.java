/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package mainpkg;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author Hp
 */
public class ArithmeticOperationSceneController implements Initializable {

    @FXML
    private TextField xTextField;
    @FXML
    private TextField yTextField;
    @FXML
    private Button SubtractButton;
    @FXML
    private Label ResultLabel;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    


    @FXML private void AddButtonOnClick(MouseEvent event) 
    {
        String xStr,yStr,resultStr;
        xStr=xTextField.getText();
        yStr=yTextField.getText();
        int xVal,yVal,resultVal;
        xVal = Integer.parseInt(xStr);
        yVal = Integer.parseInt(yStr);
        resultVal=xVal+yVal;
        resultStr = Integer.toString(resultVal); 
        ResultLabel.setText(resultStr);    
    }

    @FXML
    private void SubtractButtonOnMouseEntered(MouseEvent event) 
    {
        String xStr,yStr,resultStr;
        xStr=xTextField.getText();
        yStr=yTextField.getText();
        int xVal,yVal,resultVal;
        xVal = Integer.parseInt(xStr);
        yVal = Integer.parseInt(yStr);
        resultVal=xVal-yVal;
        resultStr = Integer.toString(resultVal); 
        ResultLabel.setText(resultStr);  
    }

    @FXML private void SubtractButtonOnClick(ActionEvent event) 
    {
        SubtractButton.setText("Click to Subtract");  
    }

    @FXML private void MudulousButtonOnClick(ActionEvent event) 
    {
        
    }
    
}
