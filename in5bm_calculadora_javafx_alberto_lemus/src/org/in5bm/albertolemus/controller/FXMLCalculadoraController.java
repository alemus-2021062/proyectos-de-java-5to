package org.in5bm.albertolemus.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import javafx.fxml.FXML;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import org.in5bm.albertolemus.bean.*;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author Alberto Moisés Gerardo Lemus Alvarado
 * @date 22/3/2022
 * @Carne 2021062
 * @CodigoTecnico IN5BM
 */
public class FXMLCalculadoraController implements Initializable {

    private float resultado;
    private float numero;
    private int contadorOperadores;
    private String operadorAnterior;
    private boolean ingresoNuevo;

    @FXML
    private Label lblPantalla;

    @FXML
    private Button btnPunto;

    @FXML
    private Button btnLimpiar;

    @FXML
    private Button btnSuma;

    @FXML
    private Button btnResta;

    @FXML
    private Button btnMultiplicacion;

    @FXML
    private Button btnDivision;

    @FXML
    private Button btnInversoAditivo;

    @FXML
    private Button btnPorcentaje;

    @FXML
    private Button btnReciproco;

    @FXML
    private Button btnRaizCuadrada;

    @FXML
    private Button btnPotencia;

    @FXML
    private Button btnIgual;

    @FXML
    private Button btnDell;

    @FXML
    private Button btnCero;

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

    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }

    @FXML
    private void clicNumero(ActionEvent event) {
        if (event.getSource().equals(btnUno))
        {
            actualizarPantalla("1");
        } else if (event.getSource().equals(btnDos))
        {
            actualizarPantalla("2");
        } else if (event.getSource().equals(btnTres))
        {
            actualizarPantalla("3");
        } else if (event.getSource().equals(btnCuatro))
        {
            actualizarPantalla("4");
        } else if (event.getSource().equals(btnCinco))
        {
            actualizarPantalla("5");
        } else if (event.getSource().equals(btnSeis))
        {
            actualizarPantalla("6");
        } else if (event.getSource().equals(btnSiete))
        {
            actualizarPantalla("7");
        } else if (event.getSource().equals(btnOcho))
        {
            actualizarPantalla("8");
        } else if (event.getSource().equals(btnNueve))
        {
            actualizarPantalla("9");
        } else if (event.getSource().equals(btnCero))
        {
            try
            {
                agregarCero();
            } catch (NumberFormatException e)
            {
                lblPantalla.setText("0");
            }
        }

    }

    public void agregarCero() {
        float num = Float.parseFloat(lblPantalla.getText());
        if (ingresoNuevo)
        {
            lblPantalla.setText(" ");
        }
        String cadena = lblPantalla.getText();
        if (cadena.length() <= 0)
        {
            lblPantalla.setText("0");
            ingresoNuevo = false;
        } else if (!lblPantalla.getText().contains("0"))
        {
            actualizarPantalla("0");
        } else if (num != 0)
        {
            actualizarPantalla("0");
            ingresoNuevo = false;
        } else if (lblPantalla.getText().equals("0."))
        {
            actualizarPantalla("0");
        }
    }

    @FXML
    private void clicOperadores(ActionEvent event) {
        try
        {
            if (event.getSource().equals(btnSuma))
            {
                calcular("+");
            } else if (event.getSource().equals(btnResta))
            {
                calcular("-");
            } else if (event.getSource().equals(btnMultiplicacion))
            {
                calcular("*");
            } else if (event.getSource().equals(btnDivision))
            {
                calcular("÷");
            } else if (event.getSource().equals(btnReciproco))
            {
                contadorOperadores++;
                resultado = 1;
                operadorAnterior = "1/x";
                calcular("");
                lblPantalla.setText(String.valueOf(resultado));
            } else if (event.getSource().equals(btnPotencia))
            {
                contadorOperadores++;
                resultado = 1;
                operadorAnterior = "x²";
                calcular("");
                ingresoNuevo = false;
                lblPantalla.setText(String.valueOf(resultado));
            } else if (event.getSource().equals(btnRaizCuadrada))
            {
                contadorOperadores++;
                resultado = 1;
                operadorAnterior = "√";
                calcular("");
                ingresoNuevo = false;
                lblPantalla.setText(String.valueOf(resultado));
            } else if (event.getSource().equals(btnInversoAditivo))
            {
                contadorOperadores++;
                resultado = 1;
                operadorAnterior = "±";
                calcular("");
                ingresoNuevo = false;
                lblPantalla.setText(String.valueOf(resultado));
            } else if (event.getSource().equals(btnPorcentaje))
            {
                calcular("%");
            }
        } catch (Exception e)
        {
        }
    }

    @FXML
    private void clicIgual(ActionEvent event) {
        calcular(this.operadorAnterior);
        lblPantalla.setText(String.valueOf(this.resultado));
        operadorAnterior = "";
    }

    @FXML
    private void clicDell(ActionEvent event) {
        String borrar;
        borrar = lblPantalla.getText();
        if (borrar.length() > 0)
        {
            borrar = borrar.substring(0, borrar.length() - 1);
            lblPantalla.setText(borrar);
        }

    }

    @FXML
    private void clicPunto(ActionEvent event) {
        agregarPunto();
    }

    public void agregarPunto() {

        if (ingresoNuevo)
        {
            lblPantalla.setText(" ");
        }
        String agrePunto = lblPantalla.getText();
        if (agrePunto.length() <= 0)
        {
            lblPantalla.setText("0.");
            ingresoNuevo = false;
        } else if (!(lblPantalla.getText().contains(".")))
        {
            actualizarPantalla(".");
        }
    }

    @FXML
    private void clicLimpiar(ActionEvent event) {
        limpiarPantalla();
        resultado = 0;
        numero = 0;
        contadorOperadores = 0;
        operadorAnterior = " ";
        ingresoNuevo = false;
    }

    private void limpiarPantalla() {
        lblPantalla.setText(" ");
    }

    private void actualizarPantalla(String digito) {
        if (ingresoNuevo)
        {
            lblPantalla.setText("");
        }
        lblPantalla.setText(lblPantalla.getText().concat(digito));
        ingresoNuevo = false;
    }

    //------------------------------METODO CALCULAR---------------------------------------
    private void calcular(String operador) {
        contadorOperadores++;
        if (contadorOperadores == 1)
        {
            this.resultado = Float.parseFloat(lblPantalla.getText());
        } else if (contadorOperadores >= 2)
        {
            if (!(lblPantalla.getText().trim().equals("")))
            {
                if (ingresoNuevo == false)
                {
                    String strPantalla = lblPantalla.getText();
                    this.numero = Float.parseFloat(strPantalla);
                    contadorOperadores++;
                    Operacion calc = null;
                    switch (operadorAnterior)
                    {
                        case "+":
                            calc = new Suma();
                            this.resultado = calc.operar(resultado, numero);
                            break;

                        case "-":
                            calc = new Resta();
                            this.resultado = calc.operar(resultado, numero);
                            break;
                        case "*":
                            calc = new Multiplicacion();
                            this.resultado = calc.operar(resultado, numero);
                            break;
                        case "÷":
                            calc = new Division();
                            this.resultado = calc.operar(resultado, numero);
                            break;
                        case "%":
                            calc = new Porcentaje();
                            this.resultado = calc.operar(resultado, numero);
                            break;
                        case "±":
                            calc = new InversoAditivo();
                            this.resultado = calc.operar(numero, -1);
                            break;
                        case "1/x":
                            calc = new Reciproco();
                            resultado = calc.operar(1, numero);
                            break;
                        case "√":
                            calc = new RaizCuadrada();
                            resultado = calc.operar(numero, 0.5f);
                            break;
                        case "x²":
                            calc = new Potencia();
                            this.resultado = calc.operar(numero, 2);
                            break;
                        default:
                            lblPantalla.setText("opcion invalida");
                            break;
                    }
                }

            }

        }
        lblPantalla.setText(String.valueOf(resultado));
        this.operadorAnterior = operador;
        limpiarPantalla();
    }

    @FXML
    private void cerrar() {
        System.exit(0);
    }

    @FXML
    private void acercaDe() {
        JOptionPane.showMessageDialog(null, "autor: Alberto Moisés Gerardo Lemus Alvarado\n"
                + "Nombre: Calculadora Moises\n"
                + "sistema: Windows10/Windows 11 pro max version 0.0.1\n"
                + "Hecho en: Guatemala\n"
                + "Carne: 2021062\n"
                + "Codigo: IN5BM\n"
                + "Fecha de creacion: 21/03/2022");
    }
}
