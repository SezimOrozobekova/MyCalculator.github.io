package com.example.mycalculator;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController{

   Calculator calc = new Calculator();

   @FXML
   private TextField inputfield;

   @FXML
   protected void onButtonOneClick(){
      String val = inputfield.getText();
      inputfield.setText( val + "1" );
   }
   @FXML
   protected void onButtonTwoClick(){
      String val = inputfield.getText();
      inputfield.setText(val + "2" );
   }
   @FXML
   protected void onButtonPlusClick(){
      String val = inputfield.getText();
      inputfield.setText("");
      double d = Double.parseDouble(val); //convert val to double
      calc.setOperator('+');
      calc.setOperand1(d);
   }
   @FXML
   protected void onButtonEqualClick(){
      String val = inputfield.getText();
      inputfield.setText("");
      double d = Double.parseDouble(val); //convert val to double
      calc.setOperand2(d);
      calc.calculate();
      d = calc.getResult();
      inputfield.setText(Double.toString(d));
   }
}