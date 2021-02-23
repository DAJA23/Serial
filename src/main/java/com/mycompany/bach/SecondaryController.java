package com.mycompany.bach;

import java.io.IOException;
import javafx.fxml.FXML;
import java.io.IOException;
import javafx.fxml.FXML;
import javafx.event.ActionEvent;
import javafx.scene.control.TextField;
import javafx.scene.control.TextArea;
import javafx.scene.control.Label;

public class SecondaryController {
/*    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String no;
    public String on;
    public String tw;*/
    @FXML
    public TextField A;
    @FXML
    public TextField B;
    @FXML
    public TextField C;
    @FXML
    private TextField D;
    @FXML
    public TextField E;
    @FXML
    public TextField F;
    @FXML
    public TextField G;
    @FXML
    public TextField H;
    @FXML
    public TextField nom;
    @FXML
    public TextField one;
    @FXML
    public TextField two;
    @FXML
    public Label get;
    @FXML
   public void switchToPrimary(ActionEvent event) throws IOException {
            App.a = A.getText();
            App.b = B.getText();
            App.c = C.getText();
            App.d = D.getText();
            App.e = E.getText();
            App.f = F.getText();
            App.g = G.getText();
            App.h = H.getText();
            App.no = nom.getText();
            App.on = one.getText();
            App.tw = two.getText();
        if ((!App.no.isEmpty()) && (!App.on.isEmpty()) && (!App.tw.isEmpty()) && (!App.a.isEmpty()) && (!App.b.isEmpty()) && (!App.c.isEmpty()) && (!App.d.isEmpty()) && (!App.e.isEmpty()) && (!App.f.isEmpty()) && (!App.g.isEmpty()) &&(!App.h.isEmpty())){
                App.setRoot("First");
    }else {
        get.setText("Veuillez remplir");
    }
    public void switchToPrimary(ActionEvent event) throws IOException {
        App.setRoot("Phase1");
}

    }
/* public static String returnVal(){
            return App.a;
            return App.b;
            return App.c;
            return App.d;
            return App.e;
            return App.f;
            return App.g;
            return App.h;
            return App.on;
            return App.tw;
    }*/


}