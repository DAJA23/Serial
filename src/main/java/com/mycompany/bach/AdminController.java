/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.bach;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import java.io.IOException;
import javafx.event.ActionEvent;

/**
 * FXML Controller class
 *
 * @author DAJA 23
 */
public class AdminController implements Initializable {
    @FXML
    public Label V;
    @FXML
    public Button cinq;
    @FXML
    public Button zero;
    @FXML
    public Label point1;
    /*App.p1=0;*/
    public void ajouter5(ActionEvent event) throws IOException {
        App.p1=App.p1+5;
}

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        App.v="Phase 1";
        point1.setText(Integer.toString(App.p1));
    }

}
