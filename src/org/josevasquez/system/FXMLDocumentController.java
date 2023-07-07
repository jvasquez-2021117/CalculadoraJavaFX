/*
José Marcos Vásquez Román
Carnet: 2021117
Seccion: IN5AM
Fecha de creación: 21-03-2022
Fechas de Modificaciones: 02-04-2022
 */
package org.josevasquez.system;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 *
 * @author José Vásquez
 */
    public class FXMLDocumentController implements Initializable {
    
    double dato1, dato2, result=0, cont=0, contm=1;
    int opc;
    int a =0;
    
    
    @FXML
    private Button btnUno;
    
    @FXML
    private Button btnDos;
    
    @FXML
    private Button btnTres;
    
    @FXML
    private Button btnCuatro;
    
    @FXML
    private Button btnCinco;
    
    @FXML
    private Button btnSeis;
    
    @FXML
    private Button btnSiete;
    
    @FXML
    private Button btnOcho;
    
    @FXML
    private Button btnNueve;
    
    @FXML
    private Button btnCero;
    
    @FXML
    private Button btnPunto;
    
    @FXML
    private Button btnIgual;
    
    @FXML
    private Button btnMas;
    
    @FXML
    private Button btnMenos;
    
    @FXML
    private Button btnUnoEquis;
    
    @FXML
    private Button btnDivi;
    
    @FXML
    private Button btnCuadrado;
    
    @FXML
    private Button btnRaiz;
    
    @FXML
    private Button btnMulti;
    
    @FXML
    private Button btnPorcentaje;
    
    @FXML
    private Button btnCE;
    
    @FXML
    private Button btnC;
    
    @FXML
    private TextField txtPantalla;
    
    @FXML
    private Button btnMasMenos;
    
    @FXML
    private void evento(ActionEvent event){
        if(event.getSource()== btnUno){
            txtPantalla.setText(txtPantalla.getText()+"1");
        } else if (event.getSource()== btnDos){
            txtPantalla.setText(txtPantalla.getText()+"2");
        } else if (event.getSource()== btnTres){
            txtPantalla.setText(txtPantalla.getText()+"3");
        } else if (event.getSource()== btnCuatro) {
            txtPantalla.setText(txtPantalla.getText()+"4");
        } else if (event.getSource()== btnCinco){
            txtPantalla.setText(txtPantalla.getText()+"5");
        } else if (event.getSource()== btnSeis) {
            txtPantalla.setText(txtPantalla.getText()+"6");
        } else if  (event.getSource()== btnSiete) {
            txtPantalla.setText(txtPantalla.getText()+"7");
        } else if (event.getSource()== btnOcho) {
            txtPantalla.setText(txtPantalla.getText()+"8");
        } else if (event.getSource()== btnNueve) {
            txtPantalla.setText(txtPantalla.getText()+"9");
        } else if (event.getSource()== btnCero) {
            txtPantalla.setText(txtPantalla.getText()+"0");
        } else if (event.getSource()== btnMas) {
            dato1 = Double.parseDouble(txtPantalla.getText());
            cont = cont+dato1;
            txtPantalla.clear();
            opc = 1;
            btnPunto.setDisable(false);
        } else if (event.getSource()== btnMulti) {
            dato1 = Double.parseDouble(txtPantalla.getText());
            contm = contm*dato1;
            txtPantalla.clear();
            btnPunto.setDisable(false);
            opc = 2;
        } else if (event.getSource()== btnDivi) {
            dato1 = Double.parseDouble(txtPantalla.getText());
            txtPantalla.clear();
            opc = 3;
            btnPunto.setDisable(false);
        } else if (event.getSource()== btnMenos) {
            if(txtPantalla.getText().length()==0){
                txtPantalla.setText("-");
            } else{
                dato1 = Double.parseDouble(txtPantalla.getText());
                if(a>1){
                    cont = cont-dato1;
                    txtPantalla.clear();
                    opc = 4;
                } else{
                    cont = dato1-cont;
                    txtPantalla.clear();
                    opc = 4;
                    a=2;
                }
            }
            btnPunto.setDisable(false);
        } else if (event.getSource()== btnPunto) {
            if(txtPantalla.getText().length()==0){
                txtPantalla.setText("0.");
                btnPunto.setDisable(true);
            } else {
                txtPantalla.setText(txtPantalla.getText()+".");
                btnPunto.setDisable(true);
            }
        } else if (event.getSource()== btnRaiz) {
            dato1 = Double.parseDouble(txtPantalla.getText());
            txtPantalla.clear();
            result = Math.sqrt(dato1);
            txtPantalla.setText(String.valueOf(result));
            btnPunto.setDisable(false);
        } else if (event.getSource()== btnCuadrado) {
            dato1 = Double.parseDouble(txtPantalla.getText());
            txtPantalla.clear();
            result = Math.pow(dato1, 2);
            txtPantalla.setText(String.valueOf(result));  
            btnPunto.setDisable(false);
        } else if (event.getSource()== btnC) {
            dato1 = 0;
            dato2 = 0;
            result = 0;
            cont = 0;
            contm = 1;
            a=0;
            txtPantalla.clear();
            btnPunto.setDisable(false);
        } else if (event.getSource()== btnUnoEquis) {
            dato1 = Double.parseDouble(txtPantalla.getText());
            txtPantalla.clear();
            result = 1/dato1;
            txtPantalla.setText(String.valueOf(result));
            btnPunto.setDisable(false);
        } else if (event.getSource()== btnPorcentaje) {
            dato2 = Double.parseDouble(txtPantalla.getText());
            dato2 = contm*dato2/100 ;
            txtPantalla.clear();
            txtPantalla.setText(String.valueOf(dato2));
            btnPunto.setDisable(false);
        } else if (event.getSource()== btnMasMenos) {
            dato1 = Double.parseDouble(txtPantalla.getText());
            result=-1*dato1;
            txtPantalla.setText(String.valueOf(result));
            btnPunto.setDisable(false);
        } else if (event.getSource()== btnCE) {
            String cadena;
            cadena = txtPantalla.getText();
            if(cadena.length()>0){
            cadena=cadena.substring(0, cadena.length()-1);
            txtPantalla.setText(cadena);
        }
            btnPunto.setDisable(false);
        } else if (event.getSource()== btnIgual) {
            dato2 = Double.parseDouble(txtPantalla.getText());
            txtPantalla.clear();
           switch(opc){
               case 1: result = cont + dato2;
                        cont = 0;
                       txtPantalla.setText(String.valueOf(result));
                    break;
               case 2: result= contm * dato2;
                       contm=1;
                       txtPantalla.setText(String.valueOf(result));
                       
                    break;
               case 3:  
                       result = dato1 / dato2;
                       txtPantalla.setText(String.valueOf(result));
                    break;
               case 4: result = cont - dato2;
                       
                       txtPantalla.setText(String.valueOf(result));
                       cont = 0;
                       a=0;
                    break;
               default: txtPantalla.setText(String.valueOf(dato2));
             }
           
        }   
    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
