/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cobaproyek1;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author Asus
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private Button Button2;
    @FXML
    private Label judul;
    @FXML
    private Label lnama;
    @FXML
    private TextField editnama;
    @FXML
    private Label lalamat;
    @FXML
    private TextField editalamat;
    @FXML
    private Label Lberat;
    @FXML
    private TextField editberat;
    @FXML
    private Label LTelepon;
    @FXML
    private TextField edittelepon;
    @FXML
    private Label LPaket;
    @FXML
    private RadioButton rdCK;
    @FXML
    private ToggleGroup PilihanPaket;
    @FXML
    private RadioButton rdCKS;
    @FXML
    private RadioButton rdS;
    @FXML
    private TextArea textKonfirmasi;
    @FXML
    private Button ButtonHapus;
    @FXML
    private Label judul1;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void Klikkedua(MouseEvent event) {
    }

    @FXML
    private void Klikkedua(ActionEvent event) {
    }

    @FXML
    private void hapusIsian(ActionEvent event) {
    }
    
}
