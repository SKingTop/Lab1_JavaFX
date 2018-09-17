/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project1;

import java.awt.Component;
//import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javax.swing.JOptionPane;


/**
 *
 * @author student
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Button Button_Math;
    @FXML
    private Button Button_Clear;
    @FXML
    private Button Button_Exit;
    @FXML
    private Label label_a;
    @FXML
    private Label label_b;
    @FXML
    private Label label_x;
    @FXML
    private Label label_otvet;
    @FXML
    private TextField TextField_A;
    @FXML
    private TextField TextField_B;
    @FXML
    private TextField TextField_X;
    @FXML
    private Label label_d;
    @FXML
    private TextField TextField_D;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void ButtonMathAction(ActionEvent event) {
        
        double a,b,x,d,y;
        try {
        a = Double.parseDouble(TextField_A.getText());
        b = Double.parseDouble(TextField_B.getText());
        x = Double.parseDouble(TextField_X.getText());
        d = Double.parseDouble(TextField_D.getText());
    } catch (Exception ex) {
        Toolkit.getDefaultToolkit().beep();
            Component rootPane = null;
        JOptionPane.showMessageDialog(rootPane, "Ошибка введенных данных!", "Ошибка ввода",
                    JOptionPane.ERROR_MESSAGE);
        TextField_A.requestFocus();
            label_otvet.setText("В введенных значениях допущены ошибки");
            TextField_A.setText("");
            TextField_B.setText("");
            TextField_X.setText("");
            return;
    }
        if (x<6) {
            y = (((a+b)*(a+b))/(x-2));
            //label_otvet.setText("Ответ: " + String.format("%.2f",y));
        } else {
            y = ((x*(d*d*d))+(b*b));
            //label_otvet.setText("Ответ: " + String.format("%.2f",y));
        }
         if (!(Double.isNaN(y)) && (!Double.isInfinite(y))) {
                label_otvet.setText("Ответ: " + String.format("%.2f",y));
            } else {
                label_otvet.setText("Ответ: Нет ответа");
            }
    }
    @FXML
    private void ButtonClearAction(ActionEvent event) {
        label_otvet.setText("Ответ: ");
        TextField_A.setText("");
        TextField_B.setText("");
        TextField_X.setText("");
        TextField_D.setText("");
    }

    @FXML
    private void ButtonExitAction(ActionEvent event) {
        System.exit(0);
    }

    
}
