/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.bach;

import com.mycompany.bach.SecondaryController.*;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.scene.control.TextArea;

/**
 * FXML Controller class
 *
 * @author DAJA 23
 */
public class FirstController implements Initializable {
    @FXML
    public Label I;
    @FXML
    public Label J;
    @FXML
    public Label K;
    @FXML
    public Label L;
    @FXML
    public Label M;
    @FXML
    public Label N;
    @FXML
    public Label O;
    @FXML
    public Label P;
    @FXML
    public Label Q;
    @FXML
    public Label R;
    @FXML
    public Label S;
    @FXML
    public Label T;
    @FXML
    public Label U;
    @FXML
    public Label V;


/*}*/

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        I.setText(App.on);
        J.setText(App.tw);
        K.setText(App.a);
        L.setText(App.b);
        M.setText(App.c);
        N.setText(App.d);
        O.setText(App.e);
        P.setText(App.f);
        Q.setText(App.g);
        R.setText(App.h);
        U.setText(App.no);
        V.setText(App.v);
        // TODO
    }

}